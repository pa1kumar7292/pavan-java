package com.springboot.jpademo.service;

import java.util.List;
import java.util.Optional;

import javax.naming.directory.InvalidAttributeIdentifierException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpademo.dto.ResponseDTO;
import com.springboot.jpademo.dto.UserDTO;
import com.springboot.jpademo.model.Profile;
import com.springboot.jpademo.model.User;
import com.springboot.jpademo.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public ResponseDTO createUser(UserDTO userDTO) {
		try {
			// data validations and return error codes, msg
			
			if (userDTO.getName() != null && !userDTO.getName().isEmpty()
					&& !userDTO.getName().matches("^[a-zA-Z]+$")) {
				throw new InvalidAttributeIdentifierException("Invalid Name, allow only alphabets");
			}
			
			User user = new User();
			user.setName(userDTO.getName());
			user.setEmail(userDTO.getEmail());
			user.setMobileNumber(userDTO.getMobileNumber());
			
			Profile profile = new Profile();
			profile.setAddress(userDTO.getProfileDTO().getAddress());
			profile.setPincode(userDTO.getProfileDTO().getPincode());
			
			user.setProfile(profile);
			
			
			User userFromDB = userRepository.save(user);
			// set the data back to new DTO and return
			UserDTO respose = new UserDTO();
			
			respose.setEmail(userFromDB.getEmail());
			
			return new ResponseDTO(ResponseDTO.Status.SUCCESS, respose);
			
		} catch (InvalidAttributeIdentifierException e) {
			return new ResponseDTO(ResponseDTO.Status.FAIL, 422, e.getMessage(), null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}

	public List<User> geteUsers() {
		try {
			return userRepository.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public List<User> updateUsers(Long userId, UserDTO userDTO) {
		try {
			
			Optional<User> userOptionalFromDB = userRepository.findById(userId);
			
			
			if (userOptionalFromDB.isEmpty()) {
				// handing the exception
				return null;
			}
			User userFromDB = userOptionalFromDB.get();
			
			if (userDTO.getName() != null && !userDTO.getName().isEmpty()) {
				userFromDB.setName(userDTO.getName());
			}
			if (userDTO.getMobileNumber() != null && !userDTO.getMobileNumber().isEmpty()) {
				userFromDB.setMobileNumber(userDTO.getMobileNumber());
			}
			
			if (userDTO.getProfileDTO() != null 
					&& userDTO.getProfileDTO().getAddress() != null 
					&& !userDTO.getProfileDTO().getAddress().isEmpty()) {
				userFromDB.getProfile().setAddress(userDTO.getProfileDTO().getAddress());
			}
			// set pincode 
			
			userRepository.save(userFromDB);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

}
