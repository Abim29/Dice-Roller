package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.diceroller.databinding.ActivityMainBinding;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.button.setOnClickListener(v -> rollDice());
        rollDice();
    }

    private void rollDice() {
        Dice dice = new Dice(6);
        int diceRoll = dice.roll();
        switch (diceRoll){
            case 1:
                binding.diceResultImage.setImageResource(R.drawable.dice_1);
                break;
            case 2:
                binding.diceResultImage.setImageResource(R.drawable.dice_2);
                break;
            case 3:
                binding.diceResultImage.setImageResource(R.drawable.dice_3);
                break;
            case 4:
                binding.diceResultImage.setImageResource(R.drawable.dice_4);
                break;
            case 5:
                binding.diceResultImage.setImageResource(R.drawable.dice_5);
                break;
            default:
                binding.diceResultImage.setImageResource(R.drawable.dice_6);
        }
        binding.diceResultImage.setContentDescription(Integer.toString(diceRoll));
    }
}

class Dice {
    int numSides;
    public Dice(int numSides) {
        this.numSides = numSides;
    }
    public int roll() {
        Random random = new Random();
        int num = random.nextInt(numSides);
        return num+1;
    }
}