import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nombre = leerNombre(sc);
        int edad = leerEdad(sc);
        boolean esMayor = esMayorA18(edad);
        imprimirRespuesta(esMayor, nombre);
    }

    public static String leerNombre(Scanner lector) {
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();
        return nombre;
    }

    public static int leerEdad(Scanner scan) {
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        return edad;
    }

    public static boolean esMayorA18(int edad) {
        return edad >= 18;
    }

    public static void imprimirRespuesta(boolean condicionEdad, String nombre){
        if(condicionEdad){
            System.out.print("Bienvenido "+ nombre + " registro permitido");
        }else{
            System.out.print("Ingreso no permitido");
        }

    }
}
