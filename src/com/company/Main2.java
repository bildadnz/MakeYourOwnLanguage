package com.company;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import parser.GLexer;
import parser.GParser;
public class Main2 {

    public static void main(String[] args2) throws Exception {
        try {
            ANTLRInputStream input = new ANTLRFileStream("C:\\Users\\Dell Workstation\\Desktop\\excomp\\Lang\\src\\com\\company\\code.m");
            GLexer lexer = new GLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GParser parser = new GParser(tokens);
            parser.addParseListener(new Listener());
            parser.program();
        }catch (Exception e){
        }
    }
}
