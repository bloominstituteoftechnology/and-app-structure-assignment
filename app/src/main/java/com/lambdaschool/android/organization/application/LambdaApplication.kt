package com.lambdaschool.android.organization.application

import android.app.Application
import com.lambdaschool.android.organization.Model.Product


class LambdaApplication : Application() {
    public val appItem = Product( item = "your item here")

    override fun onCreate() {
        super.onCreate()

        // Note: You could do all kinds of app-initialization here. Crash-reporting tools,
        // Firebase, Stetho or anything else. You'll learn more about those later in the course.
    }
}