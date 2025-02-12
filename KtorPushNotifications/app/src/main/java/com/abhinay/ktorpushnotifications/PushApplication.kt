package com.abhinay.ktorpushnotifications

import android.app.Application
import com.onesignal.OneSignal


/**
 * Created by Abhinay on 12/02/25.
 *
 *
 */
class PushApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }

    companion object {

        private const val ONESIGNAL_APP_ID =  "62305f55-285f-49dc-abe4-78901e342331"
    }
}