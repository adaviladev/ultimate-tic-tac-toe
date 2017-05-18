package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.TextView;

class Board extends ViewGroup {
  private Context context;
  private Cell[][] cells;
  private int size = 3;
  private int turns = 0;
  public int last_row;
  public int last_col;

  public Board(Context context) {
    super(context);
  }

  @Override
  protected void onLayout(boolean changed, int l, int t, int r, int b) {

  }

  public Board initialize() {
    this.cells = new Cell[size][size];

    /*for (int row = 0; row < size; row++) {
      for (int col = 0; col < size; col++) {
        cells[row][col] = new Cell(context , Cell.state.UNMARKED);
      }
    }*/
    return this;
  }

  /*void makeMove(int row, int col) {

    if (turns % 2 == 0 && cells[row][col].isNotMarked()) {
      cells[row][col].setState(Cell.state.X);
      turns += 1;
    }
    if (turns % 2 == 1 && cells[row][col].isNotMarked()) {
      cells[row][col].setState(Cell.state.O);
      turns += 1;
    }

    last_row = row;
    last_col = col;
  }

  String getClickResult() {
    switch (cells[last_row][last_col].getCurrentState()) {

      case X:
        return "X";
      case O:
        return "O";
    }
    return "";
  }*/

}
