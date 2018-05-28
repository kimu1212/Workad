package com.example.workad.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "work")
public class Clerk implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer gender;  /* 男 : 0, 女 : 1 */

    @Column(nullable = false)
    private Integer hopingOffDays; /* 希望なし : 0, 希望あり : 1*/

    @Column(nullable = false)
    private Integer hopingEL; /* 希望なし : 0, 早 : 1, 遅 : 2*/

    private Integer minDays; /* 最低希望日数 */

}
