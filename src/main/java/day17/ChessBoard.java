package day17;
public class ChessBoard {

    ChessPiece[][] chessBord;

    public ChessBoard(ChessPiece[][] chessBord) {
        this.chessBord = chessBord;
    }

    public void print(){
        for (int m = 0; m < chessBord.length; m++) {
            for (int n = 0; n < chessBord[m].length; n++) {
                System.out.print(chessBord[m][n].getStringDescription());
            }
            System.out.println();
        }
    }
}
