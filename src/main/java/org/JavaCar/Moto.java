package org.JavaCar;

class Moto extends Vehicle {
    private final int cilindrada;

    public Moto(String matricula, String marca, String model, int preuBase,
                int cilindrada, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, false);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public double calcularPreu(int dies) {
        double preuBase = getPreuBase() * dies;
        if (cilindrada > 500) {
            return preuBase + (5 * dies);
        }
        return preuBase;
    }
}

