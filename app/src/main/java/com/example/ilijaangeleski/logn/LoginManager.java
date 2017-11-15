package com.example.ilijaangeleski.logn;

import static com.example.ilijaangeleski.logn.MainPresenter.getUsers;

/**
 * Created by Ilija Angeleski on 11/15/2017.
 */

public class LoginManager {

    public boolean checkUserExist(String email, String password) {
        for (User user : getUsers()) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
