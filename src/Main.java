import java.util.Scanner;

public class Main {
    static Scanner entrada= new Scanner(System.in);

    public static void main(String[] args){
        int opcion;
        do {
            System.out.println("\n_______________________________________________");
            System.out.println("| Calculadora de areas de figuras geometricas |");
            System.out.println("| 1.- Triangulo                               |");
            System.out.println("| 2.- Cuadrado                                |");
            System.out.println("| 3.- Circulo                                 |");
            System.out.println("| 4.- Salir                                   |");
            System.out.println("-----------------------------------------------");
            System.out.print(">> Ingrese una opcion: ");
            opcion=entrada.nextInt();
            switch (opcion) {
                case 1:
                    triangulo();
                    break;
                case 2:
                    cuadrado();
                    break;
                case 3:
                    circulo();
                    break;
                case 4:
                    break;
                default:
                    System.out.println(">> ¡Error! ingrese una opcion valida.");
            }
        } while (opcion!=4);
        System.out.println("Saliendo del programa . . .");
        System.out.print(">> FIN DEL PROGRAMA <<");
    }

    // Función para calcular el área de un triángulo
    static void triangulo(){
        // Desarrollar algoritmo y aplicar metodo para redondear a dos cifras los resultados.
        // Responsable: Erick Nuñez
        System.out.println("\n----Area del triangulo----");
        System.out.print(" Ingrese el valor de la base en cm: ");
        float base=entrada.nextFloat();
        System.out.print(" Ingrese el valor de la altura en cm: ");
        float altura=entrada.nextFloat();
        float area_triangulo=(base*altura)/2;
        System.out.print(">>El area del triangulo es: "+area_triangulo+"\n");
    }
    //Agregadas las funciones de calculo del area de un cuadrado y un circulo.
    // Función para calcular el área de un cuadrado
    static void cuadrado(){
        System.out.println("----Area del cuadrado----");
        System.out.print(" Ingrese el valor de la longitud cm: ");
        float longitud=entrada.nextInt();
        float area_cuadrado=longitud*longitud;
        System.out.print(">>El area del cuadrado es: "+area_cuadrado+"\n");
    }
    // Función para calcular el área de un círculo
    static void circulo(){
        System.out.println("----Area del circulo----");
        System.out.print(" Ingrese el valor del radio en cm: ");
        float radio=entrada.nextInt();
        double area_circulo=(radio*radio)*3.1416;
        System.out.print(">>El area del circulo es: "+area_circulo+"\n");
    }
}