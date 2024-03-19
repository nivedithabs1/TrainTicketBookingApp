package com.sampleProject.TTBookingApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sampleProject.TTBookingApp.model.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

}
