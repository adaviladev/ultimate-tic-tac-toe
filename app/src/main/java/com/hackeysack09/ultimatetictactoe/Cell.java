package com.hackeysack09.ultimatetictactoe;

import android.content.Context;
import android.view.ViewGroup;

class Cell extends ViewGroup {
  private Context context;

  Cell(Context context) {
    super(context);
    this.context = context;
  }

  @Override
  protected void onLayout(boolean changed, int l, int t, int r, int b) {

  }
}
