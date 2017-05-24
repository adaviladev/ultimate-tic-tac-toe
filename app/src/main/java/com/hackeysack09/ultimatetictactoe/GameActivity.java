package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);

    LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View gameView = inflater.inflate(R.layout.activity_game, null);

    Board masterBoard = (Board) gameView.findViewById(R.id.master_board);
    int size = masterBoard.getSize();
    Cell cells[][] = masterBoard.getCells();
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setOrientation(LinearLayout.VERTICAL);

    for(int i = 0; i < size; i++){
      LinearLayout row = new LinearLayout(this);
      FrameLayout.LayoutParams frameParams = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
      row.setLayoutParams(frameParams);
      for(int j = 0; j < size; j++){
        System.out.println(cells[i][j].getTag());
        Cell tempCell = cells[i][j];
        LinearLayout.LayoutParams linearParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        linearParams.weight = size;
        // linearParams.height = linearParams.width;
        tempCell.setLayoutParams(linearParams);
        // tempCell.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        row.addView(tempCell);

      }
      linearLayout.addView(row);
    }
    masterBoard.addView(linearLayout);


    System.out.println("\nbefore speaking\n");
    masterBoard.speak();
    System.out.println("\nafter speaking\n");
    setContentView(gameView);
  }
}
