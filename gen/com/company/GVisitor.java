// Generated from C:/Users/user/Desktop/Lang/src/com/company\G.g4 by ANTLR 4.7.2
package com.company;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statementwa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementwa(GParser.StatementwaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(GParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mul}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(GParser.MulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calllength}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalllength(GParser.CalllengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(GParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greaterthan}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthan(GParser.GreaterthanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callObjectint}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObjectint(GParser.CallObjectintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arrayname}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayname(GParser.ArraynameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Varlocal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlocal(GParser.VarlocalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lessthan}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthan(GParser.LessthanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(GParser.FuncCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(GParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greaterorequal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterorequal(GParser.GreaterorequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(GParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(GParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lessorequal}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessorequal(GParser.LessorequalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link GParser#expressionint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(GParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivid(GParser.DividContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divdi}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivdi(GParser.DivdiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mulid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulid(GParser.MulidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minusid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusid(GParser.MinusidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minusdi}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusdi(GParser.MinusdiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plusid}
	 * labeled alternative in {@link GParser#expressionall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusid(GParser.PlusidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Varlocaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlocaldo(GParser.VarlocaldoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plusdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusdo(GParser.PlusdoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minusdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusdo(GParser.MinusdoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variabledo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariabledo(GParser.VariabledoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpressiondo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpressiondo(GParser.FuncCallExpressiondoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lessorequaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessorequaldo(GParser.LessorequaldoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arraynamedo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraynamedo(GParser.ArraynamedoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivdo(GParser.DivdoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greaterorequaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterorequaldo(GParser.GreaterorequaldoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Doub}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoub(GParser.DoubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callObjectdo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObjectdo(GParser.CallObjectdoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Muldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuldo(GParser.MuldoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lessthando}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessthando(GParser.LessthandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Greaterthando}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthando(GParser.GreaterthandoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equaldo}
	 * labeled alternative in {@link GParser#expressiondoub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualdo(GParser.EqualdoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddst(GParser.AddstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variablest}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablest(GParser.VariablestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpressionst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpressionst(GParser.FuncCallExpressionstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Arraynamest}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraynamest(GParser.ArraynamestContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callObject}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallObject(GParser.CallObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(GParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Varlocaldst}
	 * labeled alternative in {@link GParser#expressionst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarlocaldst(GParser.VarlocaldstContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(GParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#trueblockstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueblockstart(GParser.TrueblockstartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#falseblockstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseblockstart(GParser.FalseblockstartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#trueblockstop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueblockstop(GParser.TrueblockstopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#falseblockstop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseblockstop(GParser.FalseblockstopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#blockTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockTrue(GParser.BlockTrueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#blockFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockFalse(GParser.BlockFalseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#whileloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileloop(GParser.WhileloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#whileblockstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblockstart(GParser.WhileblockstartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#loopbegin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopbegin(GParser.LoopbeginContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#whileblockstop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileblockstop(GParser.WhileblockstopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(GParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#forend}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForend(GParser.ForendContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#starti}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarti(GParser.StartiContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#forblock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForblock(GParser.ForblockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#varcalc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarcalc(GParser.VarcalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#blockloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockloop(GParser.BlockloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(GParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#varDeclarationlocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationlocal(GParser.VarDeclarationlocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#paramDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDeclaration(GParser.ParamDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#objectDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDec(GParser.ObjectDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#objectAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAssign(GParser.ObjectAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#equals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquals(GParser.EqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#varDeclarationArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationArray(GParser.VarDeclarationArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#paramDeclarationArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamDeclarationArray(GParser.ParamDeclarationArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(GParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arraycall1}
	 * labeled alternative in {@link GParser#arraycall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraycall1(GParser.Arraycall1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arraycall2}
	 * labeled alternative in {@link GParser#arraycall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraycall2(GParser.Arraycall2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#arraycal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraycal(GParser.ArraycalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#arraycale}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArraycale(GParser.ArraycaleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign1}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign1(GParser.Assign1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assign2}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign2(GParser.Assign2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assign3}
	 * labeled alternative in {@link GParser#assignarray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign3(GParser.Assign3Context ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#brace1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace1(GParser.Brace1Context ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#brace2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrace2(GParser.Brace2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#asstart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsstart(GParser.AsstartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#asstop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsstop(GParser.AsstopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#assignlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignlist(GParser.AssignlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#comma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(GParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#assignmentlocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentlocal(GParser.AssignmentlocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#print2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint2(GParser.Print2Context ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#print3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint3(GParser.Print3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Method1}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod1(GParser.Method1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Methodparams}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodparams(GParser.MethodparamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodvoid}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodvoid(GParser.MethodvoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodvoidparams}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodvoidparams(GParser.MethodvoidparamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodnostatement}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodnostatement(GParser.MethodnostatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodnameparam}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodnameparam(GParser.MethodnameparamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodname}
	 * labeled alternative in {@link GParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodname(GParser.MethodnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(GParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(GParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statementlocal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementlocal(GParser.StatementlocalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#statementList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementList(GParser.StatementListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call1}
	 * labeled alternative in {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall1(GParser.Call1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code Callparams}
	 * labeled alternative in {@link GParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallparams(GParser.CallparamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(GParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(GParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#objectcontext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectcontext(GParser.ObjectcontextContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#objectcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectcall(GParser.ObjectcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GParser#lengthcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthcall(GParser.LengthcallContext ctx);
}