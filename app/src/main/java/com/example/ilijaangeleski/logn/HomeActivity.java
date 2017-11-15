package com.example.ilijaangeleski.logn;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Ilija Angeleski on 11/15/2017.
 */

public class HomeActivity extends AppCompatActivity {

    public static final String USER_EXTRA ="User";
    @BindView(R.id.email)
    TextView email;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        ButterKnife.bind(this);

      //  email.setText(getIntent().getExtras().getString("email"));
        User user = (User) getIntent().getExtras().getSerializable(USER_EXTRA);

        email.setText(user.getEmail());
    }
}
