package com.example.backend.service;

import java.util.List;
import com.example.backend.model.Person;

/**
 * Personサービス インターフェース
 * 
 * @author y5a1m5a
 *
 */
public interface PersonService {

  /**
   * Personデータを全件検索して、返す。
   * 
   * @return Personデータリスト
   */
  List<Person> findAll();
}
