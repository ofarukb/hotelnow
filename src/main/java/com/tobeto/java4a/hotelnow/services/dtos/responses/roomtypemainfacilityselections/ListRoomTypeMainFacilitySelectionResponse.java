package com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypemainfacilityselections;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListRoomTypeMainFacilitySelectionResponse {

    private int id;

    private String categoryName;

    private String description;
}