package com.tobeto.java4a.hotelnow.services.dtos.requests.roomtypefacilitydetailoptions;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoomTypeFacilityDetailOptionRequest {

    @NotBlank
    @Size(min = 2, max = 100)
    private String description;

    @Min(value = 1)
    private int categoryId;
}
