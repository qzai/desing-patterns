package com.mmosiej.desingpatterns.facade;

import com.mmosiej.desingpatterns.facade.service.BrakeService;
import com.mmosiej.desingpatterns.facade.service.BreakPad;
import com.mmosiej.desingpatterns.facade.service.EngineService;
import com.mmosiej.desingpatterns.facade.service.WheelService;

public class CarClient {

    public static void main(String[] args) {
        EngineService engineService = new EngineService();
        BrakeService brakeService = new BrakeService(new BreakPad());
        WheelService wheelService = new WheelService();

        engineService.start();
        engineService.accelerate();
        wheelService.turnLeft();
        brakeService.brake();
        engineService.stop();
    }
}
