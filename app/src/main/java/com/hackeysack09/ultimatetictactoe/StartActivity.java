package com.hackeysack09.ultimatetictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {
  private Button click;
  private Button twoPlayerLocalButton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_start);

    click = (Button) findViewById(R.id.button);

    click.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        String result = (click.getText().equals(getResources().getString(R.string.button_string)))
                        ? "This Works!" : getResources().getString(R.string.button_string);

        click.setText(result);

        System.out.println("Switch");
      }
    });

  }

  public void startGame(View view) {
    Intent gameIntent = new Intent(this, GameActivity.class);

    System.out.println("Game start");
    startActivity(gameIntent);
  }
}
