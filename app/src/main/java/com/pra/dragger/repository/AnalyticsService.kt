package com.pra.dragger.repository

import android.util.Log


interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}


class MixPanel(): AnalyticsService{
    override fun trackEvent(eventName:String,eventType:String) {
        Log.d("Dagger Mix Panel ", "event Name > "+eventName+
            " event type > "+eventType)
    }

}
/*
class FireBaseAnalytics(): AnalyticsService{
    override fun trackEvent() {
        Log.d("Dagger", "FireBase")
    }
}*/
