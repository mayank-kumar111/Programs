package com.example.p2_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 1. Declare UI Elements
    EditText num1, num2;
    TextView resultView;
    Button btnAdd, btnSub, btnMul, btnDiv, btnReset;

    // Variable to store the operation type
    String operation = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Standard Edge-to-Edge window padding logic
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // 2. Initialize UI Elements (Link with XML IDs)
        num1 = findViewById(R.id.enter_num1);
        num2 = findViewById(R.id.enter_num2);
        resultView = findViewById(R.id.result);

        btnAdd = findViewById(R.id.add);
        btnSub = findViewById(R.id.substract);
        btnMul = findViewById(R.id.multiply);
        btnDiv = findViewById(R.id.divide);
        btnReset = findViewById(R.id.reset);
        Button btnSubmit = findViewById(R.id.submit_result);

        // 3. Set up Click Listeners for Operations
        btnAdd.setOnClickListener(v -> operation = "+");
        btnSub.setOnClickListener(v -> operation = "-");
        btnMul.setOnClickListener(v -> operation = "*");
        btnDiv.setOnClickListener(v -> operation = "/");

        // 4. Logic for the "Result" Button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });

        // 5. Logic for the "Reset" Button
        btnReset.setOnClickListener(v -> {
            num1.setText("");
            num2.setText("");
            resultView.setText("");
            operation = "";
        });
    }

    private void calculateResult() {
        String s1 = num1.getText().toString();
        String s2 = num2.getText().toString();

        // Check if inputs are empty
        if (s1.isEmpty() || s2.isEmpty()) {
            Toast.makeText(this, "Please enter numbers", Toast.LENGTH_SHORT).show();
            return;
        }

        if (operation.isEmpty()) {
            Toast.makeText(this, "Please select an operator (+, -, *, /)", Toast.LENGTH_SHORT).show();
            return;
        }

        double n1 = Double.parseDouble(s1);
        double n2 = Double.parseDouble(s2);
        double res = 0;

        switch (operation) {
            case "+": res = n1 + n2; break;
            case "-": res = n1 - n2; break;
            case "*": res = n1 * n2; break;
            case "/":
                if (n2 != 0) res = n1 / n2;
                else {
                    resultView.setText("Error: Div by 0");
                    return;
                }
                break;
        }

        resultView.setText("Result: " + res);
    }
}