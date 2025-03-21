package org.JavaCar;

abstract class Vehicle implements LlogableGestor {
    protected String matricula;
    protected String marca;
    protected String model;
    private int preuBase;
    private Motor motor;
    private Roda[] rodes;
    private boolean etiquetaAmbiental;

    public Vehicle(String matricula, String marca, String model, int preuBase, Motor motor, Roda[] rodes, boolean etiquetaAmbiental) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.etiquetaAmbiental = etiquetaAmbiental;
    }

    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public String getModel() {
        return model;
    }
    public int getPreuBase() {
        return preuBase;
    }
    public Motor getMotor() {
        return motor;
    }
    public Roda[] getRodes() {
        return rodes;
    }

    @Override
    public double calcularPreu(int dies) {
        return preuBase * dies;
    }
}

