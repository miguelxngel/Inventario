/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dulceria extends Productos{
    //ATRIBUTOS
 
    //METODOS

    public Dulceria(int id, String nombre, int cantidad) {
        super(id, nombre, cantidad);
    }

    public Dulceria() {
    }
    
    public static void agregarProducto(Dulceria d1) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Id del producto: ");
        d1.setId(entrada.nextInt());
        System.out.println("Nombre del producto: ");
        d1.setNombre(entrada.next());
        System.out.println("Cantidad: ");
        d1.setCantidad(entrada.nextInt());
        listaDulcesExistentes.add(d1);
        Collections.sort(listaDulcesExistentes);
        Dulceria.mostrarProductos(d1);
    }
    
    public static void eliminarProducto(Dulceria d1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Id del producto que desea eliminar: ");
        d1.setId(entrada.nextInt());
        boolean busqueda = false;
        for(int i=0; i<listaDulcesExistentes.size(); i++){
            if(listaDulcesExistentes.get(i).getId()==d1.getId()){
                listaDulcesExistentes.remove(i);
                System.out.println("\n"+"SE ELIMINO EXISTOSAMENTE EL ID"+" "+d1.getId());
                busqueda=true;
                break;
            }
        }
        if(busqueda==false){
            System.out.println("\n"+"Lo sentimos, no se pudo encontrar el Id"+" "+d1.getId());
        }
        Collections.sort(listaDulcesExistentes);
        Dulceria.mostrarProductos(d1);
    }
    
    public static void actualizarProducto(Dulceria d1){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n"+"Id del producto que quiere actualizar: ");
        d1.setId(entrada.nextInt());
        boolean busqueda = false;
        for(int i=0; i<listaDulcesExistentes.size(); i++){
            if(listaDulcesExistentes.get(i).getId()==d1.getId()){
                System.out.println("\n"+"Introduzca la nueva cantidad en Kilos: ");
                d1.setCantidad(entrada.nextInt());
                listaDulcesExistentes.get(i).setCantidad(d1.getCantidad());
                System.out.println("\n"+"SE ACTUALIZO EXITOSAMENTE EL ID"+" "+d1.getId());
                busqueda = true;
                break;
            }
        }
        if(busqueda==false){
            System.out.println("\n"+"Lo sentimos, no se pudo encontrar el Id"+" "+d1.getId());
        }
        Collections.sort(listaDulcesExistentes);
        Dulceria.mostrarProductos(d1);
    }
    
    static ArrayList<Dulceria> listaDulcesExistentes = new ArrayList<Dulceria>();
    public static void creacionLista(){
        Dulceria d1 = new Dulceria(45, "Doritos", 2);
        Dulceria d2 = new Dulceria(46, "Lokinos", 65);
        Dulceria d3 = new Dulceria(47, "Bombones", 154);
        Dulceria d4 = new Dulceria(50, "Speed max",20);
        
        listaDulcesExistentes.add(d1);
        listaDulcesExistentes.add(d2);
        listaDulcesExistentes.add(d3);
        listaDulcesExistentes.add(d4);
    }
    
    public static void mostrarProductos(Productos p1){
        System.out.println("\n"+"ESTOS SON LOS PRODUCTOS EXISTENTES EN LA CATEGORIA 'DULCERIA'"+"\n");
        System.out.println("ID"+" | "+"NOMBRE"+" | "+"CANTIDAD EN KG");
        for(int i=0; i<listaDulcesExistentes.size(); i++){
            System.out.println(listaDulcesExistentes.get(i).getId()+" "+listaDulcesExistentes.get(i).getNombre()+" "+listaDulcesExistentes.get(i).getCantidad());
        }
        Utilidades.menuFinal(p1);
    }
}
