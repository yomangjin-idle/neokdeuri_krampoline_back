package com.example.kakao.service;

import com.example.kakao.dto.response.TourDetailResponse;
import com.example.kakao.dto.response.TourListResponse;
import com.example.kakao.dto.response.TourSpeakResponse;

import java.util.List;

public interface TourService {
    List<TourListResponse> getTourList();
    TourDetailResponse getTourDetail(int tourId);
    TourSpeakResponse getTourSpeak(int tourId);
}
