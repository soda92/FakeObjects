package org.example;

public class Sale {
    private final Display display;

    public Sale(Display display){
        this.display = display;
    }

    public void scan(String barcode){
        String itemLine = "";
        int code = Integer.parseInt(barcode);
        if (code == 1) {
            itemLine = "Milk $3.99";
        }
        display.showLine(itemLine);
    }
}
