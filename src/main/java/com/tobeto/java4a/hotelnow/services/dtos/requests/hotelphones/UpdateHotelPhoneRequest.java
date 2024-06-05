package com.tobeto.java4a.hotelnow.services.dtos.requests.hotelphones;

import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateHotelPhoneRequest {

    @Pattern(regexp = "^$|[0-9]{10}")
    private String phone;

}