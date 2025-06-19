package com.company;

import parser.GBaseVisitor;
import parser.GParser;
import parser.GParser.AssignmentContext;
import parser.GParser.VarDeclarationContext;
import parser.GParser.MulContext;
import parser.GParser.NumContext;
import  parser.GParser.PlusContext;
import parser.GParser.PrintContext;
import parser.GParser.DivContext;
import parser.GParser.MinusContext;

import java.util.HashMap;
import java.util.Map;

public class Myvisitor extends GBaseVisitor<String> {
    private Map<String, Integer> variables = new HashMap<>();


    public String visitPlus(PlusContext ctx) {
        return visitChildren(ctx) +
                "iadd,";
    }
    public String visitMul(MulContext ctx) {
        return visitChildren(ctx) +
                "imul,";
    }
    public String visitDiv(DivContext ctx) {
        return visitChildren(ctx) +
                "idiv,";
    }
    public String visitMinus(MinusContext ctx) {
        return visitChildren(ctx) +
                "isub,";
    }
    @Override
    public String visitNum(NumContext ctx) {
        return "iconst," + ctx.Num.getText() + ",";
    }

    @Override
    public String visitVarDeclaration(VarDeclarationContext ctx) {
       variables.put(ctx.varName.getText(), variables.size());
        return "";
    }

    @Override
    public String visitAssignment(AssignmentContext ctx) {
       return visit(ctx.expr) +
            "gstore," + variables.get(ctx.varName.getText()) + ",";
    }

    @Override
    public String visitVariable(GParser.VariableContext ctx) {
        return "gload," + variables.get(ctx.var.getText()) + ",";
    }
    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if(aggregate == null){
            return nextResult;
        }
        if(nextResult == null){
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }
}
