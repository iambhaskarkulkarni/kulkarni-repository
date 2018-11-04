package com.kulkarni.jackson.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		
		try {
			Student theStudent = mapper.readValue(
					new File("data/sample-full.json"), Student.class);
			System.out.println(" First Name :"+theStudent.getFirstName());
			System.out.println(" Last Name :"+theStudent.getLastName());
			System.out.println(" languages :"+theStudent.getLanguages()[0]+","+theStudent.getLanguages()[1]);
			System.out.println(" State :"+theStudent.getAddress().getState());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
