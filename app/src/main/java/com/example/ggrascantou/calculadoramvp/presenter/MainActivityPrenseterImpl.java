package com.example.ggrascantou.calculadoramvp.presenter;

import com.example.ggrascantou.calculadoramvp.view.MainActivityView;

public class MainActivityPrenseterImpl implements MainActivityPrensenter {

    private MainActivityView activityView;


    @Override
    public void sumar(String number1, String number2) {

    }

    @Override
    public void showError(String error) {
        activityView.showError(error);
    }

    @Override
    public void showResult(String result) {
        activityView.showResult(result);
    }
}
