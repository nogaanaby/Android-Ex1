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

        List<Character> characters = CharacterData.getCharacters();
        CharacterListAdapter adapter = new CharacterListAdapter(characters, this);
        recyclerView.setAdapter(adapter);
    }
}