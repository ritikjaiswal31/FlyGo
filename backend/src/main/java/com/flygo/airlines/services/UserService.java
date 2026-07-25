package com.flygo.airlines.services;
import com.flygo.airlines.dtos.Response;
import com.flygo.airlines.dtos.UserDTO;
import com.flygo.airlines.entities.User;

import java.util.List;

public interface UserService {

    User currentUser();

    Response<?> updateMyAccount(UserDTO userDTO);

    Response<List<UserDTO>> getAllPilots();

    Response<UserDTO> getAccountDetails();
}
