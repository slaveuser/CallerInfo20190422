package org.xdty.callerinfo.activity;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.xdty.callerinfo.utils.Utils;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        setTitle(getTitleId());

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        Context context = Utils.changeLang(newBase);
        super.attachBaseContext(context);
    }

    protected abstract int getLayoutId();

    protected abstract int getTitleId();

}
