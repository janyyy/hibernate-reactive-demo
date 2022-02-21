package com.example.repository;



import com.example.entity.Test3;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * (Test3)数据库交互
 *
 * @author yujianyou
 * @since 2022-02-21 09:53:11
 */
@ApplicationScoped
public class Test3Repository implements PanacheRepository<Test3> {

}
