package com.example.backend.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.example.backend.model.Person;
import com.example.backend.repository.PersonRepository;
import com.example.backend.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {

  /** Person リポジトリ */
  @Autowired
  PersonRepository repository;

  @Override
  public List<Person> findAll() {
    return repository.findAll(new Sort(Sort.Direction.ASC, "id"));
  }
}
