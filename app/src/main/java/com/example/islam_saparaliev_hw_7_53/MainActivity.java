package com.example.islam_saparaliev_hw_7_53;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String emptyString = "";
    private Button[] buttonsNumber, buttonOperation;
    private Button buttonEqual;
    private TextView tvResult;
    private String firstNumber, secondNumber, result;

    private OperationStatus operationStatus = OperationStatus.DEFAULT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        funFindViewById();
        funNumber(buttonsNumber);
        funOperation(buttonOperation);
        funEqual();
    }

    private void funEqual() {
        buttonEqual.setOnClickListener(v -> {
            secondNumber = tvResult.getText().toString();
            Integer frsNumber = Integer.parseInt(firstNumber);
            Integer secNumber = Integer.parseInt(secondNumber);
            switch (operationStatus) {
                case PLUS:
                    result = String.valueOf(frsNumber + secNumber);
                    break;
                case SUBTRACT:
                    result = String.valueOf(frsNumber - secNumber);
                    break;
                case MULTIPLY:
                    result = String.valueOf(frsNumber * secNumber);
                    break;
                case DIVIDE:
                    result = String.valueOf(frsNumber / secNumber);
                    break;
                case DEFAULT:
                    break;
            }
            tvResult.setText(result);
            firstNumber = emptyString;
            secondNumber = emptyString;
            operationStatus = OperationStatus.DEFAULT;
        });
    }

    private void funOperation(Button[] buttonOperation) {
        Button button_plus = findViewById(R.id.btn_plus);
        Button btn_subtract = findViewById(R.id.btn_minus);
        Button btn_multiple = findViewById(R.id.btn_multiply);
        Button btn_divided = findViewById(R.id.btn_divide);
        Button btn_reset = findViewById(R.id.btn_remove);


        btn_reset.setOnClickListener(v -> {
            tvResult.setText("0");
        });
        button_plus.setOnClickListener(v -> {
            firstNumber=tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.PLUS;
        });
        btn_subtract.setOnClickListener(v -> {
            firstNumber=tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.SUBTRACT;
        });
        btn_multiple.setOnClickListener(v -> {
            firstNumber=tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.MULTIPLY;
        });
        btn_divided.setOnClickListener(v -> {
            firstNumber=tvResult.getText().toString();
            tvResult.setText("0");
            operationStatus = OperationStatus.DIVIDE;
        });
    }

    private void funNumber(Button[] buttonsNumber) {
        Button button1 = findViewById(R.id.btn_one);
        Button button2 = findViewById(R.id.btn_two);
        Button button3 = findViewById(R.id.btn_three);
        Button button4 = findViewById(R.id.btn_for);
        Button button5 = findViewById(R.id.btn_five);
        Button button6 = findViewById(R.id.btn_six);
        Button button7 = findViewById(R.id.btn_seven);
        Button button8 = findViewById(R.id.btn_eight);
        Button button9 = findViewById(R.id.btn_nine);
        Button button0 = findViewById(R.id.btn_0);
        firstNumber = "";

        button1.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("1");
            } else {
                tvResult.setText(tvResult.getText() + "1");
            }
        });
        button2.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("2");
            } else {
                tvResult.setText(tvResult.getText() + "2");
            }
        });
        button3.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("3");
            } else {
                tvResult.setText(tvResult.getText() + "3");
            }
        });
        button4.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("4");
            } else {
                tvResult.setText(tvResult.getText() + "4");
            }
        });
        button5.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("5");
            } else {
                tvResult.setText(tvResult.getText() + "5");
            }
        });
        button6.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("6");
            } else {
                tvResult.setText(tvResult.getText() + "6");
            }
        });
        button7.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("7");
            } else {
                tvResult.setText(tvResult.getText() + "7");
            }
        });
        button8.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("8");
            } else {
                tvResult.setText(tvResult.getText() + "8");
            }
        });
        button9.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("9");
            } else {
                tvResult.setText(tvResult.getText() + "9");
            }
        });
        button0.setOnClickListener(v -> {
            if (tvResult.getText().toString().equals("0")) {
                tvResult.setText("0");
            } else {
                tvResult.setText(tvResult.getText() + "0");
            }
        });

    }

    private void funFindViewById() {
        buttonOperation = new Button[]{
                findViewById(R.id.btn_plus),
        };
        buttonsNumber = new Button[]{
        };
        buttonEqual = findViewById(R.id.btn_equal);
        tvResult = findViewById(R.id.tv_result);
    }

    private enum OperationStatus {
        DEFAULT, PLUS, SUBTRACT, MULTIPLY, DIVIDE
    }
}