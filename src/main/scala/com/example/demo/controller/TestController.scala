package com.example.demo.controller

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by ksb on 2018. 2. 4..
  */
@RestController
@RequestMapping(Array("/test"))
class TestController {

  @RequestMapping
  def index(): String = {
    "index"
  }

  @RequestMapping(Array("/test"))
  def test(): String = {
    "test"
  }

}
