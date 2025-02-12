package com.abhinay.ktorpushnotifications.data.remote


/**
 * Created by Abhinay on 12/02/25.
 *
 *
 */
interface ApiService {

    suspend fun sendNotification(title: String, description: String)

    companion object {
        const val SEND_NOTIFICATION = "http://192.168.1.10:8080/sendNotification"
    }
}