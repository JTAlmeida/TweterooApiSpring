package com.api.tweteroo.dto;

import jakarta.validation.constraints.NotBlank;

public record UsersDTO(
        @NotBlank String username,

        @NotBlank String avatar) {

}
