package demo.venkatesh.mapd726_schoolmanagementsystem

import java.io.Serializable

data class UserProfile(
    var userName: String = "",
    var phoneNumber: String = "",
    var gender: String = "",
    var role: String = "",
    var userId: String = "",
    var url: String = "",
    var className: String = ""
) : Serializable

