package org.JavaCar;

class Furgoneta extends Vehicle {
    private double capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, int preuBase,
                     double capacitatCarga, String motor, Integer rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, false);
        this.capacitatCarga = capacitatCarga;
    }

    public double getCapacitatCarga() {
        return capacitatCarga;
    }

    public double calcularPreu(int dies) {
        double preuBase = getPreuBase() * dies;
        if (capacitatCarga > 1000) {
            return preuBase + (10 * dies);
        }
        return preuBase;
    }
}


