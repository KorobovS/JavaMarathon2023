package day17;

public class ChessBoard {
    private ChessPiece[][] pieces;

    public ChessBoard(ChessPiece[][] pieces) {
        this.pieces = pieces;
    }

    public void print() {
        for (ChessPiece[] piece1 : pieces) {
            for (ChessPiece piece : piece1) {
                System.out.print(piece.getName());
            }
            System.out.println();
        }
    }
}
