package edu.dmacc.codedsm.hw181;

public class ConsoleInputView implements InputView {

    private Result result;

    public ConsoleInputView(Result result){
        this.result = result;
    }
    public void render(){
        System.out.println("result = " + result);
    }
    }