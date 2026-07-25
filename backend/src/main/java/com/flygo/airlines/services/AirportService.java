package com.flygo.airlines.services;
import com.flygo.airlines.dtos.AirportDTO;
import com.flygo.airlines.dtos.Response;

import java.util.List;

public interface AirportService {

    Response<?> createAirport(AirportDTO airportDTO);

    Response<?> updateAirport(AirportDTO airportDTO);

    Response<List<AirportDTO>> getAllAirports();

    Response<AirportDTO> getAirportById(Long id);

}
