package com.example.ggrascantou.calculadoramvp.presenter;

public interface MainActivityPrensenter {
    void sumar(String number1, String number2); // interactor

    void showError(String error); // View
    void showResult(String result); // View

}