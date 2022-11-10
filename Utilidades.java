/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilidades {
    //ATRIBUTOS
    //METODOS

    public static void menuPrincipal(Productos p1){
        System.out.println("BIENVENIDO AL INVENTARIO DE LA TIENDA DEL BARRIO");
        System.out.println("1. Agregar producto\n"
                + "2. Mostrar productos\n"
                + "3. Eliminar producto\n"
                + "4. Actualizar producto\n"
                + "5. Salir");
        Utilidades.desicionAccion(p1);
        Utilidades.evaluacionDesicionAccion(p1);
    }
    
    
    public static void menuFinal(Productos p1){
        int aux;
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Que desea realizar:\n"
                + "1. Volver al menu principal\n"
                + "2. Salir");
        try{
            aux = entrada.nextInt();
            switch(aux){
                case 1: Utilidades.menuPrincipal(p1);
                break;
                case 2: Utilidades.salir();
                break;
                default: System.out.println("Opcion invalida");
            }
        }catch(InputMismatchException error){
            System.out.println("Debe digitar un numero entero");
        }
    }
    
    public static int desicionAccion(Productos p1){
        try{
            Scanner entrada = new Scanner(System.in);
            System.out.println("Que accion desea realizar: ");
            p1.setDesicionAccion(entrada.nextInt());
        }catch(InputMismatchException error){
            System.out.println("Debe digitar un numero entero");
        }
        return p1.getDesicionAccion();
    }
    
    public static void evaluacionDesicionAccion(Productos p1){
        switch(p1.getDesicionAccion()){
            case 1: agregarProducto(p1);
            break;
            case 2: mostrarProductos(p1);
            break;
            case 3: eliminarProducto(p1);
            break;
            case 4: actualizarProducto(p1);
            break;
            case 5: salir();
            break;
            default: System.out.println("Opcion invalida");
        }
    }
    
    public static void tipoProducto(){
        System.out.println("Que tipo de producto es?: \n"
                + "1. Granos\n"
                + "2. Dulceria\n"
                + "3. Aseo");
    }
    
    public static int desicionProducto(Productos p1){
        try{
            Scanner entrada = new Scanner(System.in);
            p1.setDesicionProducto(entrada.nextInt());
        }catch(InputMismatchException error){
            System.out.println("Debe digitar un numero entero");
        }
        return p1.getDesicionProducto();
    }
  
    
    public static void agregarProducto(Productos p1){
        Granos g1 = new Granos();
        Dulceria d1 = new Dulceria();
        Aseo a1 = new Aseo();
        Utilidades.tipoProducto();
        Utilidades.desicionProducto(p1);
        switch(p1.getDesicionProducto()){
            case 1: Granos.agregarProducto(g1);
            break;
            case 2: Dulceria.agregarProducto(d1);
            break;
            case 3: Aseo.agregarProducto(a1);
            break;
            default: System.out.println("opcion invalida");
        }
    }
    
    public static void eliminarProducto(Productos p1){
        Granos g1 = new Granos();
        Dulceria d1 = new Dulceria();
        Aseo a1 = new Aseo();
        Utilidades.tipoProducto();
        Utilidades.desicionProducto(p1);
        switch(p1.getDesicionProducto()){
            case 1: Granos.eliminarProducto(g1);
            break;
            case 2: Dulceria.eliminarProducto(d1);
            break;
            case 3: Aseo.eliminarProducto(a1);
            break;
            default: System.out.println("opcion invalida");
        }
    }
   
    public static void actualizarProducto(Productos p1){
        Granos g1 = new Granos();
        Dulceria d1 = new Dulceria();
        Aseo a1 = new Aseo();
        Utilidades.tipoProducto();
        Utilidades.desicionProducto(p1);
        switch(p1.getDesicionProducto()){
            case 1: Granos.actualizarProducto(g1);
            break;
            case 2: Dulceria.actualizarProducto(d1);
            break;
            case 3: Aseo.actualizarProducto(a1);
            break;
            default: System.out.println("opcion invalida");
        }
    }
    
    public static void mostrarProductos(Productos p1){
        Utilidades.tipoProducto();
        Utilidades.desicionProducto(p1);
        switch(p1.getDesicionProducto()){
            case 1: Granos.mostrarProductos(p1);
            break;
            case 2: Dulceria.mostrarProductos(p1);
            break;
            case 3: Aseo.mostrarProductos(p1);
            break;
            default: System.out.println("opcion invalida");
        }
    }
    
   
    public static void salir(){
        System.out.println("\n"+"GRACIAS POR USAR NUESTRO PROGRAMA, QUE TENGA UN EXCELENTE DIA");
    }
}
