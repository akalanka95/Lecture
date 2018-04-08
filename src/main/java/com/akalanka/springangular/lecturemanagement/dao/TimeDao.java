package com.akalanka.springangular.lecturemanagement.dao;

import com.akalanka.springangular.lecturemanagement.dto.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeDao extends JpaRepository<Time,Integer> {
}
