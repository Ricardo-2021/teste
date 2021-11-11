package com.example.cep;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.BindingResult;

@RestController
@CrossOrigin(exposedHeaders = "errors, content-type")

public class CepController {

	@Autowired
	private CepRepository cepRepository;

	@RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cep> findById(@PathVariable("id") Integer id) {
		Cep cep = this.cepRepository.findById(id);
		if (cep == null) {
			return new ResponseEntity<Cep>(cep, HttpStatus.NOT_FOUND);
		}		
		return new ResponseEntity<Cep>(cep, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Cep>> findAll() {
		List<Cep> cep = this.cepRepository.findAll();
		if (cep.isEmpty()) {
			return new ResponseEntity<List<Cep>>(cep, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Cep>>(cep, HttpStatus.OK);
	}
	
	
}
