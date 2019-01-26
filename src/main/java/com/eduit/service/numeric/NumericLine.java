package com.eduit.service.numeric;

public class NumericLine {

    private int init;
    private int end;

    public NumericLine(int init, int end) {
        this.init = init;
        this.end = end;
    }


    public int getInit() {
        return init;
    }

    public boolean isInLine(Meter m){
        return m.getQuantity() >= init && m.getQuantity() <= end;
    }
}
