package com.example.demo.entity

import javax.persistence._

import scala.beans.BeanProperty

/**
  * Created by ksb on 2018. 2. 4..
  */
@Entity
class TestEntity extends Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @BeanProperty
  var id: Int = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var test: String = _

}
