package com.androiddevs.firebasenotifications

import com.androiddevs.firebasenotifications.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Abhinay on 04/10/23.
 */
class RetrofitInstance {

    companion object {
        //lazy is used since retrofit will be accessed only after calling lazy block not befor that
        private val retrofit by lazy {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        val api by lazy {
            retrofit.create(NotificationAPI::class.java)
        }
    }
}