package com.example.ex1;

import java.util.Arrays;
import java.util.List;

public class CharacterData {
    public static List<Character> getCharacters() {
        return Arrays.asList(
                new Character("Princess Tiabeanie", "bean@example.com", "123-456-7890", "Getting Stone", R.drawable.bean),
                new Character("Elfo", "elfo@example.com", "987-654-3210", "bouncing", R.drawable.elfo),
                new Character("Luci", "luci@example.com", "987-654-3210", "making fun of people", R.drawable.luci),
                new Character("Zog", "zog@example.com", "987-654-3210", "I don't have time for hobbies", R.drawable.zog),
                new Character("Mop Girl", "mop_girl@example.com", "987-654-3210", "writing novels", R.drawable.mop_girl)
        );
    }
}