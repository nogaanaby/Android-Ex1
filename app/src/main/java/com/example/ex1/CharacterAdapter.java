package com.example.ex1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {

    private final List<Character> characters;
    private final Context context;

    public CharacterAdapter(List<Character> characters, Context context) {
        this.characters = characters;
        this.context = context;
    }

    @NonNull
    @Override
    public CharacterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.profile_activity, parent, false);
        return new CharacterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CharacterViewHolder holder, int position) {
        Character character = characters.get(position);
        holder.nameTextView.setText(character.getName());
        holder.emailTextView.setText(character.getEmail());
        holder.phoneTextView.setText(character.getPhone());
        holder.hobbyTextView.setText(character.getHobby());
        holder.imageView.setImageResource(character.getImageResourceId());
    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, emailTextView, phoneTextView, hobbyTextView;
        ImageView imageView;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.character_name);
            emailTextView = itemView.findViewById(R.id.character_email);
            phoneTextView = itemView.findViewById(R.id.character_phone);
            hobbyTextView = itemView.findViewById(R.id.character_hobby);
            imageView = itemView.findViewById(R.id.character_image);
        }
    }
}
