/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;


public class Main {

    public static void main(String[] args) {
        Granos.crearListaProductos();
        Dulceria.creacionLista();
        Aseo.creacionLista();
        Productos p1 = new Productos();
        Utilidades.menuPrincipal(p1);
    }

}
