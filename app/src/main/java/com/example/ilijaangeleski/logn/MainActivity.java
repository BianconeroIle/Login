package com.example.ilijaangeleski.logn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView{

    @BindView(R.id.email)
    EditText email;

    @BindView(R.id.password)
    EditText password;

    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new MainPresenter(this);
        checkIfFieldsAreEmpty();

    }
    @OnClick(R.id.login)
    public void onLoginClicked(){
        presenter.validateUser(email.getText().toString(),email.getText().toString());

    }

    @Override
    public void showInvalidUser() {
        Toast.makeText(this,"Invalid user!",Toast.LENGTH_LONG).show();
    }

    public void checkIfFieldsAreEmpty(){
            presenter.checkIfFieldsAreEmpty(email.toString(),password.toString());
            email.setError("This field is empty");
            password.setError("This field is empty");

    }

    public void openHomeActivity(){
        Intent i = new Intent(MainActivity.this,HomeActivity.class);
        startActivity(i);
    }
}
