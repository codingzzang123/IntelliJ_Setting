package com.ho.test.entity.main;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="BOARD")
@AllArgsConstructor @Setter @Getter
public class Board {

    @Id
    @SequenceGenerator(name="seq", sequenceName="SEQ_BOARD", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
    @Column(name = "no")
    private Integer no;

    private String name;
    private String cate;
    private String title;
    private String content;

    private Date regdate;

    private long views;
    private long likes;

    private String imgo;
    private String imgs;

    private long replys;

    protected Board(){}


}
