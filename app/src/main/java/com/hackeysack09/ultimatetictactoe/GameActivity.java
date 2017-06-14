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

import java.io.IOException;
import java.util.ArrayList;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.DataOutputStream;

public class GameActivity extends Activity {
    static String api_url = "10.0.3.2";
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_game);

    LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View gameView = inflater.inflate(R.layout.activity_game, null);

    Board masterBoard = (Board) gameView.findViewById(R.id.master_board);
    int size = masterBoard.getSize();
    Button cells[][] = masterBoard.getCells();
    LinearLayout linearLayout = new LinearLayout(this);
    linearLayout.setOrientation(LinearLayout.VERTICAL);

    for(int i = 0; i < size; i++){
      LinearLayout row = new LinearLayout(this);
      row.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
      for(int j = 0; j < size; j++){
        System.out.println(cells[i][j].getText());
        Button tempButton = cells[i][j];
        tempButton.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        row.addView(tempButton);

      }
      linearLayout.addView(row);
    }
    masterBoard.addView(linearLayout);


    System.out.println("\nbefore speaking\n");
    masterBoard.speak();
    System.out.println("\nafter speaking\n");
    setContentView(gameView);
  }

  protected void createBoardGame(){
      // method to create session row if it can't find a board game on the database side
      api_url +="/create";
      DataOutputStream writer;
      try {
          URL api = new URL(api_url);
          HttpURLConnection httpURLConnection = (HttpURLConnection) api.openConnection();

          if(httpURLConnection.getResponseCode() == 200){
              writer = new DataOutputStream(httpURLConnection.getOutputStream());

              writer.writeBytes("fake ip address");

          }
      } catch(IOException e){
          System.out.println("can't read from url");
          System.out.println(e.getMessage());
      }


      //part that listens for response from api





  }


  protected void updateBoardGame(){
      // sends updated version of board to api and database side
      api_url +="/update";
      DataOutputStream writer;
      try {
          URL api = new URL(api_url);
          HttpURLConnection httpURLConnection = (HttpURLConnection) api.openConnection();

          if(httpURLConnection.getResponseCode() == 200){
              writer = new DataOutputStream(httpURLConnection.getOutputStream());

              writer.writeBytes("fake ip address");

          }
      } catch(IOException e){
          System.out.println("can't read from url");
          System.out.println(e.getMessage());
      }

      //part that listens for response from api

  }


  protected void deleteBoardGame(){
      // method that cleans up board after game is finished
      api_url +="/delete";
      DataOutputStream writer;
      try {
          URL api = new URL(api_url);
          HttpURLConnection httpURLConnection = (HttpURLConnection) api.openConnection();

          if(httpURLConnection.getResponseCode() == 200){
              writer = new DataOutputStream(httpURLConnection.getOutputStream());

              writer.writeBytes("fake ip address");

          }
      } catch(IOException e){
          System.out.println("can't read from url");
          System.out.println(e.getMessage());
      }
  }

    //part that listens for response from api
}
