package com.lattice.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lattice.Repository.PatientRepository;
import com.lattice.model.Patient;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private PatientRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Patient user = repo.findByName(username);
		if(user == null)
			throw new UsernameNotFoundException("User not Found");
		
		return new UserPrinciple(user);
	}

}
