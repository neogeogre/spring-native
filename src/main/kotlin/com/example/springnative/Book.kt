package com.example.springnative

import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Book (

  @Id
  val id: String = shortId(),

  var title: String = "",

  var author: String = ""

)
