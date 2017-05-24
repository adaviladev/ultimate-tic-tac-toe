package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;


class Cell extends FrameLayout {

  // private final boolean isParent;

  private String mark;

  Cell(Context context) {
    super(context);
    this.mark = Mark.getUnMarked();

    // try {
    //   this.isParent = typedArray.getBoolean(R.styleable.Cell_is_parent, false);
    //   // init();
    //   // loopCells();
    // } finally {
    //   typedArray.recycle();
    // }
  }

}
