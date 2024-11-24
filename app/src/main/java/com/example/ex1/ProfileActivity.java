package com.example.ex1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private int totalLikes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        ImageView imageView = findViewById(R.id.character_image);
        TextView nameTextView = findViewById(R.id.character_name);
        TextView emailTextView = findViewById(R.id.character_email);
        TextView phoneTextView = findViewById(R.id.character_phone);
        TextView hobbyTextView = findViewById(R.id.character_hobby);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            nameTextView.setText(extras.getString("name"));
            emailTextView.setText(extras.getString("email"));
            phoneTextView.setText(extras.getString("phone"));
            hobbyTextView.setText(extras.getString("hobby"));
            imageView.setImageResource(extras.getInt("imageResourceId"));
        }


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

        Button backButton = findViewById(R.id.back_to_main_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}