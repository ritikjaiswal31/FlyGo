package com.flygo.airlines.services;

import com.flygo.airlines.dtos.CreateFlightRequest;
import com.flygo.airlines.dtos.FlightDTO;
import com.flygo.airlines.dtos.Response;
import com.flygo.airlines.enums.City;
import com.flygo.airlines.enums.Country;
import com.flygo.airlines.enums.FlightStatus;

import java.time.LocalDate;
import java.util.List;

public interface FlightService {

    Response<?> createFlight(CreateFlightRequest createFlightRequest);
    Response<FlightDTO> getFlightById(Long id);
    Response<List<FlightDTO>> getAllFlights();
    Response<?> updateFlight(CreateFlightRequest createFlightRequest);
    Response<List<FlightDTO>> searchFlight(String departurePortIata, String arrivalPortIata, FlightStatus status, LocalDate departureDate);
    Response<List<City>> getAllCities();
    Response<List<Country>> getAllCountries();

}
