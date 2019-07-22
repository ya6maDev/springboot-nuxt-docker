package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend.model.Person;

/**
 * Person リポジトリ
 * 
 * @author y5a1m5a
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
