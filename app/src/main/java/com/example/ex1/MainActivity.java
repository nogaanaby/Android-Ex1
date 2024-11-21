package com.example.ex1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;


import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.character_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        TextView dynamicTextView = findViewById(R.id.dynamic_text);
        dynamicTextView.setText("Hello, this is dynamically added text!");

        List<Character> characters = Arrays.asList(
                new Character("Princess Tiabeanie", "bean@example.com", "123-456-7890", "Getting Stone", R.drawable.bean),
                new Character("Elfo", "elfo@example.com", "987-654-3210", "bouncing", R.drawable.elfo),
                new Character("luci", "luci@example.com", "987-654-3210", "making fun of people", R.drawable.luci),
                new Character("zog", "zog@example.com", "987-654-3210", "I don't have time for hobbies", R.drawable.zog),
                new Character("mop girl", "mop_girl@example.com", "987-654-3210", "writing novels", R.drawable.mop_girl)
        );

        // Set up adapter (you'll need to implement this adapter)
        CharacterAdapter adapter = new CharacterAdapter(characters, this);
        recyclerView.setAdapter(adapter);
    }
}
