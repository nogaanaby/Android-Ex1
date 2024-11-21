package com.example.ex1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.CharacterViewHolder> {

    private final List<Character> characters;
    private final Context context;

    public ProfileAdapter(List<Character> characters, Context context) {
        this.characters = characters;
        this.context = context;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.character_item, parent, false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        Character character = characters.get(position);
        holder.nameTextView.setText(character.getName());
        holder.imageView.setImageResource(character.getImageResourceId());

        holder.imageView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ProfileActivity.class);
            intent.putExtra("name", character.getName());
            intent.putExtra("email", character.getEmail());
            intent.putExtra("phone", character.getPhone());
            intent.putExtra("hobby", character.getHobby());
            intent.putExtra("imageResourceId", character.getImageResourceId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        ImageView imageView;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.character_name);
            imageView = itemView.findViewById(R.id.character_image);
        }
    }
}