package com.hackeysack09.ultimatetictactoe;



class Board {
    private Cell[][] gameBoard;
    private int turns;

    public Board(){
        turns = 0;
        gameBoard = new Cell[3][3];
        initializeBoard(gameBoard);
    }




    private void initializeBoard(Cell[][] gameBoard){

        for(int row = 0; row < 3; row++)
            for(int col = 0; col < 3; col++)
                gameBoard[row][col] = new Cell(Cell.state.UNMARKED);

    }


    public void makeMove(int row, int col) {

        if (turns % 2 == 0 && gameBoard[row][col].isNotMarked()) {
            gameBoard[row][col].setState(Cell.state.X);
            turns += 1;
        }
        if (turns % 2 == 1 && gameBoard[row][col].isNotMarked()) {
            gameBoard[row][col].setState(Cell.state.O);
            turns += 1;
        }

    }

}
