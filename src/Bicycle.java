class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newCadence) {
        cadence = newCadence;
    }

    void changeGear(int newGear) {
        gear = newGear;
    }

    void speedUp(int increment) {
        speed+=increment;
    }

    void slowDown(int decrement) {
        speed-=decrement;
    }

    void printStates() {
        System.out.println("cadence: " + cadence + "\ngear: " + gear + "\nspeed: " + speed);
    }
}
