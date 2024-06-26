package com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypefacilitydetailoptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoomTypeFacilityDetailOptionResponse {

    private int id;

    private String description;

    private int categoryId;
}
