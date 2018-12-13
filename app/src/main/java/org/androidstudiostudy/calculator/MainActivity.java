package org.androidstudiostudy.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button min;
    private Button mul;
    private Button div;
    private Button sub;
    private Button clear;
    private Button point;
    private Button comma;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char MINUS = '-';
    private final char MULTIPLY = '*';
    private final char DIVISION = '/';
    private final char EQU = 0;
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + "0");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ".");
            }
        });
        comma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() + ",");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });
        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MINUS;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLY;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                // 5 + 4 = 9
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (info.getText().length() > 0){
                    CharSequence name = info.getText().toString();
                    info.setText(name.subSequence(0, name.length()-1));
                }
                else{
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    info.setText(null);
                    result.setText(null);
                }
            }
        });


    }

    private  void setupUIViews(){

        one = (Button) findViewById(R.id.Btn1);
        two = (Button) findViewById(R.id.Btn2);
        three = (Button) findViewById(R.id.Btn3);
        four = (Button) findViewById(R.id.Btn4);
        five = (Button) findViewById(R.id.Btn5);
        six = (Button) findViewById(R.id.Btn6);
        seven = (Button) findViewById(R.id.Btn7);
        eight = (Button) findViewById(R.id.Btn8);
        nine = (Button) findViewById(R.id.Btn9);
        zero = (Button) findViewById(R.id.Btn0);
        add = (Button) findViewById(R.id.BtnAdd);
        min = (Button) findViewById(R.id.BtnMinus);
        mul = (Button) findViewById(R.id.BtnMultiply);
        div = (Button) findViewById(R.id.BtnDivide);
        sub = (Button) findViewById(R.id.BtnSub);
        point = (Button) findViewById(R.id.BtnPoint);
        comma = (Button) findViewById(R.id.BtnComma);
        clear = (Button) findViewById(R.id.BtnClear);
        info = (TextView) findViewById(R.id.tvControl);
        result = (TextView) findViewById(R.id.tvResult);

    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch (ACTION){
                case ADDITION:
                    val1 = val1 + val2;
                    break;
                case MINUS:
                    val1 = val1 - val2;
                    break;
                case MULTIPLY:
                    val1 = val1 * val2;
                    break;
                case DIVISION:
                    val1 = val1 / val2;
                    break;
                case EQU:
                    break;
            }
        }

        else{
            val1 = Double.parseDouble(info.getText().toString());
        }
    }
}
