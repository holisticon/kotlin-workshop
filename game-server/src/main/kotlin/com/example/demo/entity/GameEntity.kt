package com.example.demo.entity

import java.util.*
import javax.persistence.Id

// FIXME Add the correct annotations to this class and complete the constructor.
data class GameEntity(
        @Id val id: String = Random().nextLong().toString()
)
