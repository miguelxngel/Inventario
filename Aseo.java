/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aseo extends Productos{
    //ATRIBUTOS
    
    
    //METODOS
    
    public Aseo(int id, String nombre, int cantidad){//CONSTRUCTOR
        super(id, nombre, cantidad);
    }

    public Aseo() {
    }

    public static void agregarProducto(Aseo a1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Id del producto: ");
        a1.setId(entrada.nextInt());
        System.out.println("Nombre del producto: ");
        a1.setNombre(entrada.next());
        System.out.println("Cantidad: ");
        a1.setCantidad(entrada.nextInt());
        listaAseoExistentes.add(a1);
        Collections.sort(listaAseoExistentes);
        Aseo.mostrarProductos(a1);
    }
    
    public static void eliminarProducto(Aseo a1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Id del producto que desea eliminar: ");
        a1.setId(entrada.nextInt());
        boolean busqueda = false;
        for(int i=0; i<listaAseoExistentes.size(); i++){
            if(listaAseoExistentes.get(i).getId()==a1.getId()){
                listaAseoExistentes.remove(i);
                System.out.println("\n"+"SE ELIMINO EXITOSAMENTE EL ID"+" "+a1.getId());
                busqueda=true;
                break;
            }
        }
        if(busqueda==false){
            System.out.println("\n"+"Lo sentimos, no se pudo encontrar el Id"+" "+a1.getId());
        }
        Collections.sort(listaAseoExistentes);
        Aseo.mostrarProductos(a1);
    }
    
    public static void actualizarProducto(Aseo a1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Id del producto que quiere actualizar: ");
        a1.setId(entrada.nextInt());
        boolean busqueda=false;
        for(int i=0; i<listaAseoExistentes.size(); i++){
            if(listaAseoExistentes.get(i).getId()==a1.getId()){
                System.out.println("\n"+"Introduzca la nueva cantidad en Kilos: ");
                a1.setCantidad(entrada.nextInt());
                listaAseoExistentes.get(i).setCantidad(a1.getCantidad());
                System.out.println("\n"+"SE ACTUALIZO EXITOSAMENTE EL ID"+" "+a1.getId());
                busqueda = true;
                break;
            }
        }
        if(busqueda==false){
            System.out.println("\n"+"Lo sentimos, no se pudo encontrar el Id"+" "+a1.getId());
        }
        Collections.sort(listaAseoExistentes);
        Aseo.mostrarProductos(a1);
    }
    
    static ArrayList<Aseo> listaAseoExistentes = new ArrayList<Aseo>();
    public static void creacionLista(){
        Aseo a1 = new Aseo(26, "Papel higienico", 60);
        Aseo a2 = new Aseo(27, "Toallas", 10);
        Aseo a3 = new Aseo(30,"Jabon de manos",6);
        Aseo a4 = new Aseo(31, "Jabon corporal", 150);
        Aseo a5 = new Aseo(32, "Shampoo", 236);
        Aseo a6 = new Aseo(33, "Acondicionador", 58);
        Aseo a7 = new Aseo(35, "Suavitel", 23);
        Aseo a8 = new Aseo(40, "Crema dental", 47);
        
        listaAseoExistentes.add(a1);
        listaAseoExistentes.add(a2);
        listaAseoExistentes.add(a3);
        listaAseoExistentes.add(a4);
        listaAseoExistentes.add(a5);
        listaAseoExistentes.add(a6);
        listaAseoExistentes.add(a7);
        listaAseoExistentes.add(a8);
    }
    
    
    public static void mostrarProductos(Productos p1){
        System.out.println("\n"+"ESTOS SON LOS PRODUCTOS EXISTENTES EN LA CATEGORIA 'ASEO'"+"\n");
        System.out.println("ID"+" | "+"NOMBRE"+" | "+"CANTIDAD EN KG");
        for(int i=0; i<listaAseoExistentes.size(); i++){
            System.out.println(listaAseoExistentes.get(i).getId()+" "+listaAseoExistentes.get(i).getNombre()+" "+listaAseoExistentes.get(i).getCantidad());
        }
        Utilidades.menuFinal(p1);
    }
}
