package day17;

public enum ChessPiece {
    KING_WHITE(100, "♔"), KING_BLACK(100, "♚"), ////король (англ. king)
    QUEEN_WHITE(9, "♕"), QUEEN_BLACK(9, "♛"), //ферзь (англ. queen
    ROOK_WHITE(5, "♖"), ROOK_BLACK(5, "♜"), //ладья (англ. rook)
    BISHOP_WHITE(3.5, "♗"), //слон (англ. bishop)
    BISHOP_BLACK(3.5,"♝"),
    KNIGHT_WHITE(3, "♘"), //конь (англ. knight)
    KNIGHT_BLACK(3, "♞"),
    PAWN_WHITE(1, "♙"), PAWN_BLACK(1, "♟"), //пешка (англ. pawn).
    EMPTY(-1, "_");


    private double price;
    private String stringDescription;

    private ChessPiece(double price, String stringDescription){
        this.price = price;
        this.stringDescription = stringDescription;
    }

    public double getPrice(){
        return price;
    }

    public String getStringDescription() {
        return stringDescription;
    }

    public String toString(){
        return stringDescription;
    }
}
