package com.springboot.jpademo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	private Long id;
	private String name;
	private String email;
	private String mobileNumber;
	private ProfileDTO profileDTO;

}
