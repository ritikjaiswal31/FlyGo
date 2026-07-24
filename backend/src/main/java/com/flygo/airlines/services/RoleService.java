package com.flygo.airlines.services;

import com.flygo.airlines.dtos.Response;
import com.flygo.airlines.dtos.RoleDTO;

import java.util.List;

public interface RoleService {
    Response<?> createRole(RoleDTO roleDTO);
    Response<?> updateRole(RoleDTO roleDTO);
    Response<List<RoleDTO>> getAllRoles();
}
