package com.example.demo.controller

import java.util

import com.example.demo.entity.TestEntity
import com.example.demo.service.TestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by ksb on 2018. 2. 4..
  */
@RestController
@RequestMapping(Array("/test"))
class TestController @Autowired()(testService: TestService) {

  @RequestMapping
  def index(): String = {
    "index"
  }

  @RequestMapping(Array("/test"))
  def test(): String = {
    "test"
  }

  @RequestMapping(Array("/find"))
  def find(): util.List[TestEntity] = {
    testService.find()
  }

  @RequestMapping(Array("/save"))
  def save(): Unit = {
    testService.save()
  }

}
