package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

class Board extends FrameLayout {
  private int size;
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
    this.cells = new Cell[this.size][this.size];
    for (int i = 0; i < this.size; i++) {
      for (int j = 0; j < this.size; j++) {
        Cell tempCell = new Cell(this.context);
        Button tempButton = new Button(this.context);
        tempButton.setWidth(100);
        tempButton.setText(Mark.getRandom(this.size));
        tempButton.setTag(i + "_" + j);
        tempButton.setOnClickListener(clickCell);
        System.out.println(tempButton.getTag());
        tempCell.addView(tempButton);
        tempCell.setTag(i + "_" + j);
        tempCell.setId(j + 1 + (i * this.size));
        // tempCell.setMark(tempCell.getTag().toString());
        // tempCell.setText(((Integer)tempCell.getId()).toString());
        this.cells[i][j] = tempCell;
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

  public Cell[][] getCells() {
    return cells;
  }

  public void setCells(Cell[][] cells) {
    this.cells = cells;
  }

  OnClickListener clickCell = new OnClickListener() {
    @Override
    public void onClick(View button) {
      System.out.println(button.getId());
    }
  };

}
