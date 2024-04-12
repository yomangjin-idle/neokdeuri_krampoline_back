package com.example.kakao.entity;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "near_tour")
public class NearTour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tour_id")
    private Tour tour;
    private String content;
    private String address;
    private Integer dis;
    private String imgPath;
}
