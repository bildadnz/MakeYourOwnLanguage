package com.company;

import parser.GBaseListener;
import parser.GParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Listener extends GBaseListener {
    public static List<String> functionsNmae = new ArrayList<>();
    public static List<Integer> arraynumb = new ArrayList<>();
    public static List<String> arraytype = new ArrayList<>();
    public static List<String> arraynamefor = new ArrayList<>();
    public static List<String> arrayname = new ArrayList<>();
    public static Map<String, Integer> arraynam = new HashMap<>();

    public void exitMethodparams(GParser.MethodparamsContext ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitMethod1(GParser.Method1Context ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitMethodvoid(GParser.MethodvoidContext ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitMethodvoidparams(GParser.MethodvoidparamsContext ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitMethodnostatement(GParser.MethodnostatementContext ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitMethodname(GParser.MethodnameContext ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitMethodnameparam(GParser.MethodnameparamContext ctx){
        functionsNmae.add(ctx.funcName.getText());
    }
    public void exitAssign2(GParser.Assign2Context ctx){
        arraynumb.add(ctx.assignlistval.count.size());
        arraynamefor.add(ctx.arrayName.getText());
        }
    public void exitVarDeclarationArray(GParser.VarDeclarationArrayContext ctx){
        arraytype.add(ctx.TYPE(1).getText());
        arrayname.add(ctx.arrayName.getText());
        arraynam.put(ctx.arrayName.getText(),arraynam.size());
    }
    public void exitParamDeclarationArray(GParser.ParamDeclarationArrayContext ctx){
        //arraynam.put(ctx.paramarrayName.getText(),arraynam.size());
    }
    public void exitObject(GParser.ObjectContext ctx){
        if(ctx != null){
            if(ctx.classname.getText().equals("Math")){
                try {
                    new TransferData("src/com/company/code.m","src/Lib/Math");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
