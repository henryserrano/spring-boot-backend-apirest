package com.henryserrano.springboot.backend.apirest.models.services;

import java.util.List;

import com.henryserrano.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente findById(Long id);
	

}
