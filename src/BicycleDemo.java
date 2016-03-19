class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(34);
        bike2.changeCadence(36);

        bike1.changeGear(2);
        bike2.changeGear(2);

        bike1.speedUp(12);
        bike2.speedUp(11);

        bike1.printStates();
        bike2.printStates();

    }
}