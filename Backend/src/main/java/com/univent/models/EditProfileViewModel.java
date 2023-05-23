package com.univent.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditProfileViewModel {
	String id;
	String phone;
	String email;
	String password;
	String street;
	String city;
	String country;
}
