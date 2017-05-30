package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

class Board extends FrameLayout {
  public static int size;
  public static boolean isParent;
  private Context context;
  private AttributeSet attributeSet;

  private Cell cells[][];

  public Board(Context context, AttributeSet attrs) {
    super(context, attrs);

    this.context = context;
    this.attributeSet = attrs;
    System.out.println("with attrs");

    TypedArray typedArray = context
      .obtainStyledAttributes(
        attrs,
        R.styleable.Board
      );

    try {
      Board.size = typedArray.getInteger(R.styleable.Board_size, 3);
      Board.isParent = typedArray.getBoolean(R.styleable.Board_is_parent, false);
      System.out.println("Is parent: " + Board.isParent);
      init();
      // loopCells();
    } finally {
      typedArray.recycle();
    }
  }

  private void loopCells() {
    for (int i = 0; i < Board.size; i++) {
      for (int j = 0; j < Board.size; j++) {
        System.out.println(i + "-" + j + " : " + this.cells[i][j]);
      }
      System.out.println("\n");
    }
  }

  private void init() {
    this.cells = new Cell[Board.size][Board.size];
    for (int i = 0; i < Board.size; i++) {
      for (int j = 0; j < Board.size; j++) {
        Cell tempCell = new Cell(this.context, null);
        // tempCell.addView(tempButton);
        tempCell.setTag(i + "_" + j);
        tempCell.setId(j + 1 + (i * Board.size));
        // tempCell.setMark(tempCell.getTag().toString());
        // tempCell.setText(((Integer)tempCell.getId()).toString());
        this.cells[i][j] = tempCell;
      }
    }
    Board.isParent = false;
    // loopCells();
  }

  public void speak() {
    System.out.println("Speaking");
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    Board.size = size;
  }

  public Cell[][] getCells() {
    return cells;
  }

  public void setCells(Cell[][] cells) {
    this.cells = cells;
  }

}
