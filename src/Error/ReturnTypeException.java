package Error;

import org.antlr.v4.runtime.Token;

public class ReturnTypeException extends CompileException{

    private final String returnType;

    public ReturnTypeException(Token arrayToken){
        super(arrayToken);
        this.returnType=arrayToken.getText();
    }
    public String getMessage(){return line + ":"+ column + " return type does not match method type  <" + returnType + ">";}
}
