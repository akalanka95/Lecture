package com.akalanka.springangular.lecturemanagement.service;


import com.akalanka.springangular.lecturemanagement.dto.Time;

import java.util.Optional;

public interface TimeService {
    Iterable<Time> list();
    Time save(Time task);
    void delete(Integer id);
    Time findById(Integer id);
}
