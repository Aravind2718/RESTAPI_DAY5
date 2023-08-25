package com.example.demo.Repository1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model1.HotelModel;

public interface HotelRepo extends JpaRepository<HotelModel,Integer>{

}
