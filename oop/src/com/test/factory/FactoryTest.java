package com.test.factory;

/**
 * ClassName: FactoryTest
 * Package: com.test.factory
 * Description: 工厂模式
 *
 * @Author: Steven_LIU
 * @Create: 11/01/2023
 */
public class FactoryTest {
    public static void main(String[] args) {
        Vehicle audi = new AudiFactory().getVehicle();
        Vehicle byd = new BYDFactory().getVehicle();
        audi.run();
        byd.run();
    }
}

interface Vehicle{
    void run();
}

class Audi implements Vehicle{

    @Override
    public void run() {
        System.out.println("奥迪跑得很快。");
    }
}

class BYD implements Vehicle{
    @Override
    public void run() {
        System.out.println("比亚迪跑得也不慢。");
    }
}

interface VehicleFactory{
    Vehicle getVehicle();
}

class AudiFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle() {
        return new Audi();
    }
}

class BYDFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle() {
        return new BYD();
    }
}
