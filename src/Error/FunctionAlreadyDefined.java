package Error;

import org.antlr.v4.runtime.Token;

public class FunctionAlreadyDefined extends CompileException{

    private final String funcName;

    public FunctionAlreadyDefined(Token funcToken){
        super(funcToken);
        this.funcName=funcToken.getText();
    }
    public String getMessage(){return line + ":"+ column + " function defined already <" + funcName + ">";}
}
