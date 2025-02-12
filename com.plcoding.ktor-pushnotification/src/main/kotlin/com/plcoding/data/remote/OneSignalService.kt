package com.plcoding.data.remote

import com.plcoding.data.remote.dto.Notification

interface OneSignalService {

    suspend fun sendNotification(notification: Notification) : Boolean

    companion object {
        const val ONESIGNAL_APP_ID = "62305f55-285f-49dc-abe4-78901e342331"

        const val NOTIFICATIONS = "https://onesignal.com/api/v1/notifications"
    }

}