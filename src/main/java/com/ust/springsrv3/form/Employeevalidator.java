package com.ust.springsrv3.form;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.ust.springsrv3.model.Employee;

public class Employeevalidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		Employee emp=(Employee)target;
		if(emp.getName().equals(null)){
			errors.rejectValue("name","Name should not Emplty");
		}
		
		
	}

}
