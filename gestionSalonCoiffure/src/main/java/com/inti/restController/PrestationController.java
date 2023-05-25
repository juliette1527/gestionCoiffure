package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Prestation;
import com.inti.services.interfaces.IPrestationService;
@RestController
@CrossOrigin
public class PrestationController {

	@Autowired
	IPrestationService prestationService;
	
	@GetMapping("/prestations")
	public List<Prestation> findAll() {
		return prestationService.findAll();
	}

	@GetMapping("/prestations/{idPrestation}")
	public Prestation findOne(@PathVariable("idPrestation") Long id) {
		return prestationService.findOne(id);
	}

	@PostMapping("/prestations")
	public Prestation savePrestation(@RequestBody Prestation prestation) {
		return prestationService.save(prestation);
	}

	@DeleteMapping("/prestations/{idPrestation}")
	public void deletePrestation(@PathVariable("idPrestation") Long id) {
		prestationService.delete(id);
	}
}
