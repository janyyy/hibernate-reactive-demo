package com.example.repository;



import com.example.entity.Test2;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

/**
 * (Test2)数据库交互
 *
 * @author yujianyou
 * @since 2022-02-21 09:53:11
 */
@ApplicationScoped
public class Test2Repository implements PanacheRepository<Test2> {

}
