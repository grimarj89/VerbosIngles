package com.grimarj.verbos;

import android.app.Application;
import android.util.Log;

/**
 * Created by Gus on 28/03/2015.
 */
public class VerbosInglesApplication extends Application{

    private static final String TAG = VerbosInglesApplication.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG,"onCreate");

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.d(TAG,"onTerminate");
    }
}
