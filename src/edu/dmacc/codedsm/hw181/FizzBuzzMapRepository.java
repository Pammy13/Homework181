package edu.dmacc.codedsm.hw181;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzzMapRepository implements MapRepository {

    private Map<Integer, Result> storage = new HashMap<>();

    public void save(Result result){
        storage.put(1, result);
    }
}
