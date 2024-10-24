package com.springboot.demo.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String firstName;
    private String lastName;
    private String phoneNo;
    private AddressDTO addressDTO;
}
