package Error;

import org.antlr.v4.runtime.Token;

public class UndeclaredVariableException extends CompileException{
    private String varName;

    public UndeclaredVariableException(Token varNameToken){
       super(varNameToken);
        varName = varNameToken.getText();
    }
    public String getMessage(){
        return line + ":" + column + " undeclared variable <" + varName + ">";
    }
}
