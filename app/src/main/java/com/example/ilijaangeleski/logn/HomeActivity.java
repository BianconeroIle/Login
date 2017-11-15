package com.example.ilijaangeleski.logn;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;

/**
 * Created by Ilija Angeleski on 11/15/2017.
 */

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.email)
    TextView email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        getIntent().getExtras();

    }
}
