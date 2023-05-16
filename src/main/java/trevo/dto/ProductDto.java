package trevo.dto;

import jakarta.validation.constraints.NotEmpty;

public record ProductDto(
        @NotEmpty(message = "O campo de nome não pode estar vazio")
        String name,

        @NotEmpty(message = "o campo não pode estar vazio")
        String description,

        String culture,

        String area
        ) {
}
