package com.luise.foundation.base.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.luise.common.logger.Logger;

/**
 * Created by john 
 * on 2017/3/16 13:21.
 */

public class CustomActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Logger.debug("activity ==> onCreate( )");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Logger.debug("activity ==> onStart( )");
        super.onStart();
    }

    @Override
    protected void onRestart() {
        Logger.debug("activity ==> onRestart( )");
        super.onRestart();
    }

    @Override
    protected void onResume() {
        Logger.debug("activity ==> onResume( )");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Logger.debug("activity ==> onPause( )");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Logger.debug("activity ==> onStop( )");
        super.onStop();
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Logger.debug("activity ==> onNewIntent( )");
        super.onNewIntent(intent);
    }

    @Override
    public void onAttachedToWindow() {
        Logger.debug("activity ==> onAttachedToWindow( )");
        super.onAttachedToWindow();
    }

    @Override
    public void onDetachedFromWindow() {
        Logger.debug("activity ==> onDetachedFromWindow( )");
        super.onDetachedFromWindow();
    }

    @Override
    protected void onDestroy() {
        Logger.debug("activity ==> onDestroy( )");
        super.onDestroy();
    }
}
