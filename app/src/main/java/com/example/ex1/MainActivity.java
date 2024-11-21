package com.example.ex1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.character_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Sample data
        List<Character> characters = Arrays.asList(
                new Character("Princess Tiabeanie", "bean@example.com", "123-456-7890", "Playing Guitar", R.drawable.bean),
                new Character("Elfo", "elfo@example.com", "987-654-3210", "Cooking", R.drawable.elfo)
        );

        // Set up adapter (you'll need to implement this adapter)
        CharacterAdapter adapter = new CharacterAdapter(characters, this);
        recyclerView.setAdapter(adapter);
    }
}
