package com.example.p3_intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText username, password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Check these IDs against your activity_main.xml file!
        username = findViewById(R.id.enter_username);
        password = findViewById(R.id.enter_password);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(view -> {
            String usernameText = username.getText().toString().trim();
            String passwordText = password.getText().toString().trim();

            // 1. Validation Check
            if (usernameText.isEmpty() || passwordText.isEmpty()) {
                Toast.makeText(MainActivity.this, "Please enter all fields", Toast.LENGTH_SHORT).show();
            }
            // 2. Authentication Logic
            else if (usernameText.equals("admin") && passwordText.equals("admin")) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                intent.putExtra("userNameKey", usernameText);
                startActivity(intent);
                finish(); // Optional: Call finish() so user can't go back to login by pressing 'Back'
            }
            // 3. Failure Case
            else {
                Toast.makeText(MainActivity.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        });
    }
}