package org.JavaCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicles = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            System.out.println("\n==== MENÚ DE GESTIÓ DE VEHICLES ====");
            System.out.println("1. Afegir vehicle");
            System.out.println("2. Mostrar informació de tots els vehicles");
            System.out.println("3. Calcular preu de lloguer per dies");
            System.out.println("4. Calcular ingressos totals");
            System.out.println("5. Sortir");
            System.out.print("Selecciona una opció: ");

            int opcio = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcio) {
                case 1:
                    System.out.println("\nQuin tipus de vehicle vols afegir?");
                    System.out.println("1. Cotxe");
                    System.out.println("2. Moto");
                    System.out.println("3. Furgoneta");
                    System.out.print("Selecciona una opció: ");
                    int tipus = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Introdueix la matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();
                    System.out.print("Model: ");
                    String model = scanner.nextLine();
                    System.out.print("Preu base: ");
                    int preuBase = scanner.nextInt();

                    if (tipus == 1) {
                        System.out.print("Nombre de places: ");
                        int places = scanner.nextInt();
                        vehicles.add(new Cotxe(matricula, marca, model, preuBase, places, null, null));
                        System.out.println("Cotxe afegit correctament!");
                    } else if (tipus == 2) {
                        System.out.print("Cilindrada: ");
                        int cilindrada = scanner.nextInt();
                        vehicles.add(new Moto(matricula, marca, model, preuBase, cilindrada, null, null));
                        System.out.println("Moto afegida correctament!");
                    } else if (tipus == 3) {
                        System.out.print("Capacitat de càrrega (kg): ");
                        double capacitatCarga = scanner.nextDouble();
                        vehicles.add(new Furgoneta(matricula, marca, model, preuBase, capacitatCarga, null, null));
                        System.out.println("Furgoneta afegida correctament!");
                    } else {
                        System.out.println("Opció no vàlida.");
                    }
                    break;

                case 2:
                    if (vehicles.isEmpty()) {
                        System.out.println("\nNo hi ha vehicles registrats.");
                    } else {
                        System.out.println("\n==== INFORMACIÓ DE VEHICLES ====");
                        for (Vehicle v : vehicles) {
                            System.out.println(v.getClass().getSimpleName() + " - Matrícula: " + v.getMatricula() +
                                    ", Marca: " + v.getMarca() +
                                    ", Model: " + v.getModel() +
                                    ", Preu Base: " + v.getPreuBase());
                        }
                    }
                    break;

                case 3:
                    if (vehicles.isEmpty()) {
                        System.out.println("\nNo hi ha vehicles registrats.");
                    } else {
                        System.out.print("\nIntrodueix el nombre de dies: ");
                        int dies = scanner.nextInt();
                        System.out.println("\n==== CÀLCUL DE PREUS ====");
                        for (Vehicle v : vehicles) {
                            System.out.println(v.getClass().getSimpleName() + " (" + v.getMatricula() + ") - Preu per " + dies + " dies: " + v.calcularPreu(dies));
                        }
                    }
                    break;

                case 4:
                    if (vehicles.isEmpty()) {
                        System.out.println("\nNo hi ha vehicles registrats.");
                    } else {
                        System.out.print("\nIntrodueix el nombre de dies: ");
                        int dies = scanner.nextInt();
                        double ingressosTotals = GestorLloguers.calcularIngressosTotals(vehicles, dies);
                        System.out.println("Ingressos totals per " + dies + " dies: " + ingressosTotals);
                    }
                    break;

                case 5:
                    System.out.println("\nSaliendo del programa. Fins aviat!");
                    salir = true;
                    break;

                default:
                    System.out.println("\nOpció no vàlida. Torna-ho a intentar.");
            }
        }

        scanner.close();
    }
}

