package com.tobeto.java4a.hotelnow.services.dtos.requests.users;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {

    @NotBlank
    @Size(min = 2, max = 100)
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 100)
    private String lastName;

    @NotBlank
    @Pattern(regexp = "^$|[0-9]{10}")
    private String phone;

    @NotBlank
    @Email
    @Size(min = 6, max = 100)
    private String email;

    @NotBlank
    @Size(min = 6)
    private String password;

    @NotBlank
    private LocalDate birthDate;

}
