package org.JavaCar;

class Furgoneta extends Vehicle {
    private double capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, int preuBase,
                     double capacitatCarga, String motor, int rodes, boolean etiquetaAmbiental) {
        super(matricula, marca, model, preuBase, motor, rodes, etiquetaAmbiental);
        this.capacitatCarga = capacitatCarga;
    }
}
