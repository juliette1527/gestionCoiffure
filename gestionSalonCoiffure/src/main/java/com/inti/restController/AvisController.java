package com.inti.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Avis;
import com.inti.services.interfaces.IAvisService;

@RestController // RestFul ws
@CrossOrigin
public class AvisController {
	@Autowired
	IAvisService avisService;

//@RequestMapping(value = "avis", method = RequestMethod.GET)
	@GetMapping("/avis")
	public List<Avis> findAll() {
		return avisService.findAll();
	}

	// @RequestMapping(value = "avis/{idAvis}", method = RequestMethod.GET)
	@GetMapping("/avis/{idAvis}")
	public Avis findOne(@PathVariable("idAvis") Long id) {
		return avisService.findOne(id);
	}

	// @RequestMapping(value = "avis", method = RequestMethod.POST)
	@PostMapping("/avis")
	public Avis saveAvis(@RequestBody Avis avis) {
		return avisService.save(avis);
	}

	// @RequestMapping(value = "avis/{idAvis}", method = RequestMethod.DELETE)
	@DeleteMapping("/avis/{idAvis}")
	public void deleteAvis(@PathVariable("idAvis") Long id) {
		avisService.delete(id);
	}

	// @RequestMapping(value = "avis/{idAvis}", method = RequestMethod.PUT)
	@PutMapping("/avis/{idAvis}")
	public Avis updateAvis(@PathVariable("idAvis") Long id, @RequestBody Avis avis) {
		Avis currentAvis = avisService.findOne(id);
		currentAvis.setTitre(avis.getTitre());
		currentAvis.setDescription(avis.getDescription());
		return avisService.save(currentAvis);
	}
}
