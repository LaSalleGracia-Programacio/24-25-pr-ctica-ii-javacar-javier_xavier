package org.JavaCar;

import java.util.List;

interface LlogableGestor {
    double calcularPreu(int dies);
}

class GestorLloguers {
    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double total = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof LlogableGestor) {
                total += ((LlogableGestor) vehicle).calcularPreu(dies);
            }
        }
        return total;
    }
}

