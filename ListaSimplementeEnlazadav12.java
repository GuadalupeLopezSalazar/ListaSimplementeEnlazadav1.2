
package listasimplementeenlazadav12;
/**
 * @Guadalupe Lopez Salazar
 */
import java.util.Scanner;      /*Libreria de introduccion de datos*/
public class ListaSimplementeEnlazadav12 {
Scanner sc = new Scanner (System.in);    /*Permite ingresar datos por teclado*/
    static class Nodo {  /**/
        String Nombre; /*Declaracion de variable de tipo cadena*/
        Nodo Sig;   /*Declaracion de variable de tipo nodo*/
    }
    Nodo inicio = null;  /*Declaracion de variable llamada inicio y top de tipo nodo y sus valores son nulos*/
    Nodo tp = null;
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);    /*Permite ingresar datos por teclado*/
        ListaSimplementeEnlazadav12 nodo = new ListaSimplementeEnlazadav12();
        int Opt;      /*Declaracion de variable entera*/
        do {     /*Utilizamos un bucle do para el menu*/
            System.out.println("ESCOJA LA OPCION QUE QUIERA REALIZAR:\n"
                    + "1 - AGREGAR NODO\n"
                    + "2 - MOSTRAR LISTA\n"
                    + "3 - ELIMINAR NODO\n"          /*Opciones a elegir por el  usuario*/
                    + "4 - SALIR\n");
            switch (Opt = sc.nextInt()) {
                case 1: /*Se agrega un nodo*/
                nodo.agregar();  /*Llamamos el metodo agregar*/
                break; /*Se termina el primer caso*/
                case 2: /*Se elimina un nodo*/
                nodo.mostrar(); /*Llamamos el metodo mostrar*/
                break; /*Se termina el segundo caso*/
                case 3: /*Se muestra la lista*/
                nodo.eliminar(); /*Llamamos el metodo eliminar*/
                break; /*Se termina el tercer caso*/
    }
        }while (Opt != 4);   /*Salir*/
    }
    
public void agregar() {     /*Caso 1*/
        if (tp == null) {  /*Condicion a cumplir*/
            tp = new Nodo();   /*Se asigna a la variable tp los atributos de la clase nodo*/
            System.out.print("\n" + "INGRESE EL NODO: ");   /*Solicitud de dato para el usuario*/
            tp.Nombre = sc.nextLine();   /*Se asigna la informacion del usuario*/
        } else {
            Nodo temp = new Nodo();     /*Se asigna a la variable temp los atributos de la clase nodo*/
            System.out.print("\n" + "INGRESE EL NODO: ");   /*Solicitud de dato para el usuario*/
            temp.Nombre = sc.nextLine();    /*Se asigna la informacion del usuario*/
            temp.Sig = tp; 
            tp = temp; 
        }
    }

    public void mostrar() {     /*Caso 2*/
        Nodo temp = new Nodo();
        temp = tp; 
        if (tp != null) {     /*Condicion a cumplir*/
            System.out.println("");
            while (temp != null) {    /*Condicion a cumplir*/
                System.out.println(temp.Nombre+ " "); /*Mensaje a mostrar*/
                temp = temp.Sig;
            }
            
        } else {
            System.out.println( "LISTA VACIA"); /*Mensaje a mostrar*/
        }
    }
    
    public void eliminar() {   /*Caso 3*/
        Nodo temp = tp;
        if (tp != null) {     /*Condicion a cumplir*/
            System.out.print("EL NODO "+ temp.Nombre+ " FUE ELIMINADO\n"); /*Mensaje a mostrar*/
            tp = tp.Sig; 
        } else {     /*Si no*/
            System.out.println("LISTA VACIA");    /*Mensaje a mostrar*/
        }
    }
    
}
