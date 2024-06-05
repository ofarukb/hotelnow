package com.tobeto.java4a.hotelnow.services.abstracts;

import com.tobeto.java4a.hotelnow.services.dtos.requests.hotelimages.AddHotelImageRequest;
import com.tobeto.java4a.hotelnow.services.dtos.responses.hotelimages.AddHotelImageResponse;
import com.tobeto.java4a.hotelnow.services.dtos.responses.hotelimages.ListHotelImageResponse;

import java.util.List;

public interface HotelImageService {

    AddHotelImageResponse add(AddHotelImageRequest request);
    void delete(int id);
    List<ListHotelImageResponse> getByHotelId(int hotelId);
}