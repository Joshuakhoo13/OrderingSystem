package com.example.OrderingSystem.customer.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

// no need for constructor as Jackson automatically creates the dto object from json fields in the
// request body of the HTTP post endpoint
@Getter
@NoArgsConstructor
public class CustomerCreateDto {
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String fullName;

    @NotBlank
    private String phone;
}
