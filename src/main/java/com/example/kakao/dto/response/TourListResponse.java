package com.example.kakao.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TourListResponse {
    private Integer id;
    private Double x;
    private Double y;
    private String address;
    private String name;
    
    @Builder
    public TourListResponse(Integer id, Double x, Double y, String address, String imgPath, String name) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.address = address;
        this.name = name;
    }
}
