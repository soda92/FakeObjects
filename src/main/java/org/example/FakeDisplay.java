package org.example;

public class FakeDisplay implements Display {
    private String lastLine = "";
    @Override
    public void showLine(String line) {
        lastLine = line;
    }

    public String getLastLine() {
        return lastLine;
    }
}
