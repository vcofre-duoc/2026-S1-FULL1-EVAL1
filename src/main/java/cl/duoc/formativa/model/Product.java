package cl.duoc.formativa.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @NotNull(message = "El id no puede ser nulo")
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacio")
    private String name;

    @NotNull(message = "El precio no puede ser nulo")
    private Double price;

}
