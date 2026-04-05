package com.example.p9_swipe_gaming_app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Modelclass> barsColor;
    private Adapter adapter;
    private AlertDialog.Builder alertDialog;

    // Counter Variables
    private int score = 0;
    private TextView scoreTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        // Initialize UI
        scoreTextView = findViewById(R.id.scoreCounter);
        recyclerView = findViewById(R.id.recyclerview);

        // Setup Data
        barsColor = new ArrayList<>();
        generateRandomBars();

        // Setup Adapter
        adapter = new Adapter(this, barsColor);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Add Swipe Functionality
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    // Logic to generate 15 random colored bars
    private void generateRandomBars() {
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int n = random.nextInt(2);
            if (n == 0) {
                barsColor.add(new Modelclass("red"));
            } else {
                barsColor.add(new Modelclass("blue"));
            }
        }
    }

    ItemTouchHelper.SimpleCallback simpleCallback = new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {
        @Override
        public boolean onMove(@NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.ViewHolder viewHolder, @NonNull @NotNull RecyclerView.ViewHolder target) {
            return false;
        }

        @Override
        public void onSwiped(@NonNull @NotNull RecyclerView.ViewHolder viewHolder, int direction) {
            int position = viewHolder.getAdapterPosition();
            String currentColor = barsColor.get(position).getColor();

            if (direction == ItemTouchHelper.LEFT) {
                // LEFT swipe is for BLUE
                if (currentColor.equals("blue")) {
                    handleCorrectSwipe(position);
                } else {
                    handleWrongSwipe();
                }
            } else if (direction == ItemTouchHelper.RIGHT) {
                // RIGHT swipe is for RED
                if (currentColor.equals("red")) {
                    handleCorrectSwipe(position);
                } else {
                    handleWrongSwipe();
                }
            }
        }
    };

    private void handleCorrectSwipe(int position) {
        // Remove item and update UI
        barsColor.remove(position);
        adapter.notifyItemRemoved(position);

        // Update Score
        score++;
        scoreTextView.setText("Score: " + score);

        // Optional: Add a new bar to the end so the game never ends
        Random random = new Random();
        barsColor.add(new Modelclass(random.nextInt(2) == 0 ? "red" : "blue"));
    }

    private void handleWrongSwipe() {
        endthegame();
        // Reset Score on failure
        score = 0;
        scoreTextView.setText("Score: " + score);
        adapter.notifyDataSetChanged();
        alertDialog.show();
    }

    private void endthegame() {
        alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Game Over")
                .setMessage("Oops! Wrong side! Try Again!")
                .setCancelable(false)
                .setPositiveButton("Try Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "Restarting...", Toast.LENGTH_SHORT).show();
                        // Refill the list
                        barsColor.clear();
                        generateRandomBars();
                        adapter.notifyDataSetChanged();
                    }
                })
                .setNegativeButton("Later", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish(); // Closes the app
                    }
                });
        alertDialog.create();
    }
}