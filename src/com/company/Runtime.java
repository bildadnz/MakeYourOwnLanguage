package com.company;

import Vm.FuncMetaData;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import parser.GParser;
import parser.GLexer;

import static Vm.Bytecode.*;
import Vm.Vm;

public class Runtime {
    private static List<Integer> list = new ArrayList<>();
    private static List<String> listsMove = new ArrayList<>();
    private static List<String> lists = new ArrayList<>();
    private static List<Object> objects = new ArrayList<>();
    private static  int mainAddr;
    private static List<Integer> funcAddr = new ArrayList<>();
    private static List<Integer> posRemove = new ArrayList<>();
    private static List<Integer> mainLocal = new ArrayList<>();
    private static List<Integer> mainLocalST = new ArrayList<>();
    private static List<Integer> mainLocalDO = new ArrayList<>();
    FuncMetaData[] code_metad;
    static int[] toIntArray(List<Integer> listg){
        int[] ret = new int[listg.size()];
        for(int i = 0;i < listg.size();i++) {
            ret[i] = listg.get(i);
        }
        return ret;
    }
    static String[] toStringArray(List<String> listg){
        String[] ret = new String[listg.size()];
        for(int i = 0;i < listg.size();i++) {
            ret[i] = listg.get(i);
        }
        return ret;
    }
    static double[] toDoubleArray(List<Double> listg){
        double[] ret = new double[listg.size()];
        for(int i = 0;i < listg.size();i++) {
            ret[i] = listg.get(i);
        }
        return ret;
    }
    static Object[] toObjectArray(List<Object> listg){
        Object[] ret = new Object[listg.size()];
        for(int i = 0;i < listg.size();i++) {
            ret[i] = listg.get(i);
        }
        return ret;
    }
    private static void codeRun(List<String> lisd){
        for(String s: lisd) {
            switch (s) {
                case "iconst":
                    list.add(new Integer(ICONST));
                    break;
                case "iadd":
                    list.add(new Integer(IADD));
                    break;
                case "imul":
                    list.add(new Integer(IMUL));
                    break;
                case "idiv":
                    list.add(new Integer(IDIV));
                    break;
                case "isub":
                    list.add(new Integer(ISUB));
                    break;
                case "gload":
                    list.add(new Integer(GLOAD));
                    break;
                case "gstore":
                    list.add(new Integer(GSTORE));
                    break;
                case "print":
                    list.add(new Integer (PRINT));
                    break;
                case "call":
                    list.add(new Integer(CALL));
                    break;
                case "ret":
                    list.add(new Integer(RET));
                    break;
                case "store":
                    list.add(new Integer(STORE));
                    break;
                case "load":
                    list.add(new Integer(LOAD));
                    break;
                case "ieq":
                    list.add(new Integer(IEQ));
                    break;
                case "brf":
                    list.add(new Integer(BRF));
                    break;
                case "igt":
                    list.add(new Integer(IGT));
                    break;
                case "ilt":
                    list.add(new Integer(ILT));
                    break;
                case "br":
                    list.add(new Integer(BR));
                    break;
                case "iget":
                    list.add(new Integer(IGET));
                    break;
                case "ilet":
                    list.add(new Integer(ILET));
                    break;
                case "dconst":
                    list.add(new Integer(DCONST));
                    break;
                case "dgstore":
                    list.add(new Integer(DGSTORE));
                    break;
                case "dgload":
                    list.add(new Integer(DGLOAD));
                    break;
                case "dprint":
                    list.add(new Integer(DPRINT));
                    break;
                case "stl":
                    list.add(new Integer(STL));
                    break;
                case "prst":
                    list.add(new Integer(PRST));
                    break;
                case "stload":
                    list.add(new Integer(STLOAD));
                    break;
                case "stgload":
                    list.add(new Integer(STGLOAD));
                    break;
                case "ststore":
                    list.add(new Integer(STSTORE));
                    break;
                case "stgstore":
                    list.add(new Integer(STGSTORE));
                    break;
                case "dload":
                    list.add(new Integer(DLOAD));
                    break;
                case "dstore":
                    list.add(new Integer(DSTORE));
                    break;
                case "dadd":
                    list.add(new Integer(DADD));
                    break;
                case "dmul":
                    list.add(new Integer(DMUL));
                    break;
                case "ddiv":
                    list.add(new Integer(DDIV));
                    break;
                case "dsub":
                    list.add(new Integer(DSUB));
                    break;
                case "dgt":
                    list.add(new Integer(DGT));
                    break;
                case "dlt":
                    list.add(new Integer(DLT));
                    break;
                case "deq":
                    list.add(new Integer(DEQ));
                    break;
                case "dget":
                    list.add(new Integer(DGET));
                    break;
                case "dlet":
                    list.add(new Integer(DLET));
                    break;
                case "aastore":
                    list.add(new Integer(AASTORE));
                    break;
                case "aaload":
                    list.add(new Integer(AALOAD));
                    break;
                case "aload":
                    list.add(new Integer(ALOAD));
                    break;
                case "astore":
                    list.add(new Integer(ASTORE));
                    break;
                case "arraylength":
                    list.add(new Integer(ARRAYLENGTH));
                    break;
                case "iaload":
                    list.add(new Integer(IALOAD));
                    break;
                case "iastore":
                    list.add(new Integer(IASTORE));
                    break;
                case "daload":
                    list.add(new Integer(DALOAD));
                    break;
                case "dastore":
                    list.add(new Integer(DASTORE));
                    break;
                case "stastore":
                    list.add(new Integer(STASTORE));
                    break;
                case "staload":
                    list.add(new Integer(STALOAD));
                    break;
                case "newarraytypei":
                    list.add(new Integer(NEWARRAYTYPEI));
                    break;
                case "newarraytyped":
                    list.add(new Integer(NEWARRAYTYPED));
                    break;
                case "newarraytypes":
                    list.add(new Integer(NEWARRAYTYPES));
                    break;
                case "newarrraytypeO":
                    list.add(new Integer(NEWARRAYTYPEO));
                    break;
                case "newobj":
                    list.add(new Integer(NEWOBJ));
                    break;
                case "oload":
                    list.add(new Integer(OLOAD));
                    break;
                case "ostore":
                    list.add(new Integer(OSTORE));
                    break;
                case "oastore":
                    list.add(new Integer(OASTORE));
                    break;
                case "oaload":
                    list.add(new Integer(OALOAD));
                    break;
                case "OtoI":
                    list.add(new Integer(OTOI));
                    break;
                case "OtoD":
                    list.add(new Integer(OTOD));
                    break;
                case "OtoS":
                    list.add(new Integer(OTOS));
                    break;
                case "ostores":
                    list.add(new Integer(OSTORES));
                    break;
                case "oastores":
                    list.add(new Integer(OASTORES));
                    break;
                case "ostorei":
                    list.add(new Integer(OSTOREI));
                    break;
                case "oastorei":
                    list.add(new Integer(OASTOREI));
                    break;
                case "ostored":
                    list.add(new Integer(OSTORED));
                    break;
                case "oastored":
                    list.add(new Integer(OASTORED));
                    break;
                case "iaddd":
                    list.add(new Integer(IADDD));
                    break;
                case "imuld":
                    list.add(new Integer(IMULD));
                    break;
                case "idivd":
                    list.add(new Integer(IDIVD));
                    break;
                case "ddivi":
                    list.add(new Integer(DDIVI));
                    break;
                case "isubd":
                    list.add(new Integer(ISUBD));
                    break;
                case "dsubi":
                    list.add(new Integer(DSUBI));
                    break;
                default:
                    try {
                        int b = Integer.parseInt(s);
                        list.add(b);
                    } catch (NumberFormatException ignored) {
                    }
            }
        }
            list.add(new Integer(HALT));
    }

    public static void placement(){
        lists = BListener.tre;
        String df;
        do{
            int s= lists.indexOf("to");
            lists.remove(s);
        }while(lists.contains("to"));
      for(int i = 0; i < BListener.functions.size(); i++){
          while (lists.contains(BListener.functions.get(i))) {
              df = BListener.functions.get(i);
              int fr = lists.indexOf(df);
              lists.remove(fr);
              lists.add(fr, String.valueOf(i + 1));
          }
      }
      int len =0;
      int pos = 0;
      do {
          len = lists.indexOf("{");
          funcAddr.add(pos);
          lists.remove(len);
          int se = lists.indexOf("me");
          lists.remove(se);
          int fe = se - len;
          pos=pos+fe+1;
          int size = se+1;
          for(int n = len; n < size; n++){
              posRemove.add(n);
          }
        } while (lists.contains("me"));
        for(int i =0; i < posRemove.size(); i++) {
            //lists.remove(posRemove.get(i));
            listsMove.add(i, lists.get(posRemove.get(i)));
        }
        int d =0;
      do{
          int s= listsMove.indexOf("brfif");
          listsMove.remove(s);
          listsMove.add(s,"brf");
          s=s+1;
          int f = listsMove.indexOf("falseblock");
          //System.out.println(listsMove);
          listsMove.remove(f);
          int g = listsMove.indexOf("falsestop");
          listsMove.remove(g);
          g=g+2;
          listsMove.add(f,String.valueOf(g));
          f=f+2;
          listsMove.add(s,String.valueOf(f));
      }while(listsMove.contains("falseblock"));
        mainAddr = listsMove.size();
        for(int i = 0; i < lists.size(); i++){
            if (!posRemove.contains(i)) {
                listsMove.add(lists.get(i));
            }
        }
        do{
            int s= listsMove.indexOf("brfif");
            listsMove.remove(s);
            listsMove.add(s,"brf");
            s=s+1;
            int f = listsMove.indexOf("falseblock");
            //System.out.println(listsMove);
            listsMove.remove(f);
            int g = listsMove.indexOf("falsestop");
            listsMove.remove(g);
            g=g+2;
            listsMove.add(f,String.valueOf(g));
            f=f+2;
            listsMove.add(s,String.valueOf(f));
        }while(listsMove.contains("falseblock"));
        do{
            int s= listsMove.indexOf("brff");
            listsMove.remove(s);
            listsMove.add(s,"brf");
            s=s+1;
            int f = listsMove.indexOf("whilestop");
            listsMove.remove(f);
            listsMove.add(s,String.valueOf(f+1));
            s=listsMove.indexOf("whilecond");
            listsMove.remove(s);
            listsMove.add(f,String.valueOf(s));
        }while(listsMove.contains("whilestop"));
        do{
            int s= listsMove.indexOf("brffor");
            listsMove.remove(s);
            listsMove.add(s,"brf");
            s=s+1;
            int f = listsMove.indexOf("forend");
            listsMove.remove(f);
            listsMove.add(s,String.valueOf(f+1));
            s=listsMove.indexOf("forstart");
            listsMove.remove(s);
            listsMove.add(f,String.valueOf(s));
        }while(listsMove.contains("forend"));
        for(int lo = 0; lo < BListener.getType().size(); lo++){
            int count=1;
            int counter = 0;
            int counting = 0;
            if(BListener.getType().get(lo).equals("double")){
                while(listsMove.contains("num") && count < Listener.arraynumb.get(lo)) {
                    int s = listsMove.indexOf("num");
                    listsMove.remove(s);
                    listsMove.add(s, String.valueOf(count));
                    count = count + 1;
                }while(listsMove.contains("storing") && counter < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("storing");
                    listsMove.remove(s);
                    listsMove.add(s, "dastore");
                    counter = counter + 1;
                }while(listsMove.contains("toSomething") && counting < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("toSomething");
                    listsMove.remove(s);
                    counting = counting + 1;
                }
            }else if(BListener.getType().get(lo).equals("string")){
                while(listsMove.contains("num") && count < Listener.arraynumb.get(lo)) {
                    int s = listsMove.indexOf("num");
                    listsMove.remove(s);
                    listsMove.add(s, String.valueOf(count));
                    count = count + 1;
                }while(listsMove.contains("storing")&& counter < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("storing");
                    listsMove.remove(s);
                    listsMove.add(s, "stastore");
                    counter = counter + 1;
                }while(listsMove.contains("toSomething") && counting < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("toSomething");
                    listsMove.remove(s);
                    counting = counting + 1;
                }
            }else if(BListener.getType().get(lo).equals("int")){
                while(listsMove.contains("num") && count < Listener.arraynumb.get(lo)) {
                    int s = listsMove.indexOf("num");
                    listsMove.remove(s);
                    listsMove.add(s, String.valueOf(count));
                    count = count + 1;
                }while(listsMove.contains("storing")&& counter < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("storing");
                    listsMove.remove(s);
                    listsMove.add(s, "iastore");
                    counter = counter + 1;
                }while(listsMove.contains("toSomething") && counting < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("toSomething");
                    listsMove.remove(s);
                    counting = counting + 1;
                }
            }else if(BListener.getType().get(lo).equals("Object")){
                while(listsMove.contains("num") && count < Listener.arraynumb.get(lo)) {
                    int s = listsMove.indexOf("num");
                    listsMove.remove(s);
                    listsMove.add(s, String.valueOf(count));
                    count = count + 1;
                }while(listsMove.contains("storing")&& counter < Listener.arraynumb.get(lo)){
                    int s = listsMove.indexOf("storing");
                    listsMove.remove(s);
                    listsMove.add(s, "oastore");
                    counter = counter + 1;
                }
            }
        }
        do{
            int s= listsMove.indexOf("toSomething");
            listsMove.remove(s);
            if(listsMove.get(s).equals("iconst")){
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastorei");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostorei");
                }
                objects.add("check stack");
            }else if(listsMove.get(s).equals("dconst")){
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastored");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostored");
                }
                objects.add("check dstack");
            }else if(listsMove.get(s).equals("stl")) {
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastores");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostores");
                }
                objects.add("check ststack");
            }else if(listsMove.get(s).equals("gload")){
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastorei");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostorei");
                }
                objects.add("check stack");
            }else if(listsMove.get(s).equals("dgload")){
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastored");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostored");
                }
                objects.add("check dstack");
            }else if(listsMove.get(s).equals("stgload")) {
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastores");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostores");
                }
                objects.add("check ststack");
            }else if(listsMove.get(s).equals("load")){
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastorei");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostorei");
                }
                objects.add("check stack");
            }else if(listsMove.get(s).equals("dload")){
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastored");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostored");
                }
                objects.add("check dstack");
            }else if(listsMove.get(s).equals("stload")) {
                if(listsMove.get(s+2).equals("oastore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"oastores");
                }else if(listsMove.get(s+2).equals("ostore")){
                    listsMove.remove(s+2);
                    listsMove.add(s+2,"ostores");
                }
                objects.add("check ststack");
            }else if(listsMove.get(s+2).equals("dgstore")) {
                listsMove.add(s + 2, "OtoD");
            }else if(listsMove.get(s+2).equals("stgstore")) {
                listsMove.add(s + 2, "OtoS");
            }else if(listsMove.get(s+2).equals("gstore")) {
                listsMove.add(s + 2, "OtoI");
            }else if(listsMove.get(s+2).equals("dstore")) {
                listsMove.add(s + 2, "OtoD");
            }else if(listsMove.get(s+2).equals("ststore")) {
                listsMove.add(s + 2, "OtoS");
            }else if(listsMove.get(s+2).equals("store")) {
                listsMove.add(s + 2, "OtoI");
            }
        }while(listsMove.contains("toSomething"));
        List<Integer> checka = new ArrayList<>();
        for(int i = 0; i < BListener.nolocals.size(); i++){
            if(BListener.nolocals.get(i).equals(2)){
                checka.add(2);
            }
        }
        if(checka.size() != BListener.noParams.size()){
            BListener.nolocals.add(2);
            BListener.noDOlocals.add(2);
        }
        for(int l = 0; l < listsMove.size(); l++){
            if(listsMove.get(l).equals("isub")){
                if(listsMove.get(l-4).equals("dgload")){
                    listsMove.remove(l);
                    listsMove.add(l,"dsubi");
                }else if(listsMove.get(l-4).equals("dload")){
                    listsMove.remove(l);
                    listsMove.add(l,"dsubi");
                }
                else if(listsMove.get(l-5).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"dsubi");
                }
                else if(listsMove.get(l-3).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"isubd");
                }
            }else if(listsMove.get(l).equals("iadd")){
                if(listsMove.get(l-4).equals("dgload")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                }else if(listsMove.get(l-4).equals("dload")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                }
                else if(listsMove.get(l-5).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                } else if(listsMove.get(l-3).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                }
            }else if(listsMove.get(l).equals("dadd")){
                if(listsMove.get(l-4).equals("gload")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                }else if(listsMove.get(l-4).equals("load")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                }
                else if(listsMove.get(l-5).equals("iaload")){
                    listsMove.remove(l);
                    listsMove.add(l,"iaddd");
                }
            }else if(listsMove.get(l).equals("dsub")){
                if(listsMove.get(l-4).equals("gload")){
                    listsMove.remove(l);
                    listsMove.add(l,"isubd");
                }else if(listsMove.get(l-4).equals("load")){
                    listsMove.remove(l);
                    listsMove.add(l,"isubd");
                }
                else if(listsMove.get(l-5).equals("iaload")){
                    listsMove.remove(l);
                    listsMove.add(l,"isubd");
                }
            }else if(listsMove.get(l).equals("imul")){
                if(listsMove.get(l-4).equals("dgload")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }else if(listsMove.get(l-4).equals("dload")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }
                else if(listsMove.get(l-5).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }else if(listsMove.get(l-3).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }
            }else if(listsMove.get(l).equals("dmul")){
                if(listsMove.get(l-4).equals("gload")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }else if(listsMove.get(l-4).equals("load")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }
                else if(listsMove.get(l-5).equals("iaload")){
                    listsMove.remove(l);
                    listsMove.add(l,"imuld");
                }
            }else if(listsMove.get(l).equals("ddiv")){
                if(listsMove.get(l-4).equals("gload")){
                    listsMove.remove(l);
                    listsMove.add(l,"idivd");
                }else if(listsMove.get(l-4).equals("load")){
                    listsMove.remove(l);
                    listsMove.add(l,"idivd");
                }
                else if(listsMove.get(l-5).equals("iaload")){
                    listsMove.remove(l);
                    listsMove.add(l,"idivd");
                }
            }else if(listsMove.get(l).equals("idiv")){
                if(listsMove.get(l-4).equals("dgload")){
                    listsMove.remove(l);
                    listsMove.add(l,"ddivi");
                }else if(listsMove.get(l-4).equals("dload")){
                    listsMove.remove(l);
                    listsMove.add(l,"ddivi");
                }
                else if(listsMove.get(l-5).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"ddivi");
                } else if(listsMove.get(l-3).equals("daload")){
                    listsMove.remove(l);
                    listsMove.add(l,"idivd");
                }
            }
        }
    }

    public FuncMetaData[] getCode_metad() {
        if(BListener.functions.size() == 1) {
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0))
                };
        }else if(BListener.functions.size() == 2){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1))
            };
        }else if(BListener.functions.size() == 3){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2))
            };
        }else if(BListener.functions.size() == 4){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3))
            };
        }else if(BListener.functions.size() == 5){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3)),
                    new FuncMetaData(BListener.functions.get(4),BListener.noParams.get(4),local5().get(0),BListener.noSTParams.get(4),local5().get(1),BListener.noDOParams.get(4), local5().get(2),funcAddr.get(4))
            };
        }else if(BListener.functions.size() == 6){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3)),
                    new FuncMetaData(BListener.functions.get(4),BListener.noParams.get(4),local5().get(0),BListener.noSTParams.get(4),local5().get(1),BListener.noDOParams.get(4), local5().get(2),funcAddr.get(4)),
                    new FuncMetaData(BListener.functions.get(5),BListener.noParams.get(5),local6().get(0),BListener.noSTParams.get(5),local6().get(1),BListener.noDOParams.get(5), local6().get(2),funcAddr.get(5))
            };
        }else if(BListener.functions.size() == 7){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3)),
                    new FuncMetaData(BListener.functions.get(4),BListener.noParams.get(4),local5().get(0),BListener.noSTParams.get(4),local5().get(1),BListener.noDOParams.get(4), local5().get(2),funcAddr.get(4)),
                    new FuncMetaData(BListener.functions.get(5),BListener.noParams.get(5),local6().get(0),BListener.noSTParams.get(5),local6().get(1),BListener.noDOParams.get(5), local6().get(2),funcAddr.get(5)),
                    new FuncMetaData(BListener.functions.get(6),BListener.noParams.get(6),local7().get(0),BListener.noSTParams.get(6),local7().get(1),BListener.noDOParams.get(6), local7().get(2),funcAddr.get(6))
            };
        }else if(BListener.functions.size() == 8){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3)),
                    new FuncMetaData(BListener.functions.get(4),BListener.noParams.get(4),local5().get(0),BListener.noSTParams.get(4),local5().get(1),BListener.noDOParams.get(4), local5().get(2),funcAddr.get(4)),
                    new FuncMetaData(BListener.functions.get(5),BListener.noParams.get(5),local6().get(0),BListener.noSTParams.get(5),local6().get(1),BListener.noDOParams.get(5), local6().get(2),funcAddr.get(5)),
                    new FuncMetaData(BListener.functions.get(6),BListener.noParams.get(6),local7().get(0),BListener.noSTParams.get(6),local7().get(1),BListener.noDOParams.get(6), local7().get(2),funcAddr.get(6)),
                    new FuncMetaData(BListener.functions.get(7),BListener.noParams.get(7),local8().get(0),BListener.noSTParams.get(7),local8().get(1),BListener.noDOParams.get(7), local8().get(2),funcAddr.get(7))
            };
        }else if(BListener.functions.size() == 9){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3)),
                    new FuncMetaData(BListener.functions.get(4),BListener.noParams.get(4),local5().get(0),BListener.noSTParams.get(4),local5().get(1),BListener.noDOParams.get(4), local5().get(2),funcAddr.get(4)),
                    new FuncMetaData(BListener.functions.get(5),BListener.noParams.get(5),local6().get(0),BListener.noSTParams.get(5),local6().get(1),BListener.noDOParams.get(5), local6().get(2),funcAddr.get(5)),
                    new FuncMetaData(BListener.functions.get(6),BListener.noParams.get(6),local7().get(0),BListener.noSTParams.get(6),local7().get(1),BListener.noDOParams.get(6), local7().get(2),funcAddr.get(6)),
                    new FuncMetaData(BListener.functions.get(7),BListener.noParams.get(7),local8().get(0),BListener.noSTParams.get(7),local8().get(1),BListener.noDOParams.get(7), local8().get(2),funcAddr.get(7)),
                    new FuncMetaData(BListener.functions.get(8),BListener.noParams.get(8),local9().get(0),BListener.noSTParams.get(8),local9().get(1),BListener.noDOParams.get(8), local9().get(2),funcAddr.get(8))
            };
        }else if(BListener.functions.size() == 10){
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr),
                    new FuncMetaData(BListener.functions.get(0),BListener.noParams.get(0),local1().get(0),BListener.noSTParams.get(0),local1().get(1),BListener.noDOParams.get(0), local1().get(2),funcAddr.get(0)),
                    new FuncMetaData(BListener.functions.get(1),BListener.noParams.get(1),local2().get(0),BListener.noSTParams.get(1),local2().get(1),BListener.noDOParams.get(1), local2().get(2),funcAddr.get(1)),
                    new FuncMetaData(BListener.functions.get(2),BListener.noParams.get(2),local3().get(0),BListener.noSTParams.get(2),local3().get(1),BListener.noDOParams.get(2), local3().get(2),funcAddr.get(2)),
                    new FuncMetaData(BListener.functions.get(3),BListener.noParams.get(3),local4().get(0),BListener.noSTParams.get(3),local4().get(1),BListener.noDOParams.get(3), local4().get(2),funcAddr.get(3)),
                    new FuncMetaData(BListener.functions.get(4),BListener.noParams.get(4),local5().get(0),BListener.noSTParams.get(4),local5().get(1),BListener.noDOParams.get(4), local5().get(2),funcAddr.get(4)),
                    new FuncMetaData(BListener.functions.get(5),BListener.noParams.get(5),local6().get(0),BListener.noSTParams.get(5),local6().get(1),BListener.noDOParams.get(5), local6().get(2),funcAddr.get(5)),
                    new FuncMetaData(BListener.functions.get(6),BListener.noParams.get(6),local7().get(0),BListener.noSTParams.get(6),local7().get(1),BListener.noDOParams.get(6), local7().get(2),funcAddr.get(6)),
                    new FuncMetaData(BListener.functions.get(7),BListener.noParams.get(7),local8().get(0),BListener.noSTParams.get(7),local8().get(1),BListener.noDOParams.get(7), local8().get(2),funcAddr.get(7)),
                    new FuncMetaData(BListener.functions.get(8),BListener.noParams.get(8),local9().get(0),BListener.noSTParams.get(8),local9().get(1),BListener.noDOParams.get(8), local9().get(2),funcAddr.get(8)),
                    new FuncMetaData(BListener.functions.get(9),BListener.noParams.get(9),local10().get(0),BListener.noSTParams.get(9),local10().get(1),BListener.noDOParams.get(9), local10().get(2),funcAddr.get(9))
            };
        }
        else{
            code_metad = new FuncMetaData[]{
                    new FuncMetaData("main", 0, 0, 0,0,0,0,mainAddr)
            };
        }
        return code_metad;
    }

    public Runtime() throws IOException {
        functionFetch();
        ANTLRInputStream input = new ANTLRFileStream("C:\\Users\\Dell Workstation\\Desktop\\excomp\\Lang\\src\\com\\company\\code.txt");
        GLexer lexer = new GLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GParser parser = new GParser(tokens);
        parser.addParseListener(new BListener());
        parser.program();
        //System.out.println(new Myvisitor().visit(tree));
        System.out.println(BListener.tre);
        placement();
        //System.out.println(objects);
        System.out.println(listsMove);
        codeRun(listsMove);
        //System.out.println(list);
        Vm vm = new Vm(toIntArray(list), toObjectArray(objects),toStringArray(BListener.str), toDoubleArray(BListener.doubles),BListener.noGlobals.size(),BListener.noSTGlobals.size(), BListener.noDoGlobals.size(), objects.size(),getCode_metad());
        vm.trace = true;
        vm.exec(getCode_metad()[0].address);
    }
    public static List<Integer> local1(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = BListener.nolocals;
        List<Integer> local2 = BListener.noDOlocals;
        List<Integer> local3 = BListener.noSTlocals;
        int y = local.indexOf(2);
        mainLocal=local.subList(y+1,local.size());
        local = local.subList(0,y);
        for(int f=0; f<local.size(); f++){
            if(local.get(f).equals(-1)){
                count = count+1;
            }
        }
        county.add(count);
        if(BListener.noDOlocals.size() != 0){
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count);
        }else{
            county.add(0);
        }
        if(local3.size() !=0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count);
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local2(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local1().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local1().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local1().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local3(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local2().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local2().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local2().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local4(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local3().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local3().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local3().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local5(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local4().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local4().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local4().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local6(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local5().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local5().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local5().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local7(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local6().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local6().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local6().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local8(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local7().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local7().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local7().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local9(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local8().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local8().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local8().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static List<Integer> local10(){
        List<Integer> county = new ArrayList<>();
        int count = 0;
        List<Integer> local = mainLocal;
        List<Integer> local2 = mainLocalDO;
        List<Integer> local3 = mainLocalST;
        int y =0;
        if(mainLocal.size() != 0) {
            y = local.indexOf(2);
            mainLocal = local.subList(y + 1, local.size());
            local = local.subList(0, y);
            for (int f = 0; f < local.size(); f++) {
                if (local.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local9().get(0));
        }else{
            county.add(0);
        }
        if(mainLocalDO.size() != 0) {
            y = local2.indexOf(2);
            mainLocalDO = local2.subList(y + 1, local2.size());
            local2 = local2.subList(0, y);
            for (int f = 0; f < local2.size(); f++) {
                if (local2.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local9().get(1));
        }else{
            county.add(0);
        }
        if(mainLocalST.size() != 0) {
            y = local3.indexOf(2);
            mainLocalST = local3.subList(y + 1, local3.size());
            local3 = local3.subList(0, y);
            for (int f = 0; f < local3.size(); f++) {
                if (local3.get(f).equals(-1)) {
                    count = count + 1;
                }
            }
            county.add(count + local9().get(2));
        }else{
            county.add(0);
        }
        return county;
    }
    public static void functionFetch() {
        try {
            ANTLRInputStream input = new ANTLRFileStream("C:\\Users\\user\\Desktop\\Lang\\src\\com\\company\\code.m");
            GLexer lexer = new GLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GParser parser = new GParser(tokens);
            parser.addParseListener(new Listener());
            parser.program();
        }catch (Exception e){
        }
    }

}
