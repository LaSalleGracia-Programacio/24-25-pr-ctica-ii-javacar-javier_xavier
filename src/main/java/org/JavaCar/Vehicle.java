package org.JavaCar;

abstract class Vehicle implements LlogableGestor {
    protected String matricula;
    protected String marca;
    protected String model;
    private int preuBase;
    private Motor motor;
    private Roda[] rodes;
    private String etiquetaAmbiental;

    public Vehicle(String matricula, String marca, String model, int preuBase, Motor motor, Roda[] rodes, boolean dummy) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.etiquetaAmbiental = EtiquetaAmbientalCalculador.calcularEtiqueta(this);
    }

    public String getMatricula() { return matricula; }
    public String getMarca() { return marca; }
    public String getModel() { return model; }
    public int getPreuBase() { return preuBase; }
    public Motor getMotor() { return motor; }
    public Roda[] getRodes() { return rodes; }
    public String getEtiquetaAmbiental() { return etiquetaAmbiental; }

    public void setMotor(Motor motor) {
        this.motor = motor;
        this.etiquetaAmbiental = EtiquetaAmbientalCalculador.calcularEtiqueta(this);
    }

    @Override
    public double calcularPreu(int dies) {
        return preuBase * dies;
    }

    public class EtiquetaAmbientalCalculador {

        public static String calcularEtiqueta(Vehicle v) {
            if (v.getMotor() == null) return "Sense etiqueta";

            String tipus = v.getMotor().getTipus().toLowerCase();
            int potencia = v.getMotor().getPotencia();

            if (tipus.contains("electric")) {
                return "Zero emissions";
            }

            if (tipus.contains("híbrid") || tipus.contains("gas")) {
                return "Eco";
            }

            if ((tipus.contains("gasolina") && potencia >= 90) || (tipus.contains("diesel") && potencia >= 100)) {
                return "C";
            }

            if (tipus.contains("gasolina") || tipus.contains("diesel")) {
                return "B";
            }

            return "Sense etiqueta";
        }
    }

}
