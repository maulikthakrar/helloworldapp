package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.helloworld.models.PlayerModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<PlayerModel> playerList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 100; i++) {
            int index=i++;
            PlayerModel playerModel = new PlayerModel();
            playerModel.setPlayerName("Player"+ index);
            playerModel.setBalls(10);
            playerModel.setRun(55);
            playerModel.setFour(5);
            playerModel.setSixes(1);
            playerModel.setStrikeRate(70);
            playerList.add(playerModel);
        }
    }
}