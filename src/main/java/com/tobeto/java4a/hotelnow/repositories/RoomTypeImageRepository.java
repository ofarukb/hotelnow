package com.tobeto.java4a.hotelnow.repositories;

import com.tobeto.java4a.hotelnow.entities.concretes.RoomTypeImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomTypeImageRepository extends JpaRepository<RoomTypeImage, Integer> {

    List<RoomTypeImage> findByRoomTypeId(int roomTypeId);
}
