package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

class Board extends View {
  private Context context;
  private Cell[][] cells;
  private int size = 3;
  private int turns = 0;
  public int last_row;
  public int last_col;

  public Board(Context context) {
    super(context, null);
    System.out.println("with context");
  }

  public Board(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs, R.attr.layout);
    System.out.println("with attrs");
  }

  public Board(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr, 0);
    System.out.println("with defStyleAttr");
  }

  public Board(Context context, @Nullable AttributeSet attrs, int defStyleAttrs, int defStyleRes) {
    super(context, attrs, defStyleAttrs, defStyleRes);
    System.out.println("with defStyleRes");
  }

  public Board initialize() {
    this.cells = new Cell[size][size];

    return this;
  }

}
