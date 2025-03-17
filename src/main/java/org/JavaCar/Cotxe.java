package org.JavaCar;

public class Cotxe extends Vehicle {
    private int nombrePlaces;

    public Cotxe(String matricula, String marca, String modelo, int preuBase, String motor,
                 int rodes, boolean etiquetaAmbiental, int nombrePlaces) {
        super(matricula, marca, modelo, preuBase, motor, rodes, etiquetaAmbiental);
        this.nombrePlaces = nombrePlaces;
    }
}
