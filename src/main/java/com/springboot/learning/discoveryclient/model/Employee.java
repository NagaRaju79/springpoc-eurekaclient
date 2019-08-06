package com.springboot.learning.discoveryclient.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	public Long empId;
	public String empName;
	public String mobileNumer;

}
