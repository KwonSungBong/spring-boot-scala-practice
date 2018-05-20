package com.example.demo

import com.example.demo.repository.TestRepository
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner


@RunWith(classOf[SpringRunner])
@SpringBootTest
class ApplicationTests {

  var testRepository : TestRepository = _

  @Autowired
  def setMyServiceB(testRepository : TestRepository): Unit = {
    this.testRepository = testRepository
  }

  @Test
  def index(): Unit = {
    println("index")
  }

  @Test
  def test(): Unit = {
    println("test")
  }

}
