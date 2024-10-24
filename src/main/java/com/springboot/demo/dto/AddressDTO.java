package com.springboot.demo.dto;

import com.springboot.demo.utils.EnumConstants;
import lombok.Data;

@Data
public class AddressDTO {
    private String addressLine1;
    private String city;
    private String state;
    private String country;
    private EnumConstants.AddressType addressType;
}
