package com.lattice.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lattice.model.Appointment;
import com.lattice.model.Patient;


public interface AppointmentRepository extends JpaRepository<Appointment,Long>{

	List<Appointment> findAll();

	List<Appointment> findByOrderByEntryDateAsc();

}
