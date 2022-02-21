package com.example.repository;



import com.example.entity.Test1;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * (Test1)数据库交互
 *
 * @author yujianyou
 * @since 2022-02-21 09:53:10
 */
@ApplicationScoped
public class Test1Repository implements PanacheRepository<Test1> {

}
