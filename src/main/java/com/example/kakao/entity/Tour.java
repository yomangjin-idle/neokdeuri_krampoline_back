package com.example.kakao.entity;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(name = "tour")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double latitude;
    private Double longitude;
    private String outline;
    @Column(columnDefinition = "TEXT")
    private String content;
    private String address;
    @OneToMany(mappedBy = "tour")
    private List<Image> images;
    @OneToMany(mappedBy = "tour")
    private List<NearTour> nearTours;
    private String speakFilePath;
    @Column(columnDefinition = "TEXT")
    private String script;
}
