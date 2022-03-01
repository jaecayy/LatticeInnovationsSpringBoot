package com.lattice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lattice.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{

	Patient findByName(String name);
	List<Patient> findAll();

}
