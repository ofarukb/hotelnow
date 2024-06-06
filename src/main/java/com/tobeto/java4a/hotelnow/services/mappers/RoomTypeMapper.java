package com.tobeto.java4a.hotelnow.services.mappers;

import com.tobeto.java4a.hotelnow.entities.concretes.RoomType;
import com.tobeto.java4a.hotelnow.services.dtos.requests.roomtypes.AddRoomTypeRequest;
import com.tobeto.java4a.hotelnow.services.dtos.requests.roomtypes.UpdateRoomTypeRequest;
import com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypes.AddRoomTypeResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypes.ListRoomTypeResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypes.UpdateRoomTypeResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomTypeMapper {

    RoomTypeMapper INSTANCE = Mappers.getMapper(RoomTypeMapper.class);

    @Mapping(target = "roomTypeImages", source = "roomTypeImages")
    @Mapping(target = "roomTypeMainFacilityDetailSelections", source = "roomTypeMainFacilityDetailSelections")
    @Mapping(target = "rooms", source = "rooms")
    ListRoomTypeResponse listResponseFromRoomType(RoomType roomType);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "hotel", ignore = true)
    @Mapping(target = "roomTypeImages", ignore = true)
    @Mapping(target = "rooms", ignore = true)
    @Mapping(target = "bookedRoomTypes", ignore = true)
    @Mapping(target = "roomTypeMainFacilityDetailSelections", source = "roomTypeMainFacilitySelections")
    RoomType roomTypeFromAddRequest(AddRoomTypeRequest request);

    AddRoomTypeResponse addResponseFromRoomType(RoomType roomType);

    @Mapping(target = "hotel", ignore = true)
    @Mapping(target = "roomTypeImages", ignore = true)
    @Mapping(target = "rooms", ignore = true)
    @Mapping(target = "bookedRoomTypes", ignore = true)
    @Mapping(target = "roomTypeMainFacilityDetailSelections", source = "roomTypeMainFacilitySelections")
    RoomType roomTypeFromUpdateRequest(UpdateRoomTypeRequest request);

    UpdateRoomTypeResponse updateResponseFromRoomType(RoomType room);
}