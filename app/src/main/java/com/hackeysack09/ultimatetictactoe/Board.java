package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

class Board extends FrameLayout {
  private int size;

  private Button cells[][];

  public Board(Context context, AttributeSet attrs) {
    super(context, attrs);
    System.out.println("with attrs");

    TypedArray typedArray = context
      .obtainStyledAttributes(
        attrs,
        R.styleable.Board
      );

    try {
      this.size = typedArray.getInteger(R.styleable.Board_size, 3);
      init();
      // loopCells();
    } finally {
      typedArray.recycle();
    }
  }

  private void loopCells() {
    for (int i = 0; i < this.size; i++) {
      for (int j = 0; j < this.size; j++) {
        System.out.println(i + "-" + j + " : " + this.cells[i][j]);
      }
      System.out.println("\n");
    }
  }

  private void init() {
    this.cells = new Button[this.size][this.size];
    for (int i = 0; i < this.size; i++) {
      for (int j = 0; j < this.size; j++) {
        Button tempButton = new Button(getContext());
        tempButton.setWidth(50);
        tempButton.setTag(i + "_" + j);
        tempButton.setId(j + 1 + (i * this.size));
        tempButton.setText(tempButton.getTag().toString());
        tempButton.setText(((Integer)tempButton.getId()).toString());
        tempButton.setOnClickListener(clickCell);
        this.cells[i][j] = tempButton;
      }
    }
    // loopCells();
  }

  public void speak() {
    System.out.println("Speaking");
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public Button[][] getCells() {
    return cells;
  }

  public void setCells(Button[][] cells) {
    this.cells = cells;
  }

  OnClickListener clickCell = new OnClickListener() {
    @Override
    public void onClick(View button) {
      System.out.println(button.getId());
    }
  };

}
