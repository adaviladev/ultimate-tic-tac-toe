package com.hackeysack09.ultimatetictactoe;

import android.os.Bundle;
import android.app.Activity;

public class GameActivity extends Activity {

    private Board gameBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
