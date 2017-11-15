package com.example.ilijaangeleski.logn;


import java.util.List;

/**
 * Created by Ilija Angeleski on 11/15/2017.
 */

public class LoginManager {

    public LoginManager() {}

    public boolean checkUserExist(String email, String password, List<User> users) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean userIsAuthoraized(String email, String password, List<User> users) {
        return users.contains(new User(email, password));
    }

    public boolean checkIfFieldsAreEmpty(String email,String password){
        return email!= null && !email.equals("")  && password!=null && !password.equals("");
    }
}
