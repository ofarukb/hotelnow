package com.tobeto.java4a.hotelnow.services.dtos.responses.hotels;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddHotelResponse {
    private int id;

    private String name;

    private byte stars;

}
