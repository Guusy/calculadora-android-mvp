package com.example.ggrascantou.calculadoramvp.interactor;

import com.example.ggrascantou.calculadoramvp.presenter.MainActivityPresenter;

public class MainActivityInteractorImpl implements MainActivityInteractor {

    private MainActivityPresenter presenter;

    public MainActivityInteractorImpl(MainActivityPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void sumar(String number1, String number2) {
        try {
            Double resultado =  Double.valueOf(number1) + Double.valueOf(number1);
            presenter.showResult(String.valueOf(resultado));
        }catch (NumberFormatException e){
            presenter.showError("El formato de los numeros no es el correcto");

        }
    }
}
