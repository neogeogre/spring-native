package com.example.springnative

import java.util.UUID.randomUUID

fun shortId() = randomUUID().toString().replace("-","").substring(0, 4)
