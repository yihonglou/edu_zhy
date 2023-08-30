package com.edu.zhy.api.api.util;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;

/**
 * *拦截器
 * *
 */
public class LoggingInterceptor implements Interceptor {





    private static final String TAG = "LoggingInterceptor";
    @NotNull
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        long startTime = System.nanoTime();
//        Log.d(TAG, String.format("Sending request %s on %s%n%s",
//                request.url(), chain.connection(), request.headers()));

        Response response =  chain.proceed(request);

        long endTime = System.nanoTime();
//        Log.d(TAG, String.format("Received response for %s in %.1fms%n%s",
//                response.request().url(), (endTime - startTime) / 1e6d, response.headers()));

        return response;
    }


}
