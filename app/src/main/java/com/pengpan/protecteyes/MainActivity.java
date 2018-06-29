package com.pengpan.protecteyes;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * @author pengpan
 */
public class MainActivity extends AppCompatActivity {

    private static Context context;

    /**
     * 获取全局上下文
     */
    public static Context getContext() {
        return context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getApplicationContext();
        setContentView(R.layout.activity_main);
    }
}
