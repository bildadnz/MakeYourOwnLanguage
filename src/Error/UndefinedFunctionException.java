package Error;

import org.antlr.v4.runtime.Token;

public class UndefinedFunctionException extends CompileException{
    private final String functionname;

    public UndefinedFunctionException(Token funcNameToken){
        super(funcNameToken);
        this.functionname=funcNameToken.getText();
    }

    @Override
    public String getMessage() {
        return line + ":"+ column + " calling an undefined function <" + functionname + ">";
    }

}
