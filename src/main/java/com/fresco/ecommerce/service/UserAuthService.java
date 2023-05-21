package com.fresco.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fresco.ecommerce.models.User;
import com.fresco.ecommerce.repo.UserRepo;

@Service
public class UserAuthService implements UserDetailsService {

	@Autowired
	private UserRepo userRepo;
	
	public UserDetails loadUserByUserID(Integer id) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			throw new UsernameNotFoundException("User ID not found");
		}
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = userRepo.findByUsername(username);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			throw new UsernameNotFoundException("User ID not found");
		}
	}

}
