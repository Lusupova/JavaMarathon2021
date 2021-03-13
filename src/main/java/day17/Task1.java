package day17;

import java.util.Arrays;


public class Task1 {
    public static void main(String[] args) {

        ChessPiece pawnChess = ChessPiece.PAWN_WHITE;
        ChessPiece rookChess = ChessPiece.ROOK_BLACK;

        String[] figures = new String[8];
        for (int i = 0, j = 4; (i < 4 && j < 8); i++, j++) {
            figures[i] = pawnChess.getStringDescription();
            figures[j] = rookChess.getStringDescription();
        }

        System.out.println(Arrays.toString(figures));
    }
}