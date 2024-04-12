package com.example.kakao.repository;

import com.example.kakao.entity.NearTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NearTourRepository extends JpaRepository<NearTour, Integer> {
     List<NearTour> findByTourId(int tourId);
}
