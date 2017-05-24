package com.hackeysack09.ultimatetictactoe;

class Mark {
  private static String unMarked = "";
  private static String X = "X";
  private static String O = "O";

  public static String getUnMarked() {
    return unMarked;
  }

  public static String getX() {
    return X;
  }

  public static String getO() {
    return O;
  }

  public static String getRandom(int max) {
    String marks[] = {unMarked, X, O};
    return marks[(int)Math.random()* (max)];
  }
};
