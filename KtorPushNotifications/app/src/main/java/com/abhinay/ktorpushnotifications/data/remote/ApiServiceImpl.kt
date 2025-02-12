package com.abhinay.ktorpushnotifications.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.client.request.url


/**
 * Created by Abhinay on 12/02/25.
 *
 *
 */
class ApiServiceImpl(
    private val client: HttpClient
):ApiService {
    override suspend fun sendNotification(title: String, description: String) {

        try{
            client.get<String> {
                url(ApiService.SEND_NOTIFICATION)
                parameter("title", title)
                parameter("description", description)
            }

        }catch (e: Exception) {
            e.printStackTrace()
        }

    }
}