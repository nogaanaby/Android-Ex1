package com.example.ex1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CharacterListAdapter extends RecyclerView.Adapter<CharacterListAdapter.CharacterViewHolder> {

    private List<Character> characterList;
    private Context context;

    public CharacterListAdapter(List<Character> characterList, Context context) {
        this.characterList = characterList;
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
        Character character = characterList.get(position);
        holder.characterNameTextView.setText(character.getName());
        holder.characterImageView.setImageDrawable(context.getDrawable(character.getImageResourceId()));

        holder.itemView.setOnClickListener(v -> {
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
        return characterList.size();
    }

    public static class CharacterViewHolder extends RecyclerView.ViewHolder {
        TextView characterNameTextView;
        ImageView characterImageView;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            characterNameTextView = itemView.findViewById(R.id.character_name);
            characterImageView = itemView.findViewById(R.id.character_image);
        }
    }
}