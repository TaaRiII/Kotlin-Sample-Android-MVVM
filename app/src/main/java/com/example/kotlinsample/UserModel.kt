package com.example.kotlinsample

class UserModel : ArrayList<UserModel.UserModelItem>(){
    data class UserModelItem(
        val id: Int,
        val name: String,
        val username: String,
        val email: String,
        val phone: String,
        val website: String
    )
}