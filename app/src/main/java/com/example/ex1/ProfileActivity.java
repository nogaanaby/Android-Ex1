package com.example.ex1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private int totalLikes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        TextView totalLikesTextView = findViewById(R.id.total_likes);
        Button likeButton = findViewById(R.id.like_button);

        totalLikesTextView.setText(String.format(getString(R.string.total_likes), totalLikes));

        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                totalLikes++;
                totalLikesTextView.setText(String.format(getString(R.string.total_likes), totalLikes));
            }
        });
    }
}