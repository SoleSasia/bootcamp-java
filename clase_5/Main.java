package clase_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        calcularIndiceMasaCorporal();
    }

    public static void calcularIndiceMasaCorporal() {
        Scanner cargaDeDatos = new Scanner(System.in);  // Create a Scanner object

        //calcular imc: peso Kg / (h mt)2
        System.out.print("Ingresa tu peso en kg: ");
        double peso = cargaDeDatos.nextDouble();  // Read user input
        System.out.print("Ingresa tu altura metros: ");
        double altura = cargaDeDatos.nextDouble();

        double indiceMasaCorporal = peso / (altura * altura);
        System.out.println("Tu indice de masa corporal es: " + indiceMasaCorporal);
        if (indiceMasaCorporal < 18.5) {
            System.out.println("DELGADEZ: Estas por debajo de lo establecido como normal");
        } else if (indiceMasaCorporal >= 18.5 && indiceMasaCorporal < 25) {
            System.out.println("NORMALIDAD: Estas dentro de lo establecido como normal");
        } else if (indiceMasaCorporal >= 25 && indiceMasaCorporal < 30) {
            System.out.println("SOBREPESO: Estas por encima de lo establecido como normal");
        } else if (indiceMasaCorporal >= 30) {
            System.out.println("OBESIDAD: Estas muy por encima de lo establecido como normal");
        }
    }
}
