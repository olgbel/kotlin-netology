package ru.netology.profile

import ru.netology.profile.model.Profile

fun main(){
    val profile = Profile(1, "olgbelo", "Olga", "KC", "online", "");
    println(profile.fullName)
}