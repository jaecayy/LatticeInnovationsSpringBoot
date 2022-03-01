
package com.lattice.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lattice.Repository.PatientRepository;
import com.lattice.model.Patient;

@RestController
public class PatientController {

	@Autowired
	public PatientRepository patientRepo;
	
	@RequestMapping(value = "/patients", method = RequestMethod.GET)
    public List<Patient> getListOfPatient() {
        List<Patient> patients = patientRepo.findAll();
        return patients;
    }

	@RequestMapping(value = "/newPatient", method = RequestMethod.POST)
	public String addNewPatient(@RequestBody Patient patient) {
		try {
			patientRepo.save(patient);
			return "Saved Successfully!";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Error";
		}
		
	}
	
	@RequestMapping(value = "/updateDetailsPatient/{id}", method = RequestMethod.PUT)
	public Patient updateDetailsOfPatientById(@PathVariable("id") int id, @RequestBody Patient patient) {
		try {
			Patient oldPatient = patientRepo.findById(id).get();
			oldPatient.setName(patient.getName());
			oldPatient.setEmail(patient.getEmail());
			oldPatient.setAddress(patient.getAddress());
			oldPatient.setPhoneno(patient.getPhoneno());
			return oldPatient;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
			
		}
	}
	
	@DeleteMapping("/deletePatients/{id}")
	public ResponseEntity<HttpStatus> deletePatient(@PathVariable("id") int id) {
		try {
			Optional<Patient> patient = patientRepo.findById(id);
			if (patient.isPresent()) {
				patientRepo.delete(patient.get());
			}
			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
