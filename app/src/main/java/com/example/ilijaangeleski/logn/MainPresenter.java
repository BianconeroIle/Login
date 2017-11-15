package com.example.ilijaangeleski.logn;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ilija Angeleski on 11/15/2017.
 */

public class MainPresenter {
    LoginManager loginManager;
    MainView view;
    public static final List<User> users = new ArrayList<>();

    public MainPresenter(MainView view){
        loginManager = new LoginManager();
        this.view=view;
    }

    static {
        users.add(new User("ile@gmail.com", "ile"));
        users.add(new User("goran@gmail.com", "goran"));
        users.add(new User("vlade@gmail.com", "vlade"));
        users.add(new User("pece@gmail.com", "pece"));
    }
    public void validateUser(String email,String password){
        if(loginManager.checkUserExist(email, password)){
            Log.d("validateUser","Super");
        }else{
            view.showInvalidUser();
        }
    }

    public void checkIfFieldsAreEmpty(String email,String password){
        if(email.equals("") || password.equals(""));
    }
    public static List<User> getUsers() {
        return users;
    }


}
