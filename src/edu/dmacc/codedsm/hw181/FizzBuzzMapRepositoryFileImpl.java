package edu.dmacc.codedsm.hw181;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMapRepositoryFileImpl implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();

    public void save(Result result){
        storage.put(1, result);
        writeUsingFileWriter(result.toString());
    }
    private static void writeUsingFileWriter(String data) {
        File file = new File("/development/Homework181/fizzbuzz_result.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
                       try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
