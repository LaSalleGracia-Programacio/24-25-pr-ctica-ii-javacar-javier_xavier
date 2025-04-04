package org.JavaCar;

import java.util.List;
import java.util.ArrayList;

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
    public static List<Vehicle> filtrarPerPreu(List<Vehicle> vehicles, double preuMax) {
        List<Vehicle> resultat = new ArrayList<>();
        for (Vehicle v : vehicles) {
            if (v.getPreuBase() <= preuMax) {
                resultat.add(v);
            }
        }
        return resultat;
    }

}



