package com.example;

import com.example.entity.Test3;
import io.quarkus.runtime.StartupEvent;
import org.hibernate.reactive.mutiny.Mutiny;

import javax.enterprise.event.Observes;
import javax.inject.Inject;

/**
 * @author yujianyou
 * @date 2022/2/21 9:41
 * @email 597907730@qq.com
 */
public class TestInit {

    @Inject
    Mutiny.SessionFactory sessionFactory;




    public void onStart(@Observes StartupEvent event) {
        sessionFactory.withStatelessSession(s -> s.createNativeQuery(getQuerySql(), Test3.class).getResultList().invoke(item -> System.out.println(item))).await().indefinitely();
    }

    private String getQuerySql() {
        return "select t1.id,t1.track_number trackNumber,t1.op_time test1Time,t1.op_location test1Location,t2.op_time test2Time,t2.op_location test2Location from test1 t1 left join test2 t2 on t1.track_number = t2.track_number";
    }


}
