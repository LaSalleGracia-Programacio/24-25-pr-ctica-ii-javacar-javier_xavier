package org.JavaCar;

class Cotxe extends Vehicle {
    private int nombrePlaces;

    public Cotxe(String matricula, String marca, String model, int preuBase, int nombrePlaces,
                 Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, false);
        this.nombrePlaces = nombrePlaces;
    }

    public int getNombrePlaces() {
        return nombrePlaces;
    }
}