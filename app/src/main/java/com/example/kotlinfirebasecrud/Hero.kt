package com.example.kotlinfirebasecrud

class Hero(val id: String, val name: String, val rating: Int){

    constructor() : this("", "", 0) {

    }
}