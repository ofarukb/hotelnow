package com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypeimages;

import com.tobeto.java4a.hotelnow.services.dtos.responses.images.ListImageResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoomTypeImageResponse {

    private int roomTypeId;

    private List<ListImageResponse> photos;
}
