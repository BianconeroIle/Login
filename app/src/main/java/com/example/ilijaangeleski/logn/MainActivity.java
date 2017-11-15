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


    }
    @OnClick(R.id.login)
    public void onLoginClicked(){
        presenter.onLogin(email.getText().toString(),password.getText().toString());

    }
    public void showEmptyFieldsError(){
        email.setError("Email is empty");
        password.setError("Password is empty");
    }

    @Override
    public void showInvalidUser() {
        Toast.makeText(this,"Invalid user!",Toast.LENGTH_LONG).show();
    }

    private void openHomeActivity(User user){
        Intent i = new Intent(MainActivity.this,HomeActivity.class);
        i.putExtra("email",email.getText().toString());
        i.putExtra("password",password.getText().toString());
        i.putExtra(HomeActivity.USER_EXTRA,user);
        startActivity(i);
    }
    public void onSuccessLogin(User user){
        openHomeActivity(user);
    }
}
