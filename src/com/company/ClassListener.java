package com.company;

import parser.GBaseListener;
import parser.GParser;

public class ClassListener extends GBaseListener{
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
