package com.example.paulc_000.miprimerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private TextView tv, tv1, tv2, tv3;
    private RadioButton rb1,rb2,rb3,rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txtCantidad);
        tv = (TextView)findViewById(R.id.txtTotal);
        tv1 = (TextView)findViewById(R.id.txtResultE);
        tv2 = (TextView)findViewById(R.id.txtResultLb);
        tv3 = (TextView)findViewById(R.id.txtResultD);
        rb1 = (RadioButton)findViewById(R.id.rbLempira);
        rb2 = (RadioButton)findViewById(R.id.rbDolares);
        rb3 = (RadioButton)findViewById(R.id.rbEuros);
        rb4 = (RadioButton)findViewById(R.id.rbLibras);
    }

    public void Resultado(View view) {
        String valor1 = et1.getText().toString();

        int num1 = Integer.parseInt(valor1);

        if (rb1.isChecked() == true) {
            int convertL = (num1);
            double convertE = (num1) / 27.74;
            double convertLb = (num1) / 30.60;
            double convertD = (num1) / 24.41;
            String result = String.valueOf(convertL);
            String resultE = String.valueOf(convertE);
            String resultLb = String.valueOf(convertLb);
            String resultD = String.valueOf(convertD);
            tv.setText('L' + result);
            tv3.setText('$' + resultD);
            tv1.setText('€' + resultE);
            tv2.setText('£' + resultLb);
        }else
            if (rb2.isChecked() == true) {
                double convertL = (num1) * 24.41;
                double convertE = (num1) * 0.88;
                double convertLb = (num1) * 0.78;
                double convertD = (num1);
                String result = String.valueOf(convertL);
                String resultE = String.valueOf(convertE);
                String resultLb = String.valueOf(convertLb);
                String resultD = String.valueOf(convertD);
                tv.setText('L' + result);
                tv3.setText('$' + resultD);
                tv1.setText('€' + resultE);
                tv2.setText('£' + resultLb);
            } else
                if (rb3.isChecked() == true) {
                double convertL = (num1) * 27.86;
                double convertE = (num1);
                double convertLb = (num1) * 0.90;
                double convertD = (num1) * 1.14;
                String result = String.valueOf(convertL);
                String resultE = String.valueOf(convertE);
                String resultLb = String.valueOf(convertLb);
                String resultD = String.valueOf(convertD);
                tv.setText('L' + result);
                tv3.setText('$' + resultD);
                tv1.setText('€' + resultE);
                tv2.setText('£' + resultLb);
            } else
                if (rb4.isChecked() == true) {
                double convertL = (num1) * 30.81;
                double convertD = (num1) * 1.26;
                double convertE = (num1) * 0.91;
                double convertLb = (num1);
                String result = String.valueOf(convertL);
                String resultD = String.valueOf(convertD);
                String resultE = String.valueOf(convertE);
                String resultLb = String.valueOf(convertLb);
                tv.setText('L' + result);
                tv3.setText('$' + resultD);
                tv1.setText('€' + resultE);
                tv2.setText('£' + resultLb);
            }

        }
    }




