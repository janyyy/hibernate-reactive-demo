package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * (Test3)实体类
 *
 * @author yujianyou
 * @since 2022-02-21 09:53:11
 */

@Data
@Entity
@Table(name = "test3")
public class Test3{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "track_number")
    private String trackNumber;

    @Column(name = "test1_time")
    private Date test1Time;

    @Column(name = "test1_location")
    private String test1Location;

    @Column(name = "test2_time")
    private Date test2Time;

    @Column(name = "test2_location")
    private String test2Location;


}

