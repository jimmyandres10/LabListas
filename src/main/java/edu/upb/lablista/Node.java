/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.lablista;


public class Node {
    
    private Alumno valor;
    private Node next; 

    public Node(int edad, String nombre){
        Alumno nuevo = new Alumno(edad, nombre);
        valor=nuevo;
    }

    public Alumno getValor() {
        return valor;
    }
 
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public String mostrarInfo(){
        return "nombre:"+ valor.getNombre()+"\nedad: "+valor.getEdad();
    }
    
    
    
    
    
   
}
