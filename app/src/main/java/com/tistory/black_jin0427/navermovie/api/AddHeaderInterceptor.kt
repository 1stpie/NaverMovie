package com.tistory.black_jin0427.navermovie.api

import com.tistory.black_jin0427.navermovie.BuildConfig
import okhttp3.Interceptor
import okhttp3.Response

// https://github.com/square/okhttp/wiki/Interceptors
class AddHeaderInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain) = chain.run {
        proceed(
            request()
                .newBuilder()
                .addHeader("X-Naver-Client-Id", BuildConfig.MOVIE_CLIENT_ID)
                .addHeader("X-Naver-Client-Secret", BuildConfig.MOVIE_CLIENT_SECRET)
                .build()
        )
    }
}