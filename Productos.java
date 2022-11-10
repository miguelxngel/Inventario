/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;


public class Productos implements Comparable<Productos>{
    //ATRIBUTOS
    private int id;
    private String nombre;
    private int cantidad;
    private int desicionProducto;
    private int desicionAccion;
    private int desicionFinal;
    //METODOS

    public Productos() {
    }

    public Productos(int id, String nombre, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDesicionProducto() {
        return desicionProducto;
    }

    public void setDesicionProducto(int desicionProducto) {
        this.desicionProducto = desicionProducto;
    }

    public int getDesicionAccion() {
        return desicionAccion;
    }

    public void setDesicionAccion(int desicionAccion) {
        this.desicionAccion = desicionAccion;
    }

    public int getDesicionFinal() {
        return desicionFinal;
    }

    public void setDesicionFinal(int desicionFinal) {
        this.desicionFinal = desicionFinal;
    }

    @Override
    public int compareTo(Productos p1) {
        return this.id - p1.getId();
    }

    
    
}
