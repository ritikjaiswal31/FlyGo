package com.flygo.airlines.dtos;


import com.flygo.airlines.enums.City;
import com.flygo.airlines.enums.Country;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportDTO {

    private Long id;

    @NotBlank(message = "name is required")
    private String name;

    @NotNull(message = " City is required")
    private City city;

    @NotNull(message = "Country is required")
    private Country country;

    @NotBlank(message = "Iata Code is required")
    private String iataCode;

}
