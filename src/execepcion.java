import java.util.*;
public class execepcion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        try {
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de " + num + " es " + cuadrado);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número entero.");
        }
    }
}
