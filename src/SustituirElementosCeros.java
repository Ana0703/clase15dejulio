// Se ingresa una lista de números enteros mayores que 0, se pueden tener elementos duplicados. 
//Este método debe sustituir cada valor repetido por 0. Para terminar, realiza un método que muestre el array modificado. 
//Recuerde que para llenar la lista. Le irá pidiendo números al usuario hasta que este introduzca un número negativo.


import java.util.*;

public class SustituirElementosCeros {

    public static void solicitarNumeros(ArrayList <Integer> listaNumeros) {
        
        Integer numero;
        boolean contador = true;
        String salir = "Si";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que Lista de numeros Enteros");
        
        do {
            if (contador == true) {
                System.out.println("Ingrese el numero mayor que 0 ");
                numero = sc.nextInt();
                if (numero <=0) {
                    System.out.println("Numero no correcto");
                }
                else{
                    listaNumeros.add(numero);
                    contador = false;
                }
            }

            System.out.println("Introduce el siguiente numero: ");
            numero = sc.nextInt();
        
            if (numero <=0) {
                System.out.println("El numero no correcto");
            }else{
                listaNumeros.add(numero);
                contador = false;
            }
        
            System.out.println("Va a ingresar mas numeros escribe: \"Si\"");
            salir = sc.next();
        } while (salir.equalsIgnoreCase("Si"));
        sc.close();
        
    }
    
    public static void cambiarACeros(ArrayList <Integer> listaNumeros) {
        ArrayList listaCopia = (ArrayList) listaNumeros.clone();
        for (int i = 0; i < listaNumeros.size(); i++) {
            for (int j = 0; j < listaCopia.size(); j++) {
                if ((i != j) && (listaNumeros.get(i) == listaCopia.get(j))) {
                    listaNumeros.set(i, 0);
                    listaNumeros.set(j, 0);
                }
            }
        }
        
    }

    public static void mostrarListas(ArrayList <Integer> listaNumeros) {
        System.out.println(" Lista de numeros   ");
        for (int i = 0; i < listaNumeros.size(); i++) {
            System.out.print(" " + listaNumeros.get(i) + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        ArrayList <Integer> listaNumeros = new ArrayList <> ();
        solicitarNumeros(listaNumeros);
        mostrarListas(listaNumeros);
        cambiarACeros(listaNumeros);
        mostrarListas(listaNumeros);
    }
}
