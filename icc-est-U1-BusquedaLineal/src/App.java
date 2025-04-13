import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //solicita el tamaño del arreglo
        System.out.println("Ingrese el tam de la lista: ");
        int tamanoLista = scanner.nextInt();

        int [] numeros = new int[tamanoLista];


        System.out.println("Ingrese los elementos de la lista: ");
        for(int i = 0; i < tamanoLista;i++){
            System.out.println("Elemento"+(i+1)+":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el numero que busca: ");
        int elementoBuscado = scanner.nextInt();


        int resultado = BusquedaLineal.buscarLineal(numeros,elementoBuscado);


        if(resultado !=-1){
            System.out.println("El elemento " + elementoBuscado + "se encuntra en la posicion" + resultado);
        } else {
            System.out.println("El elemento " + elementoBuscado + "no se encontro en la lista");
        }
    }
}
