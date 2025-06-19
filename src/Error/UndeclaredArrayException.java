package Error;

import org.antlr.v4.runtime.Token;

/**
 * Created by user on 3/20/2019.
 */
public class UndeclaredArrayException  extends CompileException{

    private final String arrayName;

    public UndeclaredArrayException(Token arrayToken){
        super(arrayToken);
        this.arrayName=arrayToken.getText();
    }
    public String getMessage(){return line + ":"+ column + " array not declared <" + arrayName + ">";}
}
