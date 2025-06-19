package com.company;

import org.antlr.v4.runtime.Token;
import parser.GBaseListener;
import parser.GBaseVisitor;
import parser.GParser;

import Error.UndeclaredVariableException;
import Error.VariableDefinedBeforeException;
import Error.UndefinedFunctionException;
import Error.FunctionAlreadyDefined;
import Error.ArrayAlreadyDefined;
import Error.UndeclaredArrayException;
import Error.ReturnTypeException;

import java.util.*;

public class BListener extends GBaseListener {
    private GBaseVisitor<String> st = new GBaseVisitor<>();
    private Map<String, Integer> variablesint = new HashMap<>();
    private Map<String, Integer> variablesdoub = new HashMap<>();
    private Map<String, Integer> variablesst = new HashMap<>();
    public static List<String> functions = new ArrayList<>();
    public static List<String> duplicate = new ArrayList<>();
    public static Map<String, Integer> locals = new HashMap<>();
    public static Map<String, Integer> localsdoub = new HashMap<>();
    public static Map<String, Integer> localsst = new HashMap<>();
    public static List<Integer> nolocals = new ArrayList<>();
    public static List<Integer> noDOlocals = new ArrayList<>();
    public static List<Integer> noSTlocals = new ArrayList<>();
    public static List<String> returnStr = new ArrayList<>();
    static List<String> tre = new ArrayList<>();
    public static Map<String, Integer> objs = new HashMap<>();
    public static Map<String, Integer> arrayobjs = new HashMap<>();
    public static Map<String, Integer> params = new HashMap<>();
    public static Map<String, Integer> prm = new HashMap<>();
    public static Map<String, Integer> prmarrays = new HashMap<>();
    public static Map<String, Integer> prmarrayd = new HashMap<>();
    public static Map<String, Integer> prmarray = new HashMap<>();
    public static Map<String, Integer> prms = new HashMap<>();
    public static Map<String, Integer> prmd = new HashMap<>();
    public static Map<String, Integer> paramsst = new HashMap<>();
    public static Map<String, Integer> paramsdoub = new HashMap<>();
    public static Map<String, Integer> paramsarray = new HashMap<>();
    public static Map<String, Integer> paramsarrayst = new HashMap<>();
    public static Map<String, Integer> paramsarraydoub = new HashMap<>();
    public static Map<String, Integer> paramarrayobjs = new HashMap<>();
    public static Map<String, Integer> paramobjs = new HashMap<>();
    public static Map<String, Integer> arrayint = new HashMap<>();
    public static Map<String, Integer> arraydo = new HashMap<>();
    public static Map<String, Integer> arrayst = new HashMap<>();
    public static List<Integer> noGlobals = new ArrayList<>();
    public static List<Integer> noDoGlobals = new ArrayList<>();
    public static List<Integer> noSTGlobals = new ArrayList<>();
    public static List<Double> doubles = new ArrayList<>();
    public static List<String> str = new ArrayList<>();
    public static List<String> look = new ArrayList<>();
    public static List<Integer> looknumb = new ArrayList<>();
    public static List<Integer> noParams = new ArrayList<>();
    public static List<Integer> noDOParams = new ArrayList<>();
    public static List<Integer> noSTParams = new ArrayList<>();
    public static int noOfParams;
    public static int noOfDOParams;
    public static int noOfSTParams;
    public static int loadval;
    public static boolean loc = false;

    public void exitPrint(GParser.PrintContext ctx) {
        if (ctx != null) {
            tre.add("print");
        }
    }
    public void exitPrint2(GParser.Print2Context ctx) {
        if (ctx != null) {
                tre.add("prst");
        }
    }
    public void exitPrint3(GParser.Print3Context ctx) {
        if (ctx != null) {
            tre.add("dprint");
        }
    }

    public void exitPlus(GParser.PlusContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("iadd");
        }
    }

    public void exitLessthan(GParser.LessthanContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("ilt");
        }
    }

    public void exitGreaterthan(GParser.GreaterthanContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("igt");
        }
    }

    public void exitEqual(GParser.EqualContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("ieq");
        }
    }

    public void exitGreaterorequal(GParser.GreaterorequalContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("iget");
        }
    }

    public void exitLessorequal(GParser.LessorequalContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("ilet");
        }
    }

    public void exitMul(GParser.MulContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("imul");
        }
    }

    public void exitDiv(GParser.DivContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("idiv");
        }
    }

    public void exitMulid(GParser.MulidContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("imuld");
        }
    }

    public void exitDivid(GParser.DividContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("idivd");
        }
    }

    public void exitDivdi(GParser.DivdiContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("ddivi");
        }
    }

    public void exitPlusid(GParser.PlusidContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("iaddd");
        }
    }

    public void exitMinusid(GParser.MinusidContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("isubd");
        }
    }

    public void exitMinusdi(GParser.MinusdiContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dsubi");
        }
    }

    public void exitMinus(GParser.MinusContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("isub");
        }
    }

    public void exitPlusdo(GParser.PlusdoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dadd");
        }
    }

    public void exitLessthando(GParser.LessthandoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dlt");
        }
    }

    public void exitGreaterthando(GParser.GreaterthandoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dgt");
        }
    }

    public void exitEqualdo(GParser.EqualdoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("deq");
        }
    }

    public void exitGreaterorequaldo(GParser.GreaterorequaldoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dget");
        }
    }

    public void exitLessorequaldo(GParser.LessorequaldoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dlet");
        }
    }

    public void exitMuldo(GParser.MuldoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dmul");
        }
    }

    public void exitDivdo(GParser.DivdoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("ddiv");
        }
    }

    public void exitMinusdo(GParser.MinusdoContext ctx) {
        if (ctx != null) {
            st.visitChildren(ctx);
            tre.add("dsub");
        }

    }

    public void exitVarDeclaration(GParser.VarDeclarationContext ctx) {
        if (ctx != null) {
            if (variablesint.containsKey(ctx.varName.getText()) || variablesst.containsKey(ctx.varName.getText()) || variablesdoub.containsKey(ctx.varName.getText()) || objs.containsKey(ctx.varName.getText())) {
                throw new VariableDefinedBeforeException(ctx.varName);
            }
            if (ctx.TYPE().getText().equals("int")) {
                variablesint.put(ctx.varName.getText(), variablesint.size());
            } else if (ctx.TYPE().getText().equals("double")) {
                variablesdoub.put(ctx.varName.getText(), variablesdoub.size());
            } else if (ctx.TYPE().getText().equals("string")) {
                variablesst.put(ctx.varName.getText(), variablesst.size());
            }
            else if (ctx.TYPE().getText().equals("Object")) {
                objs.put(ctx.varName.getText(), objs.size());
                tre.add("newobj");
            }
        }
    }

    public void exitVarDeclarationlocal(GParser.VarDeclarationlocalContext ctx) {
        if (ctx != null) {
            if (locals.containsKey(ctx.varNamelocal.getText()) || localsst.containsKey(ctx.varNamelocal.getText()) || localsdoub.containsKey(ctx.varNamelocal.getText())  || objs.containsKey(ctx.varNamelocal.getText())) {
                throw new VariableDefinedBeforeException(ctx.varNamelocal);
            }
            if (ctx.TYPE().getText().equals("int")) {
                locals.put(ctx.varNamelocal.getText(), locals.size());
            } else if (ctx.TYPE().getText().equals("double")) {
                localsdoub.put(ctx.varNamelocal.getText(), localsdoub.size());
            } else if (ctx.TYPE().getText().equals("string")) {
                localsst.put(ctx.varNamelocal.getText(), localsst.size());
            } else if (ctx.TYPE().getText().equals("Object")) {
                objs.put(ctx.varNamelocal.getText(), objs.size());
                tre.add("newobj");
            }
        }
    }

    public void exitVarDeclarationArray(GParser.VarDeclarationArrayContext ctx) {
        if (ctx != null) {
            if (arrayint.containsKey(ctx.arrayName.getText()) || arraydo.containsKey(ctx.arrayName.getText()) || arrayst.containsKey(ctx.arrayName.getText()) || arrayobjs.containsKey(ctx.arrayName.getText())) {
                throw new ArrayAlreadyDefined(ctx.arrayName);
            }
            if (ctx.TYPE(1).getText().equals("int")) {
                arrayint.put(ctx.arrayName.getText(), arrayint.size());
                tre.add("newarraytypei");
            } else if (ctx.TYPE(1).getText().equals("double")) {
                arraydo.put(ctx.arrayName.getText(), arraydo.size());
                tre.add("newarraytyped");
            } else if (ctx.TYPE(1).getText().equals("string")) {
                arrayst.put(ctx.arrayName.getText(), arrayst.size());
                tre.add("newarraytypes");
            } else if (ctx.TYPE(1).getText().equals("Object")) {
                arrayobjs.put(ctx.arrayName.getText(), arrayobjs.size());
                tre.add("newarrraytypeO");
            }
        }
    }

    public void exitAssign1(GParser.Assign1Context ctx) {
        if (ctx != null) {
            if (arrayint.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("[");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArrayint(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                d = tre.indexOf("]");
                tre.remove(d);
                tre.add(d, "aaload");
                tre.add("iastore");
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arraydo.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("[");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArraydoub(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                d = tre.indexOf("]");
                tre.remove(d);
                tre.add(d, "aaload");
                tre.add("dastore");
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arrayst.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("[");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArrayst(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                d = tre.indexOf("]");
                tre.remove(d);
                tre.add(d, "aaload");
                tre.add("stastore");
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arrayobjs.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("[");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArrayobjs(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                d = tre.indexOf("]");
                tre.remove(d);
                tre.add(d, "aaload");
                tre.add("oastore");
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }
        }
    }

    public void exitAssign2(GParser.Assign2Context ctx) {
        if (ctx != null) {
            if (arrayint.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("asart");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArrayint(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int y = tre.indexOf("assop");
                int dif = ctx.assignlistval.count.size();
                tre.remove(y);
                tre.add(d + 2, "iconst");
                tre.add(d + 3, "0");
                tre.add(d + 4, "aaload");
                if (dif == 1) {
                    tre.add("iastore");
                }else {
                    tre.add("storing");
                }
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arraydo.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("asart");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArraydoub(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int y = tre.indexOf("assop");
                int dif = ctx.assignlistval.count.size();
                tre.remove(y);
                tre.add(d + 2, "iconst");
                tre.add(d + 3, "0");
                tre.add(d + 4, "aaload");
                if (dif == 1) {
                    tre.add("dastore");
                }else {
                    tre.add("storing");
                }
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arrayst.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("asart");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArrayst(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int y = tre.indexOf("assop");
                int dif = ctx.assignlistval.count.size();
                tre.remove(y);
                tre.add(d + 2, "iconst");
                tre.add(d + 3, "0");
                tre.add(d + 4, "aaload");
                if (dif == 1) {
                    tre.add("stastore");
                }else {
                    tre.add("storing");
                }
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if (arrayobjs.containsKey(ctx.arrayName.getText())) {
                int d = tre.indexOf("asart");
                tre.remove(d);
                tre.add(d, "aload");
                requireVarTndexArrayobjs(ctx.arrayName);
                tre.add(d + 1, String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int y = tre.indexOf("assop");
                int dif = ctx.assignlistval.count.size();
                tre.remove(y);
                tre.add(d + 2, "iconst");
                tre.add(d + 3, "0");
                tre.add(d + 4, "aaload");
                tre.add(d+5,"toSomething");
                if (dif == 1) {
                    tre.add("oastore");
                }else {
                    tre.add("storing");
                }
                tre.add("astore");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }
        }
    }

    public void exitAssign3(GParser.Assign3Context ctx) {
        if (ctx != null) {
            if (arrayint.containsKey(ctx.arrayName.getText())) {
                tre.add("astore");
                requireVarTndexArrayint(ctx.arrayName);
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arraydo.containsKey(ctx.arrayName.getText())) {
                tre.add("astore");
                requireVarTndexArraydoub(ctx.arrayName);
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            } else if (arrayst.containsKey(ctx.arrayName.getText())) {
                tre.add("astore");
                requireVarTndexArrayst(ctx.arrayName);
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }
            else if (arrayobjs.containsKey(ctx.arrayName.getText())) {
                tre.add("astore");
                requireVarTndexArrayobjs(ctx.arrayName);
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }
        }
    }

    public void exitComma(GParser.CommaContext ctx) {
        if (ctx != null) {
            setPlace();
        }
    }

    public void exitAssignment(GParser.AssignmentContext ctx) {
        if (ctx != null) {
            st.visit(ctx.expr);
            if (!locals.containsKey(ctx.varName.getText()) && !params.containsKey(ctx.varName.getText()) && !objs.containsKey(ctx.varName.getText()) &&  variablesdoub.containsKey(ctx.varName.getText())) {
                tre.add("dgstore");
                noDoGlobals.add(1);
                tre.add(String.valueOf(requireVarTndexdo(ctx.varName)));
            } else if (!locals.containsKey(ctx.varName.getText()) && !params.containsKey(ctx.varName.getText()) && !objs.containsKey(ctx.varName.getText()) && variablesint.containsKey(ctx.varName.getText())) {
                tre.add("gstore");
                noGlobals.add(1);
                tre.add(String.valueOf(requireVarTndex(ctx.varName)));
            } else if (ctx.expr.expressionint() != null && locals.containsKey(ctx.varName.getText())) {
                tre.add("store");
                nolocals.add(-1);
                tre.add(String.valueOf(locals.get(ctx.varName.getText())));
            } else if (ctx.expr.expressionint() != null && params.containsKey(ctx.varName.getText())) {
                tre.add("store");
                nolocals.add(-1);
                tre.add(String.valueOf(params.get(ctx.varName.getText())));
            } else if (!locals.containsKey(ctx.varName.getText()) && !params.containsKey(ctx.varName.getText()) && !objs.containsKey(ctx.varName.getText()) &&  variablesst.containsKey(ctx.varName.getText())) {
                tre.add("stgstore");
                noSTGlobals.add(1);
                tre.add(String.valueOf(requireVarTndexSt(ctx.varName)));
            }else if(objs.containsKey(ctx.varName.getText())){
                int h = tre.lastIndexOf("to");
                tre.remove(h);
                tre.add(h, "toSomething");
                tre.add("ostore");
                tre.add(String.valueOf(requireVarTndexObjs(ctx.varName)));
            }
        }
    }

    public void exitLengthcall(GParser.LengthcallContext ctx){
        if(ctx != null){
            tre.add("arrraylength");
            tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayname.getText())));
        }
    }

    public void exitObjectcall(GParser.ObjectcallContext ctx){
        if(ctx != null){
            //System.out.println(ctx.objectcontext().cont.get(0).getText());
            //System.out.println(ctx.objectcontext().cont.get(1).getText());
        }
    }

    public void exitEquals(GParser.EqualsContext ctx){
        if(ctx != null){
            tre.add("to");
        }
    }

    public void exitAssignmentlocal(GParser.AssignmentlocalContext ctx) {
        if (ctx != null) {
            st.visit(ctx.exprlocal);
            if (locals.containsKey(ctx.varNamelocal.getText())) {
                tre.add("store");
                nolocals.add(-1);
                tre.add(String.valueOf(requireVarTndexLocal(ctx.varNamelocal)));
            } else if (localsdoub.containsKey(ctx.varNamelocal.getText())) {
                tre.add("dstore");
                noDOlocals.add(-1);
                tre.add(String.valueOf(requireVarTndexLocaldoub(ctx.varNamelocal)));
            } else if (localsst.containsKey(ctx.varNamelocal.getText())) {
                tre.add("ststore");
                noSTlocals.add(-1);
                tre.add(String.valueOf(requireVarTndexLocalst(ctx.varNamelocal)));
            }else if(objs.containsKey(ctx.varNamelocal.getText())){
                int h = tre.lastIndexOf("to");
                tre.remove(h);
                tre.add(h, "toSomething");
                tre.add("ostore");
                tre.add(String.valueOf(requireVarTndexObjs(ctx.varNamelocal)));
            }
        }
    }

    public void exitParamDeclaration(GParser.ParamDeclarationContext ctx) {
        if (ctx != null) {
            if (ctx.TYPE().getText().equals("int")) {
                params.put(ctx.paramName.getText(), params.size());
                prm.put(ctx.paramName.getText(), prm.size());
            } else if (ctx.TYPE().getText().equals("double")) {
                paramsdoub.put(ctx.paramName.getText(), paramsdoub.size());
                prmd.put(ctx.paramName.getText(), prmd.size());
            } else if (ctx.TYPE().getText().equals("string")) {
                paramsst.put(ctx.paramName.getText(), paramsst.size());
                prms.put(ctx.paramName.getText(), prms.size());
            }else if (ctx.TYPE().getText().equals("Object")) {
                objs.put(ctx.paramName.getText(), objs.size());
                paramobjs.put(ctx.paramName.getText(), paramobjs.size());
                tre.add("newobj");
            }
        }
    }

    public void exitParamDeclarationArray(GParser.ParamDeclarationArrayContext ctx) {
        if (ctx != null) {
            if (ctx.TYPE().getText().equals("int")) {
                paramsarray.put(ctx.paramarrayName.getText(), params.size());
                prmarray.put(ctx.paramarrayName.getText(),prmarray.size());
            } else if (ctx.TYPE().getText().equals("double")) {
                paramsarraydoub.put(ctx.paramarrayName.getText(), paramsdoub.size());
                prmarrayd.put(ctx.paramarrayName.getText(),prmarrayd.size());
            } else if (ctx.TYPE().getText().equals("string")) {
                paramsarrayst.put(ctx.paramarrayName.getText(), paramsst.size());
                prmarrays.put(ctx.paramarrayName.getText(),prmarrays.size());
            }else if(ctx.TYPE().getText().equals("Object")){
                paramarrayobjs.put(ctx.paramarrayName.getText(), paramarrayobjs.size());
            }
        }
    }

    public void exitVariable(GParser.VariableContext ctx) {
        if (ctx != null) {
            if (variablesint.containsKey(ctx.var.getText())) {
                tre.add("gload");
                tre.add(String.valueOf(variablesint.get(ctx.var.getText())));
            } else if (params.containsKey(ctx.var.getText())) {
                tre.add("load");
                tre.add(String.valueOf(params.get(ctx.var.getText())));
            } else if (locals.containsKey(ctx.var.getText())) {
                tre.add("load");
                tre.add(String.valueOf(locals.get(ctx.var.getText())));
            }
            else if (localsdoub.containsKey(ctx.var.getText())) {
                tre.add("dload");
                tre.add(String.valueOf(localsdoub.get(ctx.var.getText())));
            }
            else if (localsst.containsKey(ctx.var.getText())) {
                tre.add("stload");
                tre.add(String.valueOf(localsst.get(ctx.var.getText())));
            }
            else if (objs.containsKey(ctx.var.getText())) {
                int h = tre.lastIndexOf("to");
                tre.remove(h);
                tre.add(h, "toSomething");
                tre.add("oload");
                tre.add(String.valueOf(objs.get(ctx.var.getText())));
            }else if (variablesdoub.containsKey(ctx.var.getText())) {
                tre.add("dgload");
                tre.add(String.valueOf(variablesdoub.get(ctx.var.getText())));
            }else if (variablesst.containsKey(ctx.var.getText())) {
                tre.add("stgload");
                tre.add(String.valueOf(variablesst.get(ctx.var.getText())));
            } else if (paramsdoub.containsKey(ctx.var.getText())) {
                tre.add("dload");
                tre.add(String.valueOf(paramsdoub.get(ctx.var.getText())));
            } else if (paramsst.containsKey(ctx.var.getText())) {
                tre.add("stload");
                tre.add(String.valueOf(paramsst.get(ctx.var.getText())));
            }
        }
    }

    public void exitVariablest(GParser.VariablestContext ctx) {
        if (ctx != null) {
            //System.out.println(ctx.parent.getText());
            if (variablesst.containsKey(ctx.var.getText())) {
                tre.add("stgload");
                tre.add(String.valueOf(variablesst.get(ctx.var.getText())));
            } else if (paramsst.containsKey(ctx.var.getText())) {
                tre.add("stload");
                tre.add(String.valueOf(paramsst.get(ctx.var.getText())));
            }
        }
    }

    public void exitVariabledo(GParser.VariabledoContext ctx) {
        if (ctx != null) {
            if (variablesdoub.containsKey(ctx.var.getText())) {
                tre.add("dgload");
                tre.add(String.valueOf(variablesdoub.get(ctx.var.getText())));
            } else if (paramsdoub.containsKey(ctx.var.getText())) {
                tre.add("dload");
                tre.add(String.valueOf(paramsdoub.get(ctx.var.getText())));
            }
        }
    }

    public void exitBrace1(GParser.Brace1Context ctx) {
        if (ctx != null) {
            tre.add("[");
        }
    }

    public void exitBrace2(GParser.Brace2Context ctx) {
        if (ctx != null) {
            tre.add("]");
        }
    }

    public void exitAsstart(GParser.AsstartContext ctx) {
        if (ctx != null) {
            tre.add("asart");
        }
    }

    public void exitAsstop(GParser.AsstopContext ctx) {
        if (ctx != null) {
            tre.add("assop");
        }
    }

    public void exitMethod1(GParser.Method1Context ctx) {
        if (ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if (dup.contains(ctx.funcName.getText())) {
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            functions.add(ctx.funcName.getText());
            noOfParams = 0;
            noParams.add(noOfParams);
            noOfDOParams = 0;
            noDOParams.add(noOfDOParams);
            noOfSTParams = 0;
            noSTParams.add(noOfSTParams);
            if (ctx.TYPE().getText().equals("int")) {
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            } else if (ctx.TYPE().getText().equals("double")) {
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            } else if (ctx.TYPE().getText().equals("string")) {
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }
            if (ctx.statements != null) {
                tre.add("me");
                returnStr.add(ctx.statements.getText());
            }
            tre.add("ret");
            if(ctx.type2 != null) {
                checkReturnType(ctx.type2.getText(), ctx.returnVal.getStart());
            }else {
                checkReturnTypeArray(ctx.type1.getText(), ctx.returnVal.getStart());
            }
        }
    }
    public void exitMethodvoid(GParser.MethodvoidContext ctx) {
        if (ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if (dup.contains(ctx.funcName.getText())) {
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            noOfParams = 0;
            noParams.add(noOfParams);
            noOfDOParams = 0;
            noDOParams.add(noOfDOParams);
            noOfSTParams = 0;
            noSTParams.add(noOfSTParams);
            noSTlocals.add(2);
            noDOlocals.add(2);
            nolocals.add(2);
            functions.add(ctx.funcName.getText());
            if (ctx.statements != null) {
                tre.add("me");
            }
            tre.add("ret");
        }
    }
    public void exitMethodvoidparams(GParser.MethodvoidparamsContext ctx) {
        if (ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if (dup.contains(ctx.funcName.getText())) {
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            String s = ctx.params.getText();
            if (ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("int")) {
                if(params.size() != 0){
                    noParams.add(params.size());
                }else if(paramsarray.size() != 0){
                    noParams.add(0);
                }
                paramsarray.clear();
                params.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            } else {
                noParams.add(0);
            }
            if (ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("double")) {
                if(paramsdoub.size() != 0){
                    noDOParams.add(paramsdoub.size());
                }else if(paramsarraydoub.size() != 0){
                    noDOParams.add(0);
                }
                paramsarraydoub.clear();
                paramsdoub.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            } else {
                noDOParams.add(0);
            }
            if (ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("string")) {
                if(paramsst.size() != 0){
                    noSTParams.add(paramsst.size());
                }else if(paramsarrayst.size() != 0){
                    noSTParams.add(0);
                }
                paramsarrayst.clear();
                paramsst.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            } else {
                noSTParams.add(0);
            }
            functions.add(ctx.funcName.getText());
            if (ctx.statements != null) {
                tre.add("me");
            }
            tre.add("ret");
            }
    }
    public void exitMethodnostatement(GParser.MethodnostatementContext ctx) {
        if (ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if(dup.contains(ctx.funcName.getText())){
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            functions.add(ctx.funcName.getText());
            noOfParams = 0;
            noParams.add(noOfParams);
            noOfDOParams =0;
            noDOParams.add(noOfDOParams);
            noOfSTParams =0;
            noSTParams.add(noOfSTParams);
            if(ctx.TYPE().getText().equals("int")) {
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }else if(ctx.TYPE().getText().equals("double")) {
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }else if(ctx.TYPE().getText().equals("string")) {
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }
            tre.add("ret");
            if(ctx.type2 != null) {
                checkReturnType(ctx.type2.getText(), ctx.returnVal.getStart());
            }else {
                checkReturnTypeArray(ctx.type1.getText(), ctx.returnVal.getStart());
            }
        }
    }
    public void exitMethodnameparam(GParser.MethodnameparamContext ctx) {
        if (ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if(dup.contains(ctx.funcName.getText())){
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            functions.add(ctx.funcName.getText());
            if(ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("int")){
                if(params.size() != 0){
                    noParams.add(params.size());
                }else if(paramsarray.size() != 0){
                    noParams.add(0);
                }
                paramsarray.clear();
                params.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }else{
                noParams.add(0);
            }
            if(ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("double")) {
               if(paramsdoub.size() != 0){
                    noDOParams.add(paramsdoub.size());
                }else if(paramsarraydoub.size() != 0){
                   noDOParams.add(0);
               }
                paramsarraydoub.clear();
                paramsdoub.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }else{
                noDOParams.add(0);
            }if(ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("string")) {
              if(paramsst.size() != 0){
                    noSTParams.add(paramsst.size());
                }
              else if(paramsarrayst.size() != 0){
                  noSTParams.add(0);
              }
                paramsarrayst.clear();
                paramsst.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }else{
                noSTParams.add(0);
            }
            if (ctx.statements != null) {
                tre.add("me");
            }
            tre.add("ret");
        }
    }
    public void exitMethodname(GParser.MethodnameContext ctx) {
        if (ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if(dup.contains(ctx.funcName.getText())){
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            noOfParams =0;
            noParams.add(noOfParams);
            noOfDOParams =0;
            noDOParams.add(noOfDOParams);
            noOfSTParams =0;
            noSTParams.add(noOfSTParams);
            noSTlocals.add(2);
            noDOlocals.add(2);
            nolocals.add(2);
            functions.add(ctx.funcName.getText());
            if (ctx.statements != null) {
                tre.add("me");
            }
            tre.add("ret");
        }
    }
    public void exitStart(GParser.StartContext ctx){
        if(ctx != null){
            tre.add(ctx.START().getText());
        }
    }
    public void exitMethodparams(GParser.MethodparamsContext ctx){
        if(ctx != null) {
            List<String> dup = new ArrayList<>(findDuplicates(Listener.functionsNmae));
            if(dup.contains(ctx.funcName.getText())){
                throw new FunctionAlreadyDefined(ctx.funcName);
            }
            functions.add(ctx.funcName.getText());
            st.visit(ctx.params);
            //String s = ctx.params.getText();
            //System.out.println(s);

            if(ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("int")) {
                if (params.size() != 0) {
                    noParams.add(params.size());
                }
                if (paramsarray.size() != 0) {
                    noParams.add(0);
                }
                paramsarray.clear();
                params.clear();
                nolocals.add(2);
                noDOlocals.add(2);
                noSTlocals.add(2);
            }else{
                noParams.add(0);
            }if(ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().equals("double")) {
               if(paramsdoub.size() != 0){
                    noDOParams.add(paramsdoub.size());
                }else if(paramsarraydoub.size() != 0){
                   noDOParams.add(0);
               }
                paramsarraydoub.clear();
                paramsdoub.clear();
                noDOlocals.add(2);
                noSTlocals.add(2);
                nolocals.add(2);
            }else{
                noDOParams.add(0);
            }
            if(ctx.parameters().parameterDeclaration.paramDeclaration().TYPE().getText().contains("string")) {
                noSTlocals.add(2);
                nolocals.add(2);
                noDOlocals.add(2);
            }else if(ctx.params.getText().contains("string")){
                if(paramsst.size() != 0){
                    noSTParams.add(paramsst.size());
                }else if(paramsarrayst.size() != 0){
                    noSTParams.add(0);
                }

                paramsarrayst.clear();
                paramsst.clear();
            }else{
                noSTParams.add(0);
            }
            if(ctx.statements != null) {
                tre.add("me");
                returnStr.add(ctx.statements.getText());
            }if(ctx.type2 != null) {
                checkReturnType(ctx.type2.getText(), ctx.returnVal.getStart());
            }else {
                checkReturnTypeArray(ctx.type1.getText(), ctx.returnVal.getStart());
            }
            tre.add("ret");
        }
    }
    public void exitCall1(GParser.Call1Context ctx){
        if(ctx != null) {
            tre.add("call");
            if(!Listener.functionsNmae.contains(ctx.funcName.getText())){
                throw new UndefinedFunctionException(ctx.funcName);
            }
            tre.add(ctx.funcName.getText());
            //System.out.println(ctx.funcName.getText());
        }
    }
    public void exitCallparams(GParser.CallparamsContext ctx){
        if(ctx != null) {
            tre.add("call");
            if(!Listener.functionsNmae.contains(ctx.funcName.getText())){
                throw new UndefinedFunctionException(ctx.funcName);
            }
            tre.add(ctx.funcName.getText());
            //System.out.println(ctx.funcName.getText());
        }
    }
    public void exitNum(GParser.NumContext ctx) {
        if (ctx != null) {
            tre.add("iconst");
            tre.add(ctx.Num.getText());
        }
    }
    public void exitDoub(GParser.DoubContext ctx) {
        if (ctx != null) {
            tre.add("dconst");
            double d = Double.parseDouble(ctx.Double.getText());
            doubles.add(d);
            tre.add(String.valueOf(doubles.size()-1));
        }
    }
    public void exitString(GParser.StringContext ctx) {
        if (ctx != null) {
            tre.add("stl");
            int g = 1;
            int f = ctx.txt.getText().length();
            f=f-1;
            str.add(ctx.txt.getText().substring(g,f));
            tre.add(String.valueOf(str.size()-1));
        }
    }
    public void exitBranch(GParser.BranchContext ctx){
        if(ctx!=null){
            st.visit(ctx.condition);
            st.visit(ctx.onFalse);
            st.visit(ctx.onTrue);
        }
    }
    public void exitForloop(GParser.ForloopContext ctx){
        if(ctx!=null){
            st.visit(ctx.condition);
        }
    }
    public void exitTrueblockstart(GParser.TrueblockstartContext ctx){
        if(ctx!=null){
            tre.add("brfif");
        }
    }
    public void exitFalseblockstart(GParser.FalseblockstartContext ctx){
        if(ctx!=null){
            tre.add("br");
            tre.add("falseblock");
        }
    }
    public void exitFalseblockstop(GParser.FalseblockstopContext ctx){
        if(ctx!=null){
            tre.add("falsestop");
        }
    }
    public void exitWhileloop(GParser.WhileloopContext ctx){
        if(ctx!=null){
            st.visit(ctx.condition);
            //System.out.println(ctx.condition.expressiondoub().getText());
            st.visit(ctx.blockloop());
        }
    }
    public void exitWhileblockstart(GParser.WhileblockstartContext ctx){
        if(ctx!=null){
            tre.add("brff");
        }
    }
    public void exitWhileblockstop(GParser.WhileblockstopContext ctx){
        if(ctx!=null){
            tre.add("br");
            tre.add("whilestop");
        }
    }
    public void exitLoopbegin(GParser.LoopbeginContext ctx){
        if(ctx!=null){
            tre.add("whilecond");
        }
    }
    public void exitVarcalc(GParser.VarcalcContext ctx){
        if(ctx != null){
            if(variablesint.containsKey(ctx.IDENTIFIER().getText())) {
                tre.add("brffor");
                loadval=variablesint.get(ctx.IDENTIFIER().getText());
            }else if(locals.containsKey(ctx.IDENTIFIER().getText())){
                loc = true;
                tre.add("brffor");
                loadval=locals.get(ctx.IDENTIFIER().getText());
            }
        }
    }
    public void exitForend(GParser.ForendContext ctx){
        if(ctx!=null){
            if(loc==false) {
                tre.add("gload");
                tre.add(String.valueOf(loadval));
                tre.add("iconst");
                tre.add("1");
                tre.add("iadd");
                tre.add("gstore");
                tre.add(String.valueOf(loadval));
                tre.add("br");
                tre.add("forend");
            }else{
                tre.add("load");
                tre.add(String.valueOf(loadval));
                tre.add("iconst");
                tre.add("1");
                tre.add("iadd");
                tre.add("store");
                tre.add(String.valueOf(loadval));
                tre.add("br");
                tre.add("forend");
            }
        }
    }
    public void exitStarti(GParser.StartiContext ctx){
        if(ctx!=null){
            tre.add("forstart");
        }
    }
    private int requireVarTndex(Token varNameToken){
        Integer varIndex = variablesint.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexdo(Token varNameToken){
        Integer varIndex = variablesdoub.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexSt(Token varNameToken){
        Integer varIndex = variablesst.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexLocal(Token varNameToken){
        Integer varIndex = locals.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexObjs(Token varNameToken){
        Integer varIndex = objs.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexLocaldoub(Token varNameToken){
        Integer varIndex = localsdoub.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexLocalst(Token varNameToken){
        Integer varIndex = localsst.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredVariableException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexArrayst(Token varNameToken){
        Integer varIndex = arrayst.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredArrayException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexArrayint(Token varNameToken){
        Integer varIndex = arrayint.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredArrayException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexArraydoub(Token varNameToken){
        Integer varIndex = arraydo.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredArrayException(varNameToken);
        }
        return  varIndex;
    }
    private int requireVarTndexArrayobjs(Token varNameToken){
        Integer varIndex = arrayobjs.get(varNameToken.getText());
        if(varIndex == null) {
            throw new UndeclaredArrayException(varNameToken);
        }
        return  varIndex;
    }
    public static Set<String> findDuplicates(List<String> listContainingDuplicates) {
        final Set<String> setToReturn = new HashSet<>();
        final Set<String> set1 = new HashSet<>();
        for (String yourInt : listContainingDuplicates)
        {
            if (!set1.add(yourInt))
            {
                setToReturn.add(yourInt);
            }
        }
        return setToReturn;
    }
    public static List<String> getType(){
        List<String> lis = new ArrayList<>();
        for(int i =0; i < Listener.arrayname.size(); i++) {
            if(Listener.arraynamefor.contains(Listener.arrayname.get(i))){
                lis.add(Listener.arraytype.get(i));
            }
        }
        return lis;
    }
    public static void setPlace() {
        int fort = 0;
        for (int i = 0; i < getType().size(); i++) {
            int h = Listener.arraynumb.get(i);
            if (getType().get(i).equals("double") && h!= 1) {
                //System.out.println(Listener.arraynumb.get(i));
                fort = h;
                tre.add("storing");
                tre.add("iconst");
                tre.add("num");
                look.add("num");
                looknumb.add(fort);
                tre.add("aaload");
                tre.add("toSomething");
            }
        }
    }
    public void exitArraycall1(GParser.Arraycall1Context ctx){
        if(ctx != null){
            if(arrayint.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(arraydo.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(arrayst.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(paramsarray.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(paramsarraydoub.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(paramsarrayst.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(arrayobjs.containsKey(ctx.arrayName.getText())){
                tre.add("aload");
                tre.add(String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }
        }
    }
    public void exitArraycall2(GParser.Arraycall2Context ctx){
        if(ctx != null){
            if(arrayint.containsKey(ctx.arrayName.getText())){
               int t = tre.indexOf("aloadarray");
               tre.remove(t);
               tre.add(t,"aload");
               int y = tre.indexOf("pos");
               tre.remove(y);
               tre.add(y,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
               int e = tre.indexOf("astorearray");
               tre.remove(e);
               tre.add(e,"astore");
               tre.add(e,"iaload");
               int r = tre.indexOf("poss");
               tre.remove(r);
               tre.add(r,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(arraydo.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                tre.add(t,"aload");
                int y = tre.indexOf("pos");
                tre.remove(y);
                tre.add(y,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"astore");
                tre.add(e,"daload");
                int r = tre.indexOf("poss");
                tre.remove(r);
                tre.add(r,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(arrayst.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                tre.add(t,"aload");
                int y = tre.indexOf("pos");
                tre.remove(y);
                tre.add(y,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"astore");
                tre.add(e,"staload");
                int r = tre.indexOf("poss");
                tre.remove(r);
                tre.add(r,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(arrayobjs.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                tre.add(t,"aload");
                int y = tre.indexOf("pos");
                tre.remove(y);
                tre.add(y,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"astore");
                tre.add(e,"oaload");
                int r = tre.indexOf("poss");
                tre.remove(r);
                tre.add(r,String.valueOf(Listener.arraynam.get(ctx.arrayName.getText())));
            }else if(paramsarray.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                int y = tre.indexOf("pos");
                tre.remove(y);
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"iaload");
                int r = tre.indexOf("poss");
                tre.remove(r);
            }
            else if(paramsarraydoub.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                int y = tre.indexOf("pos");
                tre.remove(y);
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"daload");
                int r = tre.indexOf("poss");
                tre.remove(r);
            }
            else if(paramsarrayst.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                int y = tre.indexOf("pos");
                tre.remove(y);
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"staload");
                int r = tre.indexOf("poss");
                tre.remove(r);
            }else if(paramarrayobjs.containsKey(ctx.arrayName.getText())){
                int t = tre.indexOf("aloadarray");
                tre.remove(t);
                int y = tre.indexOf("pos");
                tre.remove(y);
                int e = tre.indexOf("astorearray");
                tre.remove(e);
                tre.add(e,"oaload");
                int r = tre.indexOf("poss");
                tre.remove(r);
            }
        }
    }
    public void exitArraycal(GParser.ArraycalContext ctx){
        if(ctx != null){
            tre.add("aloadarray");
            tre.add("pos");
        }
    }
    public void exitArraycale(GParser.ArraycaleContext ctx){
        if(ctx != null){
            tre.add("aaload");
            tre.add("astorearray");
            tre.add("poss");
        }
    }
    private void checkReturnType(String methodtype, Token returnval) {
        if (locals.containsKey(returnval.getText())) {
            if(!methodtype.equals("int")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(variablesint.containsKey(returnval.getText())) {
            if(!methodtype.equals("int")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(prm.containsKey(returnval.getText())) {
            if(!methodtype.equals("int")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(localsdoub.containsKey(returnval.getText())){
            if(!methodtype.equals("double")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(variablesdoub.containsKey(returnval.getText())) {
            if(!methodtype.equals("double")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(prmd.containsKey(returnval.getText())) {
            if(!methodtype.equals("double")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(localsst.containsKey(returnval.getText())) {
            if(!methodtype.equals("string")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(variablesst.containsKey(returnval.getText())) {
            if(!methodtype.equals("string")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(prms.containsKey(returnval.getText())) {
            if(!methodtype.equals("string")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(objs.containsKey(returnval.getText())) {
            if(!methodtype.equals("Object")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(paramobjs.containsKey(returnval.getText())) {
            if(!methodtype.equals("Object")) {
                throw new ReturnTypeException(returnval);
            }
        }
    }
    private void checkReturnTypeArray(String methodtype, Token returnval) {
        if (arrayint.containsKey(returnval.getText())) {
            if(!methodtype.equals("int")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(prmarray.containsKey(returnval.getText())) {
            if(!methodtype.equals("int")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(arraydo.containsKey(returnval.getText())){
            if(!methodtype.equals("double")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(prmarrayd.containsKey(returnval.getText())) {
            if(!methodtype.equals("double")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(arrayst.containsKey(returnval.getText())) {
            if(!methodtype.equals("string")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(prmarrays.containsKey(returnval.getText())) {
            if(!methodtype.equals("string")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(arrayobjs.containsKey(returnval.getText())) {
            if(!methodtype.equals("Object")) {
                throw new ReturnTypeException(returnval);
            }
        }else if(paramarrayobjs.containsKey(returnval.getText())) {
            if(!methodtype.equals("Object")) {
                throw new ReturnTypeException(returnval);
            }
        }
    }
}

