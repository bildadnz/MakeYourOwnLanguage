package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class TransferData {

    public TransferData(String sourcecode, String libdestination) throws Exception{
        File dir = new File(".");
        String source = dir.getCanonicalPath() + File.separator + sourcecode;
        String libdest = dir.getCanonicalPath() + File.separator + libdestination;
        List<String> play = new ArrayList<>();

        FileInputStream fiss = new FileInputStream(libdest);
        BufferedReader br = new BufferedReader(new InputStreamReader(fiss));

        File fin = new File(source);
        FileInputStream fis = new FileInputStream(fin);
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));

        String aLine = null;
        String line = "";
        String line2 = "\n";

        while( (line = br.readLine()) != null){
            play.add(line);
        }


        while ((aLine = in.readLine()) != null) {
            //Process each line and add output to Dest.txt file
            play.add(aLine);
        }
        RandomAccessFile f = new RandomAccessFile(new File("src/com/company/code.m"), "rw");
        f.getChannel().position(0);
        for(int i =0; i < play.size(); i++){
            f.write(play.get(i).getBytes());
            f.write(line2.getBytes());
        }
        // do not forget to close the buffer reader
        in.close();
        // close buffer writer
        br.close();
        f.close();
    }
}

