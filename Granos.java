/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Granos extends Productos{
    //ATRIBUTOS
    
    //METODOS

    public Granos(int id, String nombre, int cantidad) {//CONSTRUCTOR
        super(id, nombre, cantidad);
    }

    public Granos() {
    }
    

    public static void agregarProducto(Granos g1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Id del producto: ");
        g1.setId(entrada.nextInt());
        System.out.println("Nombre del producto: ");
        g1.setNombre(entrada.next());
        System.out.println("Cantidad: ");
        g1.setCantidad(entrada.nextInt());
        listaGranosExistentes.add(g1);
        Collections.sort(listaGranosExistentes);
        Granos.mostrarProductos(g1);
    }
    
    public static void eliminarProducto(Granos g1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Id del producto que desea eliminar: ");
        g1.setId(entrada.nextInt());
        boolean busqueda = false;
        for(int i=0; i<listaGranosExistentes.size(); i++){
            if(listaGranosExistentes.get(i).getId()==g1.getId()){
                listaGranosExistentes.remove(i);
                System.out.println("\n"+"SE ELIMINO EXITOSAMENTE EL ID"+" "+g1.getId());
                busqueda = true;
                break;
            }
        }
        if(busqueda==false){
            System.out.println("\n"+"Lo sentimos, no se pudo encontrar el Id" +" "+ g1.getId());
        }
        Collections.sort(listaGranosExistentes);
        Granos.mostrarProductos(g1);
    }
    
    public static void actualizarProducto(Granos g1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Id del producto que quiere actualizar");
        g1.setId(entrada.nextInt());
        boolean busqueda = false;
        for(int i=0; i<listaGranosExistentes.size(); i++){
            if(listaGranosExistentes.get(i).getId()==g1.getId()){
                System.out.println("\n"+"Introduzca la nueva cantidad en Kilos: ");
                g1.setCantidad(entrada.nextInt());
                listaGranosExistentes.get(i).setCantidad(g1.getCantidad());
                System.out.println("\n"+"SE ACTUALIZO EXITOSAMENTE EL ID"+" "+g1.getId());
                busqueda = true;
                break;
            }
        }
        if(busqueda==false){
            System.out.println("\n"+"Lo sentimos, no se pudo encontrar el Id"+" "+g1.getId());
        }
        Collections.sort(listaGranosExistentes);
        Granos.mostrarProductos(g1);
    }
    
    static ArrayList<Granos> listaGranosExistentes = new ArrayList<Granos>();
    public static void crearListaProductos(){
        Granos g1 = new Granos(1,"Frijoles",10);
        Granos g2 = new Granos(2,"Garbanzos",5);
        Granos g3 = new Granos(3,"Arvejas",50);
        Granos g4 = new Granos(4,"Lentejas",2);
        Granos g5 = new Granos(5,"Quinua",15);
        Granos g6 = new Granos(6,"Cereal",100);
        //AÑADIR OBJETOS A MI ARRAYLIST
        listaGranosExistentes.add(g1);
        listaGranosExistentes.add(g2);
        listaGranosExistentes.add(g3);
        listaGranosExistentes.add(g4);
        listaGranosExistentes.add(g5);
        listaGranosExistentes.add(g6);
    }
    
    public static void mostrarProductos(Productos p1){
        System.out.println("\n"+"ESTOS SON LOS PRODUCTOS EXISTENTES EN LA CATEGORIA 'GRANOS'"+"\n");
        System.out.println("ID"+" | "+"NOMBRE"+" | "+"CANTIDAD EN KG");
        for(int i=0; i<listaGranosExistentes.size(); i++){
            System.out.println(listaGranosExistentes.get(i).getId()+" "+listaGranosExistentes.get(i).getNombre()+" "+listaGranosExistentes.get(i).getCantidad());
        }
        Utilidades.menuFinal(p1);
    }

}
