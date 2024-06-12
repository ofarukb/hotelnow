package com.tobeto.java4a.hotelnow.services.dtos.requests.mainfacilityselections;

import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddMainFacilitySelectionRequest {

    private boolean display;

    @Min(value = 1)
    private int optionId;

}
