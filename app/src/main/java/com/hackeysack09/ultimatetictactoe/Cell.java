package com.hackeysack09.ultimatetictactoe;


class Cell {
    public enum state {UNMARKED, X, O}
    private state currentState;


    Cell(state newState){
        currentState = newState;
    }


    state getCurrentState(){
        return currentState;
    }

    void setState(state newState){
        currentState = newState;
    }

    boolean isNotMarked(){
        if(getCurrentState() == state.UNMARKED)
            return true;
        return false;
    }
}
