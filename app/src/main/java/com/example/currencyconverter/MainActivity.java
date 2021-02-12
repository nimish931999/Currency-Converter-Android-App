package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.util.Currency;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Converter(View view){
        EditText currency = (EditText) findViewById(R.id.money);
        TextView covCur = (TextView) findViewById(R.id.convertCurrency);
        double res;
        String result;
        Integer mon = Integer.parseInt(currency.getText().toString());
        switch(view.getId()){
            case R.id.dollar:res = mon*0.014;
                result = String.valueOf(res);
                covCur.setText(result);
                Toast.makeText(this,"The Converted currency is :"+result+" USD",Toast.LENGTH_LONG).show();
                break;
            case R.id.yen:res = mon*1.42;
                 result = String.valueOf(res);
                 covCur.setText(result);
                 Toast.makeText(this,"The Converted currency is :"+result+" YEN",Toast.LENGTH_LONG).show();
                 break;
            case R.id.euro: res = mon*0.011;
                 result = String.valueOf(res);
                 covCur.setText(result);
                 Toast.makeText(this,"The Converted currency is :"+result+" EURO",Toast.LENGTH_LONG).show();
                 break;
            case R.id.aud: res = mon*0.018;
                 result = String.valueOf(res);
                 covCur.setText(result);
                 Toast.makeText(this,"The Converted currency is :"+result+" AUD",Toast.LENGTH_LONG).show();
                 break;
            case R.id.cad: res = mon*0.017;
                 result = String.valueOf(res);
                 covCur.setText(result);
                 Toast.makeText(this,"The Converted currency is :"+result+" CAD",Toast.LENGTH_LONG).show();
                 break;
            case R.id.dinar: res = mon*0.0042;
                 result = String.valueOf(res);
                 covCur.setText(result);
                 Toast.makeText(this,"The Converted currency is :"+result+" Kuwati Dinar",Toast.LENGTH_LONG).show();
                 break;
            case R.id.reset:currency.setText("");
                 break;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}