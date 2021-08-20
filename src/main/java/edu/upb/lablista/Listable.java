/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.lablista;


public interface Listable {
    
        public void agregar(Node nuevo);
        public Node buscarPorIndice(int indice);
        public void eliminarPorIndice(int indice);
        public Node obtenerPrimero();
        public Node obtenerUltimo();
        public void eliminarPrimero();
        public void eliminarUltimo();
        public void vaciar();
        
}
