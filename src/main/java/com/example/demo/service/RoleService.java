package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Role;

public interface RoleService {
    Role createRole(Role role);

    List<Role> findAll();
}
