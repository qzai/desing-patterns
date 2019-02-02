package com.mmosiej.desingpatterns.facade.service;


public class BrakeService {

    private BreakPad breakPad;

    public BrakeService(BreakPad breakPad) {
        this.breakPad = breakPad;
    }

    public void brake() {
    }
}
