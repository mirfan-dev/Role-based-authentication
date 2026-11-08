package com.lcwd.electronic.store.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private String name;


    private String locality;


    private String address;


    private String city;


    private String state;


    private String pinCode;


    private String mobile;
}
