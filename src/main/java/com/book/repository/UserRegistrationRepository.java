package com.book.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.model.UserRegistrationData;
@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistrationData, Integer> {

	Optional<UserRegistrationData> findByEmailId(String emailId);

//	@Query(value = "select * from userregistration where email_Id= :emailId", nativeQuery = true)
//	Optional<UserRegistrationData> findByEmailId(String emailId);

}
