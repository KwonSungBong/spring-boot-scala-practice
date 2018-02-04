package com.example.demo

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(classOf[SpringRunner])
@SpringBootTest
class ApplicationTests {

  @Test
  def index(): Unit = {
    println("index")
  }

  @Test
  def test(): Unit = {
    println("test")
  }

}
