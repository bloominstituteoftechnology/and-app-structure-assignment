package com.lambdaschool.android.organization.application.application.application

import android.app.Application
import com.lambdaschool.android.organization.application.application.model.Model
import org.intellij.lang.annotations.JdkConstants

class LambdaApplication : Application() {
    // todo: Maybe define a model in this class?
    val appOrder = Model(productName = " ")



    override fun onCreate() {
        super.onCreate()

        // Note: You could do all kinds of app-initialization here. Crash-reporting tools,
        // Firebase, Stetho or anything else. You'll learn more about those later in the course.
    }
}