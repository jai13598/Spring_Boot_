package com.practice.practice.service;

import java.util.List;
import java.util.Optional;

import com.practice.practice.model.Practice;

public interface PracticeService {
	public void saveUserData(Practice practice);
	public List<Practice> getAllUserDataList();
	public void deleteUserDataById(int id);
	public Optional<Practice> getUserDataById(int id); 
	public Optional<Practice> getUserBataByCity(String city);
}
