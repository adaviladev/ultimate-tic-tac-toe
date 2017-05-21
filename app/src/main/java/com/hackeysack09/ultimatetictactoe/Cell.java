package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.view.View;


class Cell extends View {

  private enum markings{UNMARKED , X, O}

  private final markings mark;

  Cell(Context context) {
    super(context);
    this.mark = markings.UNMARKED;
  }

  public markings getMark() {
    return mark;
  }

}
