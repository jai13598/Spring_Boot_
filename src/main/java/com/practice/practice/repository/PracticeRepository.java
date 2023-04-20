package com.practice.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.practice.model.Practice;

@Repository
public interface PracticeRepository extends JpaRepository<Practice,Integer> {

}
