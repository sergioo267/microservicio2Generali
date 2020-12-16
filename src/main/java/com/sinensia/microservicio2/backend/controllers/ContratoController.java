package com.sinensia.microservicio2.backend.controllers;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinensia.microservicio2.backend.model.Contrato;
import com.sinensia.microservicio2.backend.services.ContratoRepository;

@RestController
@RequestMapping("/contrato")
public class ContratoController {
	
	@Autowired
	private ContratoRepository contratoRepository;
	
	@PostMapping
	public Long create(@RequestBody Contrato contrato, @RequestParam Long tienda)
	{
		contrato.setCodigoTienda(tienda);
		Contrato contratoGenerado = contratoRepository.save(contrato);
		return contratoGenerado.getCodigo();
	}
	
	@GetMapping("/all")
	public List<Contrato> getAll(){
		return contratoRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Contrato getByCodigo(@PathVariable Long id) {
		 Optional<Contrato> optional =  contratoRepository.findById(id);
		 if(optional.isPresent()) {
			 return optional.get();
		 }
		 return null;
	}
	
}
