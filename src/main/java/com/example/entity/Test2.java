package com.example.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * (Test2)实体类
 *
 * @author yujianyou
 * @since 2022-02-21 09:53:11
 */

@Data
@Entity
@Table(name = "test2")
public class Test2 {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "op_time")
    private Date opTime;

    @Column(name = "op_location")
    private String opLocation;

    @Column(name = "op_code")
    private Integer opCode;

    @Column(name = "track_number")
    private String trackNumber;


}

