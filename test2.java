interface InterfaceOne {
    void updateGear(int gear);
}

interface InterfaceTwo {
    void accelerate(int speed);
}

interface InterfaceThree {
    void pushBrake(int brake);
}

class Car implements InterfaceOne, InterfaceTwo, InterfaceThree {
    int gear;
    int speed;
    int brake;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brake) {
        this.brake = brake;
    }

    public int currentSpeed() {
        return speed - brake;
    }
}

class Truck implements InterfaceOne, InterfaceTwo, InterfaceThree {
    int gear;
    int speed;
    int brake;

    public void updateGear(int gear) {
        this.gear = gear;
    }

    public void accelerate(int speed) {
        this.speed = speed;
    }

    public void pushBrake(int brake) {
        this.brake = brake;
    }

    public int currentSpeed() {
        return speed - brake;
    }
}

class test2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.updateGear(3);
        c1.accelerate(4);
        c1.pushBrake(2);
        System.out.println("Car Gear: " + c1.gear);
        System.out.println("Car Speed: " + c1.currentSpeed());
        System.out.println("Car Brake: " + c1.brake);

        Truck t1 = new Truck();
        t1.updateGear(4);
        t1.accelerate(3);
        t1.pushBrake(1);
        System.out.println("Truck Gear: " + t1.gear);
        System.out.println("Truck Speed: " + t1.currentSpeed());
        System.out.println("Truck Brake: " + t1.brake);
    }
}