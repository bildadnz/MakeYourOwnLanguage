package Error;

import org.antlr.v4.runtime.Token;

public class VariableDefinedBeforeException extends CompileException {
    private String varName;

    public VariableDefinedBeforeException(Token variableNameToken){
        super(variableNameToken);
        varName = variableNameToken.getText();
    }

    @Override
    public String getMessage() {
        return line + ":" + column + "variable defined before: <" + varName + ">";
    }
}
