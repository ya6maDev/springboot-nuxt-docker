package com.example.backend.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.backend.model.Person;
import com.example.backend.service.PersonService;

/**
 * Person コントローラー
 * 
 * @author y5a1m5a
 *
 */
@RestController
@RequestMapping("/api/person")
public class PersonController {

  /** Personサービス */
  @Autowired
  PersonService service;

  /**
   * Personデータリストを返す。
   * 
   * @return Personデータリスト
   */
  @CrossOrigin
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Person> index() {
    return service.findAll();
  }
}
