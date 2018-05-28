package com.example.workad.Entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Employee implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer gender; /* 男 : 0, 女 : 1 */

    @Column(nullable = false)
    private Integer state; /* なし : 0, 早 : 1, 遅 : 2 */

}
