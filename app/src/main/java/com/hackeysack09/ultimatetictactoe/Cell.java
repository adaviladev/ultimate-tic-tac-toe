package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;


class Cell extends FrameLayout {

  private boolean isParent;

  private String mark;

  Cell(Context context, AttributeSet attrs) {
    super(context, attrs);
    this.mark = Mark.getUnMarked();

    TypedArray typedArray = context
      .obtainStyledAttributes(
        attrs,
        R.styleable.Board
      );

    try {
      this.isParent = Board.isParent;
      init(context);
      // loopCells();
    } finally {
      typedArray.recycle();
    }
  }

  private void init(Context context) {
    if(Board.isParent) {
      Board childBoard = new Board(context, null);
      this.addView(childBoard);
    } else {
      Button tempButton = new Button(context);
      tempButton.setWidth(100);
      // tempButton.setText(Mark.getRandom(Board.size));
      tempButton.setText("sdf");
      // tempButton.setTag(i + "_" + j);
      tempButton.setTag("_");
      tempButton.setOnClickListener(clickCell);
      System.out.println(tempButton.getTag());
      this.addView(tempButton);
    }
  }

  OnClickListener clickCell = new OnClickListener() {
    @Override
    public void onClick(View button) {
      System.out.println(button.getParent().toString());
    }
  };

}
