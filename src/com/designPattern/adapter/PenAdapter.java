package com.designPattern.adapter;

public class PenAdapter implements Pen {

    PilotPen pen = new PilotPen();

    @Override
    public void write(String str) {
        pen.mark(str);
    }
}
