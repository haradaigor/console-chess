package boardgame;

public class BoardException extends RuntimeException{
    public BoardException (String errorMessage){
        super(errorMessage);
    }
}
