package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class CallResult{
    public CallResult(String name, String result) {
        this.name = name;
        this.result = result;
    }

    public String name;
    public String result;

}

public class MockDisplay implements Display {
    private final List<CallResult> callResults = new ArrayList<>();
    CallResult expectation;

    @Override
    public void showLine(String line) {
        this.callResults.add(new CallResult("showLine", line));
    }

    public void setExpectation(String function, String result){
        expectation = new CallResult(function, result);
    }

    public boolean verify() {
        for(var r: callResults) {
            if(Objects.equals(r.name, expectation.name)) {
                if(Objects.equals(r.result, expectation.result)) {
                    return true;
                }
            }
        }
        return false;
    }
}
