package com.lattice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lattice.Repository.AppointmentRepository;
import com.lattice.Repository.PatientRepository;
import com.lattice.model.Appointment;
import com.lattice.model.Patient;

@RestController
public class AppointmentController {

	@Autowired
	public AppointmentRepository appointmentRepo;
	
	@Autowired
	public PatientRepository patientRepo;
	
	@GetMapping("/appointments")
	public List<Appointment> getAll(){
		List<Appointment> all = appointmentRepo.findByOrderByEntryDateAsc();
		return all;
	}	
	
	@PostMapping("/bookAppointment/{id}")
	public Appointment bookAppointment(@PathVariable("id")Integer id) {
		Patient patient = patientRepo.findById(id).get();
		Appointment appointment = new Appointment();
		
		appointment.setName(patient.getName());
		appointment.setAddress(patient.getAddress());
		appointment.setEmail(patient.getEmail());
		appointment.setPhoneno(patient.getPhoneno());
		appointment.setPassword(patient.getPassword());
		appointment.setName(patient.getName());
		appointment.setEntryDate(new Date());
		
		appointmentRepo.save(appointment);
		return appointment;
	}
	
}
