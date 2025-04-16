//import java.util.Scanner;

import controllers.MetodoBusqueda;
import models.Persona;

public class App {

    public static void main(String[] args) throws Exception {
        /* 
        Scanner scanner = new Scanner(System.in);

        //solicita el tamaño del arreglo
        System.out.println(" Ingrese el tamaño de la lista: ");
        int tamanoLista = scanner.nextInt();

        int [] numeros = new int[tamanoLista];


        System.out.println(" Ingrese los elementos de la lista: ");
        for(int i = 0; i < tamanoLista;i++){
            System.out.println(" Elemento "+(i+1)+":");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el numero que busca: ");
        int elementoBuscado = scanner.nextInt();


        int resultado = BusquedaLineal.buscarLineal(numeros,elementoBuscado);


        if(resultado !=-1){
            System.out.println(" El elemento " + elementoBuscado + " se encuentra en la posicion " + resultado);
        } else {
            System.out.println(" El elemento " + elementoBuscado + " no se encuentra en la lista ");
        }
        */

        Persona[] personas = new Persona[7];
        personas[0]=new Persona(101,"Juan");
        personas[1]=new Persona(107,"Maria");
        personas[2]=new Persona(103,"Carlos");
        personas[3]=new Persona(104,"Ana");
        personas[4]=new Persona(105,"Luis");
        personas[5]=new Persona(106,"Sofia");
        personas[6]=new Persona(107,"Pedro");
        

        MetodoBusqueda mB = new MetodoBusqueda(personas);
        


    }
}
