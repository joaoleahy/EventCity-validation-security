package com.devsuperior.bds04.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.bds04.dto.RoleDTO;
import com.devsuperior.bds04.entities.Role;
import com.devsuperior.bds04.repositories.RoleRepository;

@Service
public class RoleService {

	@Autowired
	private RoleRepository repository;
	
	@Transactional
	public RoleDTO insert(RoleDTO dto) {
		
		Role entity = new Role(); 
		entity.setAuthority(dto.getAuthority());
		entity = repository.save(entity);
		
		return new RoleDTO(entity);
	}
}
