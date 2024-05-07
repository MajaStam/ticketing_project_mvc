package com.cydeo.service;

import com.cydeo.dto.RoleDTO;

import java.util.List;


public interface RoleService extends CrudService<RoleDTO,Long> {

    @Override
    default RoleDTO save(RoleDTO user) {
        return null;
    }

    @Override
    default RoleDTO findById(Long username) {
        return null;
    }

    @Override
    default List<RoleDTO> findAll() {
        return null;
    }

    @Override
    default void deleteById(Long username) {

    }
}
