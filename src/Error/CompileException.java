package Error;

import org.antlr.v4.runtime.Token;

public class CompileException extends RuntimeException {
    protected int line;
    protected int column;

    public CompileException(Token varNameToken){
        line = varNameToken.getLine();
        column = varNameToken.getCharPositionInLine();
    }
}
