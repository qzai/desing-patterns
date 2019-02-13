package com.mmosiej.desingpatterns.facade;

public class CarFacadeClient {

    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();

        carFacade.startEngine();
        carFacade.accelerate();
        carFacade.turnLeft();
        carFacade.brake();
        carFacade.stopEngine();
    }
}
