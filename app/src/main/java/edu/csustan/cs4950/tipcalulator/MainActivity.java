package edu.csustan.cs4950.tipcalulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Cal(View v) {
        //DecimalFormat for money
        DecimalFormat money = new DecimalFormat("###,###,###,###,###,###,###,###,###,###.00");


        EditText inputNum1 = findViewById(R.id.inputNum1);
        EditText inputNum2 = findViewById(R.id.inputNum2);
        String num1Str = inputNum1.getText().toString();
        String num2Str = inputNum2.getText().toString();

        double num1 = Double.parseDouble(num1Str);
        double num2 = Double.parseDouble(num2Str);
        double sum = (num2 / 100) * num1;
        double sum2 = (num1 * (num2 / 100)) + num1;


        TextView lblMsg = findViewById(R.id.lblMsg);
        TextView lblMsg2 = findViewById(R.id.lblMsg2);

        //Format being used here
        lblMsg.setText(money.format(sum));
        lblMsg2.setText(money.format(sum2));


    }
}