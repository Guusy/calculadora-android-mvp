package com.example.ggrascantou.calculadoramvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.ggrascantou.calculadoramvp.R;
import com.example.ggrascantou.calculadoramvp.presenter.MainActivityPresenter;
import com.example.ggrascantou.calculadoramvp.presenter.MainActivityPresenterImpl;

public class MainActivity extends AppCompatActivity implements MainActivityView {

    private EditText edtNumber1;
    private EditText edtNumber2;
    private TextView tvresultado;
    private TextView tverror;

    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber1 = findViewById(R.id.editNumber1);
        edtNumber2 = findViewById(R.id.editNumber2);
        tvresultado = findViewById(R.id.result);
        tverror = findViewById(R.id.error);
        presenter = new MainActivityPresenterImpl(this);
    }

    public void suma(View view){
        String number1 = edtNumber1.getText().toString();
        String number2 = edtNumber2.getText().toString();
        presenter.sumar(number1,number2);
    }

    @Override
    public void showResult(String result) {
        tvresultado.setText(result);
        tverror.setText("");

    }

    @Override
    public void showError(String error) {
        tverror.setText(error);
        tvresultado.setText("");
    }
}
