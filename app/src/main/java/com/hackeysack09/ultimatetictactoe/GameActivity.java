package com.hackeysack09.ultimatetictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class GameActivity extends Activity {
  private Board gameBoard;
  private Board[][] masterBoard;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    System.out.println("\nGameActivity\n");
    final TextView textView = new TextView(this);
    textView.setText(R.string.background_description);

    final Board board = new Board(this);
    System.out.println(textView.getText());
    Button button = new Button(this);
    button.setOnClickListener(new View.OnClickListener(){
      @Override
      public void onClick(View view) {
        boardClick(board);
      }
    });

    setContentView(button);
  }

  public void boardClick(View view) {
    System.out.println(R.string.twoPlayerOnline);

  }

}
