package com.sampleProject.TTBookingApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampleProject.TTBookingApp.model.User;
import com.sampleProject.TTBookingApp.repository.IUserRepo;

@Service
public class UserService {
	 private final IUserRepo userRepository;

	    @Autowired
	    public UserService(IUserRepo userRepository) {
	        this.userRepository = userRepository;
	    }

	    public User addUser(User user) {
	        return userRepository.save(user);
	    }
}
