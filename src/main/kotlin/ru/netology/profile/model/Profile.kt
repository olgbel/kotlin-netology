package ru.netology.profile.model

data class Profile(val id: Int,
              val login: String,
              val firstName: String,
              val lastName: String,
              val status: String,
              val avatar: String){

    val fullName: String get() = "$firstName $lastName"
}