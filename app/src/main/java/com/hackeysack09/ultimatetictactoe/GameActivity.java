package com.hackeysack09.ultimatetictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

public class GameActivity extends Activity {
    private Board gameBoard;
    private Board[][] masterBoard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        gameBoard = new Board();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }





    public void boardClick(View view){
        String position = getResources().getResourceEntryName(view.getId());
        System.out.println(position);

        Button selected = (Button) findViewById(view.getId());

        switch(position){

            case "leftTop": gameBoard.makeMove(0,0); break;
            case "middleTop": gameBoard.makeMove(0,1); break;
            case "rightTop": gameBoard.makeMove(0,2); break;

            case "leftCenter": gameBoard.makeMove(1,0); break;
            case "middleCenter": gameBoard.makeMove(1,1); break;
            case "rightCenter": gameBoard.makeMove(1,2); break;

            case "leftBottom": gameBoard.makeMove(2,0); break;
            case "middleBottom": gameBoard.makeMove(2,1); break;
            case "rightBottom": gameBoard.makeMove(2,2); break;
        }

        selected.setText(gameBoard.getClickResult());


    }


}
