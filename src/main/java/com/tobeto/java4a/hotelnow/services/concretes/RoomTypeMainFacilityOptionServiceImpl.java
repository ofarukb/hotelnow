package com.tobeto.java4a.hotelnow.services.concretes;

import com.tobeto.java4a.hotelnow.entities.concretes.RoomTypeMainFacilityCategory;
import com.tobeto.java4a.hotelnow.entities.concretes.RoomTypeMainFacilityOption;
import com.tobeto.java4a.hotelnow.repositories.RoomTypeMainFacilityOptionRepository;
import com.tobeto.java4a.hotelnow.services.abstracts.RoomTypeMainFacilityCategoryService;
import com.tobeto.java4a.hotelnow.services.abstracts.RoomTypeMainFacilityOptionService;
import com.tobeto.java4a.hotelnow.services.dtos.requests.roomtypemainfacilityoptions.AddRoomTypeMainFacilityOptionRequest;
import com.tobeto.java4a.hotelnow.services.dtos.requests.roomtypemainfacilityoptions.UpdateRoomTypeMainFacilityOptionRequest;
import com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypemainfacilityoptions.AddRoomTypeMainFacilityOptionResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypemainfacilityoptions.ListRoomTypeMainFacilityOptionResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.roomtypemainfacilityoptions.UpdateRoomTypeMainFacilityOptionResponse;
import com.tobeto.java4a.hotelnow.services.mappers.RoomTypeMainFacilityOptionMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class RoomTypeMainFacilityOptionServiceImpl implements RoomTypeMainFacilityOptionService {

    private final RoomTypeMainFacilityOptionRepository roomTypeMainFacilityOptionRepository;
    private final RoomTypeMainFacilityCategoryService roomTypeMainFacilityCategoryService;





    @Override
    public ListRoomTypeMainFacilityOptionResponse getResponseById(int id) {
        RoomTypeMainFacilityOption roomTypeMainFacilityOption = roomTypeMainFacilityOptionRepository.findById(id).orElseThrow();
        return RoomTypeMainFacilityOptionMapper.INSTANCE.listResponseFromRoomTypeMainFacilityOption(roomTypeMainFacilityOption);
    }

    @Override
    public List<ListRoomTypeMainFacilityOptionResponse> getByCategoryId(int categoryId) {

        return roomTypeMainFacilityOptionRepository.findByCategoryId(categoryId).stream()
                .map(RoomTypeMainFacilityOptionMapper.INSTANCE::listResponseFromRoomTypeMainFacilityOption)
                .collect(Collectors.toList());
    }

    @Override
    public AddRoomTypeMainFacilityOptionResponse add(AddRoomTypeMainFacilityOptionRequest request) {
        RoomTypeMainFacilityOption roomTypeMainFacilityOption = RoomTypeMainFacilityOptionMapper.INSTANCE.roomTypeMainFacilityOptionFromAddRequest(request);

        RoomTypeMainFacilityCategory  categories = roomTypeMainFacilityCategoryService.getById(request.getCategoryId());

        roomTypeMainFacilityOption.setRoomTypeMainFacilityCategory(categories);

        RoomTypeMainFacilityOption savedRoomTypeMainFacilityOption = roomTypeMainFacilityOptionRepository.save(roomTypeMainFacilityOption);

        return RoomTypeMainFacilityOptionMapper.INSTANCE.addResponseFromTypeFacilityOption(savedRoomTypeMainFacilityOption);
    }

    @Override
    public UpdateRoomTypeMainFacilityOptionResponse update(UpdateRoomTypeMainFacilityOptionRequest request) {
        RoomTypeMainFacilityOption roomTypeMainFacilityOption = RoomTypeMainFacilityOptionMapper.INSTANCE.roomTypeMainFacilityOptionFromUpdateRequest(request);

        RoomTypeMainFacilityOption savedRoomTypeMainFacilityOption = roomTypeMainFacilityOptionRepository.save(roomTypeMainFacilityOption);

        return RoomTypeMainFacilityOptionMapper.INSTANCE.updateResponseFromRoomTypeMainFacilityOption(savedRoomTypeMainFacilityOption);
    }

    @Override
    public void delete(int id) {
        roomTypeMainFacilityOptionRepository.deleteById(id);
    }
}
