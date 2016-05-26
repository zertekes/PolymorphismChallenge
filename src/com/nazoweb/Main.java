package com.nazoweb;

class Cars {

    private  String name;
    private int cylinders;
    private int currentVelocity;

    private boolean Engine;
    private int Wheels;

    public Cars(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.Engine = true;
        this.Wheels = 4;
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public boolean isEngine() {
        return Engine;
    }

    public int getWheels() {
        return Wheels;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public void startEngine(boolean engineRunning) {
        if (engineRunning == true) {
            System.out.println("startEngine(): Engine is running.");

        } else {
            System.out.println("startEngine(): Starting engine.");
        }
    }

    public void accelerateCar(int velocity) {
        System.out.println("accelerateCar(): Car accelerates from: "+ currentVelocity+ " km/h");
        this.currentVelocity+= velocity ;
        System.out.println("accelerateeCar(): to: " + currentVelocity+ " km/h");

    }

    public void brakeCar(int velocityBrake) {
        System.out.println("brakeCar(): Car brakes from: "+ currentVelocity+ " km/h");
        this.currentVelocity-= velocityBrake ;
        System.out.println("brakeCarCar(): to: " + currentVelocity+ " km/h");
    }

    public void stopEngine() {
        if (currentVelocity == 0) {
            System.out.println("stopEngine(): Engine stopped.");
        } else {
            System.out.println("stopEngine(): You can not stop the Engine while the car moving.");
        }
    }
}

class Prius extends Cars {
    public Prius() {
        super("Prius", 4);
    }

    @Override
    public void setCurrentVelocity(int currentVelocity) {
        super.setCurrentVelocity(currentVelocity);
    }
}

class Impreza extends Cars {
    public Impreza() {
        super("Impreza", 4);
    }

    @Override
    public int getCurrentVelocity() {
        return 100;
    }
}

class Outlander extends Cars {
    public Outlander() {
        super("Outlander", 6);
    }

    @Override
    public int getCurrentVelocity() {
        return 50;
    }
}


public class Main {

    public static void main(String[] args) {

        Cars car1 = new Cars("Porsche", 6);

//        car1.startEngine(false);
//        car1.accelerateCar(20);
//        car1.accelerateCar(20);
//        car1.brakeCar(40);
//        car1.stopEngine();

        Prius prius = new Prius();

//        prius.accelerateCar(10);
//        System.out.println(prius.getCurrentVelocity());

        Impreza impreza = new Impreza();
        impreza.accelerateCar(100);
        impreza.stopEngine();
        impreza.brakeCar(100);
        impreza.stopEngine();

//        prius.accelerateCar(15);
    }


    class Focus extends Cars {
        public Focus() {
            super("Focus", 4);
        }

        @Override
        public void setCurrentVelocity(int currentVelocity) {
            super.setCurrentVelocity(currentVelocity);
        }
    }
}
