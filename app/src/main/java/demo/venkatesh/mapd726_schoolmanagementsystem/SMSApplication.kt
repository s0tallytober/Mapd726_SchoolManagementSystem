package demo.venkatesh.mapd726_schoolmanagementsystem

import android.app.Application
import com.google.firebase.FirebaseApp

class SMSApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(applicationContext)
    }
}