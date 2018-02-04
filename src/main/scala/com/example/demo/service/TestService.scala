package com.example.demo.service

import java.util

import com.example.demo.entity.TestEntity
import com.example.demo.repository.TestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TestService @Autowired()(testRepository: TestRepository) {

  def find(): util.List[TestEntity] = {
    return testRepository.findAll()
  }

  def save(): Unit = {
    var testEntity: TestEntity = new TestEntity
    testEntity.name = "name"
    testEntity.test = "test"
    testRepository.save(testEntity)
  }

}
