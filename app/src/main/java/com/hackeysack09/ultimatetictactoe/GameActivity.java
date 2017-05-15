package com.hackeysack09.ultimatetictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class GameActivity extends Activity {
    private Board gameBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        gameBoard = new Board();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }





    public void BoardClick(View view){
        System.out.println(getResources().getResourceName(view.getId()));
    }


}
