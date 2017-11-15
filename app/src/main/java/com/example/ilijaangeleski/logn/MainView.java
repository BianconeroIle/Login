package com.example.ilijaangeleski.logn;

/**
 * Created by Ilija Angeleski on 11/15/2017.
 */

public interface MainView {
    void showInvalidUser();
    void showEmptyFieldsError();
    void onSuccessLogin(User user);
}
