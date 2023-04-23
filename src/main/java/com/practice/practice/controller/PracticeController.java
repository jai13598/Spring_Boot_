package com.practice.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practice.model.Practice;
import com.practice.practice.service.PracticeService;

@RestController
@CrossOrigin
@RequestMapping("/practice" )
public class PracticeController {
	
	@Autowired
	private PracticeService practiceService;
	
	@PostMapping("/add")
	public void addUserData(@RequestBody Practice practice) {
		practiceService.saveUserData(practice);
	}
	
	@GetMapping("/get")
	public List<Practice> getAllUserDataList() {
		return practiceService.getAllUserDataList();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Practice> getUserDataById(@PathVariable("id") int id) {
		return practiceService.getUserDataById(id);
	}
	
	@GetMapping("/get/city/{city}")
	public Optional<Practice> getUserDataByCity(@PathVariable("city") String city){
		return practiceService.getUserBataByCity(city);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUserDataById(@PathVariable("id") int id) {
		practiceService.deleteUserDataById(id);
	}
	
	

}
