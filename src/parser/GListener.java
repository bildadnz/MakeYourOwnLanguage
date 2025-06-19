// Generated from C:/Users/user/Desktop/Lang/src/com/company\G.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GParser}.
 */
public interface GListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#statementwa}.
	 * @param ctx the parse tree
	 */
	void enterStatementwa(GParser.StatementwaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#statementwa}.
	 * @param ctx the parse tree
	 */
	void exitStatementwa(GParser.StatementwaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterVariable(GParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitVariable(GParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterMul(GParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitMul(GParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calllength}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterCalllength(GParser.CalllengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calllength}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitCalllength(GParser.CalllengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterNum(GParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitNum(GParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greaterthan}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan(GParser.GreaterthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greaterthan}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan(GParser.GreaterthanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callObjectint}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterCallObjectint(GParser.CallObjectintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callObjectint}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitCallObjectint(GParser.CallObjectintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arrayname}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterArrayname(GParser.ArraynameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arrayname}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitArrayname(GParser.ArraynameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Varlocal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterVarlocal(GParser.VarlocalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Varlocal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitVarlocal(GParser.VarlocalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lessthan}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterLessthan(GParser.LessthanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lessthan}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitLessthan(GParser.LessthanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpression(GParser.FuncCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpression(GParser.FuncCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterDiv(GParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitDiv(GParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greaterorequal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterGreaterorequal(GParser.GreaterorequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greaterorequal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitGreaterorequal(GParser.GreaterorequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterEqual(GParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitEqual(GParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterPlus(GParser.PlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitPlus(GParser.PlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lessorequal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterLessorequal(GParser.LessorequalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lessorequal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitLessorequal(GParser.LessorequalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void enterMinus(GParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 */
	void exitMinus(GParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void enterDivid(GParser.DividContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void exitDivid(GParser.DividContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divdi}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void enterDivdi(GParser.DivdiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divdi}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void exitDivdi(GParser.DivdiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mulid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void enterMulid(GParser.MulidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mulid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void exitMulid(GParser.MulidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minusid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void enterMinusid(GParser.MinusidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minusid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void exitMinusid(GParser.MinusidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minusdi}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void enterMinusdi(GParser.MinusdiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minusdi}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void exitMinusdi(GParser.MinusdiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plusid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void enterPlusid(GParser.PlusidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plusid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 */
	void exitPlusid(GParser.PlusidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Varlocaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterVarlocaldo(GParser.VarlocaldoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Varlocaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitVarlocaldo(GParser.VarlocaldoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Plusdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterPlusdo(GParser.PlusdoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Plusdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitPlusdo(GParser.PlusdoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minusdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterMinusdo(GParser.MinusdoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minusdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitMinusdo(GParser.MinusdoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variabledo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterVariabledo(GParser.VariabledoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variabledo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitVariabledo(GParser.VariabledoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpressiondo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpressiondo(GParser.FuncCallExpressiondoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpressiondo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpressiondo(GParser.FuncCallExpressiondoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lessorequaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterLessorequaldo(GParser.LessorequaldoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lessorequaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitLessorequaldo(GParser.LessorequaldoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arraynamedo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterArraynamedo(GParser.ArraynamedoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arraynamedo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitArraynamedo(GParser.ArraynamedoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterDivdo(GParser.DivdoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitDivdo(GParser.DivdoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greaterorequaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterGreaterorequaldo(GParser.GreaterorequaldoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greaterorequaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitGreaterorequaldo(GParser.GreaterorequaldoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Doub}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterDoub(GParser.DoubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Doub}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitDoub(GParser.DoubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callObjectdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterCallObjectdo(GParser.CallObjectdoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callObjectdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitCallObjectdo(GParser.CallObjectdoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Muldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterMuldo(GParser.MuldoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Muldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitMuldo(GParser.MuldoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lessthando}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterLessthando(GParser.LessthandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lessthando}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitLessthando(GParser.LessthandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Greaterthando}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthando(GParser.GreaterthandoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Greaterthando}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthando(GParser.GreaterthandoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void enterEqualdo(GParser.EqualdoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 */
	void exitEqualdo(GParser.EqualdoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterAddst(GParser.AddstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitAddst(GParser.AddstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variablest}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterVariablest(GParser.VariablestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variablest}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitVariablest(GParser.VariablestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCallExpressionst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpressionst(GParser.FuncCallExpressionstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCallExpressionst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpressionst(GParser.FuncCallExpressionstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Arraynamest}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterArraynamest(GParser.ArraynamestContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Arraynamest}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitArraynamest(GParser.ArraynamestContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callObject}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterCallObject(GParser.CallObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callObject}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitCallObject(GParser.CallObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterString(GParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitString(GParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Varlocaldst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void enterVarlocaldst(GParser.VarlocaldstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Varlocaldst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 */
	void exitVarlocaldst(GParser.VarlocaldstContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(GParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(GParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#trueblockstart}.
	 * @param ctx the parse tree
	 */
	void enterTrueblockstart(GParser.TrueblockstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#trueblockstart}.
	 * @param ctx the parse tree
	 */
	void exitTrueblockstart(GParser.TrueblockstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#falseblockstart}.
	 * @param ctx the parse tree
	 */
	void enterFalseblockstart(GParser.FalseblockstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#falseblockstart}.
	 * @param ctx the parse tree
	 */
	void exitFalseblockstart(GParser.FalseblockstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#trueblockstop}.
	 * @param ctx the parse tree
	 */
	void enterTrueblockstop(GParser.TrueblockstopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#trueblockstop}.
	 * @param ctx the parse tree
	 */
	void exitTrueblockstop(GParser.TrueblockstopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#falseblockstop}.
	 * @param ctx the parse tree
	 */
	void enterFalseblockstop(GParser.FalseblockstopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#falseblockstop}.
	 * @param ctx the parse tree
	 */
	void exitFalseblockstop(GParser.FalseblockstopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#blockTrue}.
	 * @param ctx the parse tree
	 */
	void enterBlockTrue(GParser.BlockTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#blockTrue}.
	 * @param ctx the parse tree
	 */
	void exitBlockTrue(GParser.BlockTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#blockFalse}.
	 * @param ctx the parse tree
	 */
	void enterBlockFalse(GParser.BlockFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#blockFalse}.
	 * @param ctx the parse tree
	 */
	void exitBlockFalse(GParser.BlockFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void enterWhileloop(GParser.WhileloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#whileloop}.
	 * @param ctx the parse tree
	 */
	void exitWhileloop(GParser.WhileloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#whileblockstart}.
	 * @param ctx the parse tree
	 */
	void enterWhileblockstart(GParser.WhileblockstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#whileblockstart}.
	 * @param ctx the parse tree
	 */
	void exitWhileblockstart(GParser.WhileblockstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#loopbegin}.
	 * @param ctx the parse tree
	 */
	void enterLoopbegin(GParser.LoopbeginContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#loopbegin}.
	 * @param ctx the parse tree
	 */
	void exitLoopbegin(GParser.LoopbeginContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#whileblockstop}.
	 * @param ctx the parse tree
	 */
	void enterWhileblockstop(GParser.WhileblockstopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#whileblockstop}.
	 * @param ctx the parse tree
	 */
	void exitWhileblockstop(GParser.WhileblockstopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#forloop}.
	 * @param ctx the parse tree
	 */
	void enterForloop(GParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#forloop}.
	 * @param ctx the parse tree
	 */
	void exitForloop(GParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#forend}.
	 * @param ctx the parse tree
	 */
	void enterForend(GParser.ForendContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#forend}.
	 * @param ctx the parse tree
	 */
	void exitForend(GParser.ForendContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#starti}.
	 * @param ctx the parse tree
	 */
	void enterStarti(GParser.StartiContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#starti}.
	 * @param ctx the parse tree
	 */
	void exitStarti(GParser.StartiContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#forblock}.
	 * @param ctx the parse tree
	 */
	void enterForblock(GParser.ForblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#forblock}.
	 * @param ctx the parse tree
	 */
	void exitForblock(GParser.ForblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#varcalc}.
	 * @param ctx the parse tree
	 */
	void enterVarcalc(GParser.VarcalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#varcalc}.
	 * @param ctx the parse tree
	 */
	void exitVarcalc(GParser.VarcalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#blockloop}.
	 * @param ctx the parse tree
	 */
	void enterBlockloop(GParser.BlockloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#blockloop}.
	 * @param ctx the parse tree
	 */
	void exitBlockloop(GParser.BlockloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(GParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(GParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#varDeclarationlocal}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationlocal(GParser.VarDeclarationlocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#varDeclarationlocal}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationlocal(GParser.VarDeclarationlocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclaration(GParser.ParamDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#paramDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclaration(GParser.ParamDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#objectDec}.
	 * @param ctx the parse tree
	 */
	void enterObjectDec(GParser.ObjectDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#objectDec}.
	 * @param ctx the parse tree
	 */
	void exitObjectDec(GParser.ObjectDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#objectAssign}.
	 * @param ctx the parse tree
	 */
	void enterObjectAssign(GParser.ObjectAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#objectAssign}.
	 * @param ctx the parse tree
	 */
	void exitObjectAssign(GParser.ObjectAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#equals}.
	 * @param ctx the parse tree
	 */
	void enterEquals(GParser.EqualsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#equals}.
	 * @param ctx the parse tree
	 */
	void exitEquals(GParser.EqualsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#varDeclarationArray}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarationArray(GParser.VarDeclarationArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#varDeclarationArray}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarationArray(GParser.VarDeclarationArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#paramDeclarationArray}.
	 * @param ctx the parse tree
	 */
	void enterParamDeclarationArray(GParser.ParamDeclarationArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#paramDeclarationArray}.
	 * @param ctx the parse tree
	 */
	void exitParamDeclarationArray(GParser.ParamDeclarationArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arraycall1}
	 * labeled alternative in {@link GParser#arraycall}.
	 * @param ctx the parse tree
	 */
	void enterArraycall1(GParser.Arraycall1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code arraycall1}
	 * labeled alternative in {@link GParser#arraycall}.
	 * @param ctx the parse tree
	 */
	void exitArraycall1(GParser.Arraycall1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code arraycall2}
	 * labeled alternative in {@link GParser#arraycall}.
	 * @param ctx the parse tree
	 */
	void enterArraycall2(GParser.Arraycall2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code arraycall2}
	 * labeled alternative in {@link GParser#arraycall}.
	 * @param ctx the parse tree
	 */
	void exitArraycall2(GParser.Arraycall2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#arraycal}.
	 * @param ctx the parse tree
	 */
	void enterArraycal(GParser.ArraycalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#arraycal}.
	 * @param ctx the parse tree
	 */
	void exitArraycal(GParser.ArraycalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#arraycale}.
	 * @param ctx the parse tree
	 */
	void enterArraycale(GParser.ArraycaleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#arraycale}.
	 * @param ctx the parse tree
	 */
	void exitArraycale(GParser.ArraycaleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign1}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 */
	void enterAssign1(GParser.Assign1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign1}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 */
	void exitAssign1(GParser.Assign1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assign2}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 */
	void enterAssign2(GParser.Assign2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign2}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 */
	void exitAssign2(GParser.Assign2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assign3}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 */
	void enterAssign3(GParser.Assign3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assign3}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 */
	void exitAssign3(GParser.Assign3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#brace1}.
	 * @param ctx the parse tree
	 */
	void enterBrace1(GParser.Brace1Context ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#brace1}.
	 * @param ctx the parse tree
	 */
	void exitBrace1(GParser.Brace1Context ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#brace2}.
	 * @param ctx the parse tree
	 */
	void enterBrace2(GParser.Brace2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#brace2}.
	 * @param ctx the parse tree
	 */
	void exitBrace2(GParser.Brace2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#asstart}.
	 * @param ctx the parse tree
	 */
	void enterAsstart(GParser.AsstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#asstart}.
	 * @param ctx the parse tree
	 */
	void exitAsstart(GParser.AsstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#asstop}.
	 * @param ctx the parse tree
	 */
	void enterAsstop(GParser.AsstopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#asstop}.
	 * @param ctx the parse tree
	 */
	void exitAsstop(GParser.AsstopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#assignlist}.
	 * @param ctx the parse tree
	 */
	void enterAssignlist(GParser.AssignlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#assignlist}.
	 * @param ctx the parse tree
	 */
	void exitAssignlist(GParser.AssignlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#comma}.
	 * @param ctx the parse tree
	 */
	void enterComma(GParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#comma}.
	 * @param ctx the parse tree
	 */
	void exitComma(GParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#assignmentlocal}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentlocal(GParser.AssignmentlocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#assignmentlocal}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentlocal(GParser.AssignmentlocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#print2}.
	 * @param ctx the parse tree
	 */
	void enterPrint2(GParser.Print2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#print2}.
	 * @param ctx the parse tree
	 */
	void exitPrint2(GParser.Print2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#print3}.
	 * @param ctx the parse tree
	 */
	void enterPrint3(GParser.Print3Context ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#print3}.
	 * @param ctx the parse tree
	 */
	void exitPrint3(GParser.Print3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Method1}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethod1(GParser.Method1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Method1}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethod1(GParser.Method1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Methodparams}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodparams(GParser.MethodparamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Methodparams}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodparams(GParser.MethodparamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodvoid}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodvoid(GParser.MethodvoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodvoid}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodvoid(GParser.MethodvoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodvoidparams}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodvoidparams(GParser.MethodvoidparamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodvoidparams}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodvoidparams(GParser.MethodvoidparamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodnostatement}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodnostatement(GParser.MethodnostatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodnostatement}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodnostatement(GParser.MethodnostatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodnameparam}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodnameparam(GParser.MethodnameparamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodnameparam}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodnameparam(GParser.MethodnameparamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodname}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodname(GParser.MethodnameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodname}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodname(GParser.MethodnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(GParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(GParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(GParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(GParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#statementlocal}.
	 * @param ctx the parse tree
	 */
	void enterStatementlocal(GParser.StatementlocalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#statementlocal}.
	 * @param ctx the parse tree
	 */
	void exitStatementlocal(GParser.StatementlocalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(GParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(GParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call1}
	 * labeled alternative in {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCall1(GParser.Call1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Call1}
	 * labeled alternative in {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCall1(GParser.Call1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code Callparams}
	 * labeled alternative in {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterCallparams(GParser.CallparamsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Callparams}
	 * labeled alternative in {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitCallparams(GParser.CallparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(GParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(GParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(GParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(GParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#objectcontext}.
	 * @param ctx the parse tree
	 */
	void enterObjectcontext(GParser.ObjectcontextContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#objectcontext}.
	 * @param ctx the parse tree
	 */
	void exitObjectcontext(GParser.ObjectcontextContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#objectcall}.
	 * @param ctx the parse tree
	 */
	void enterObjectcall(GParser.ObjectcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#objectcall}.
	 * @param ctx the parse tree
	 */
	void exitObjectcall(GParser.ObjectcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GParser#lengthcall}.
	 * @param ctx the parse tree
	 */
	void enterLengthcall(GParser.LengthcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GParser#lengthcall}.
	 * @param ctx the parse tree
	 */
	void exitLengthcall(GParser.LengthcallContext ctx);
}