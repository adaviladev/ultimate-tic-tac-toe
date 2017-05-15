package com.hackeysack09.ultimatetictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);

  }

  public void startGame(View view) {
    Intent gameIntent = new Intent(this, GameActivity.class);

    System.out.println("Game start");
    startActivity(gameIntent);
  }
}
