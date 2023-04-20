package com.practice.practice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.practice.model.Practice;
import com.practice.practice.repository.PracticeRepository;

@Service
public class PracticeServiceImp implements PracticeService{

	
	@Autowired
	private PracticeRepository practicerepository;
	
	
	@Override
	public void saveUserData(Practice practice) {
		practicerepository.save(practice);
	}

	@Override
	public List<Practice> getAllUserDataList() {
		return practicerepository.findAll();
	}

	@Override
	public void deleteUserDataById(int id) {
		practicerepository.deleteById(id);
		
	}

	@Override
	public Optional<Practice> getUserDataById(int id) {
		return practicerepository.findById(id);
	}

	
}
