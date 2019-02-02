package com.mmosiej.desingpatterns.facade;

import com.mmosiej.desingpatterns.facade.service.BrakeService;
import com.mmosiej.desingpatterns.facade.service.BreakPad;
import com.mmosiej.desingpatterns.facade.service.EngineService;
import com.mmosiej.desingpatterns.facade.service.WheelService;

public class CarFacade {

    private EngineService engineService;

    private WheelService wheelService;

    private BrakeService brakeService;

    public CarFacade() {
        engineService = new EngineService();
        wheelService = new WheelService();
        brakeService = new BrakeService(new BreakPad());
    }

    public void startEngine() {
        engineService.start();
    }

    public void stopEngine() {
        engineService.stop();
    }

    public void accelerate() {
        engineService.accelerate();
    }

    public void turnRight() {
        wheelService.turnRight();
    }

    public void turnLeft() {
        wheelService.turnLeft();
    }

    public void brake() {
        brakeService.brake();
    }

    public void drift() {
        startEngine();
        accelerate();
        turnLeft();
        brake();
        accelerate();
        turnRight();
    }

}
