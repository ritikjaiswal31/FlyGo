package com.flygo.airlines.services;

import com.flygo.airlines.dtos.LoginRequest;
import com.flygo.airlines.dtos.LoginResponse;
import com.flygo.airlines.dtos.RegistrationRequest;
import com.flygo.airlines.dtos.Response;

public interface AuthService {

    Response<?> register(RegistrationRequest registrationRequest);
    Response<LoginResponse> login(LoginRequest loginRequest);
}
