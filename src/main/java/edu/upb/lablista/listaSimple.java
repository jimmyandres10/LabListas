    
package edu.upb.lablista; 



public class listaSimple implements Listable{
    Node primero; 
    Node ultimo;
    int tamaño=1;
    boolean N=true;
    
    public listaSimple(Node nuevo){
        primero=nuevo;
        ultimo=primero;
        
    }
   
    public void agregar(Node nuevo){ 
        if(tamaño==0){
            primero=nuevo;
            ultimo=primero;
        }else{ 
        Node current = primero; 
        Node anterior = primero;
         
        String nuevoIngreso = String.valueOf(nuevo.getValor().getNombre().trim().toLowerCase().charAt(0));
        String elementoX = String.valueOf(current.getValor().getNombre().trim().toLowerCase().charAt(0));
         
        if(nuevoIngreso.compareTo(elementoX)<=0){ 
            nuevo.setNext(current);
            primero=nuevo;   
             
         
             
        }else if(nuevoIngreso.compareTo(String.valueOf(ultimo.getValor().getNombre().trim().toLowerCase().charAt(0)))>=0){  
            ultimo.setNext(nuevo); 
            ultimo=nuevo ;   
        }else { 
            for(int i=0 ; i<tamaño-1 ; i++){   
                current=current.getNext(); 
                if(i!=0){ 
                    anterior= anterior.getNext();
                } 
                elementoX = String.valueOf(current.getValor().getNombre().trim().toLowerCase().charAt(0)); 
                if(nuevoIngreso.compareTo(elementoX)<=0){   
                    anterior.setNext(nuevo);
                    nuevo.setNext(current);    
                    break; 
                }
                
                
                
            }
        }
        
        }
        tamaño++;
    } 
    public void imprimir(){
        if(tamaño==0){
            System.out.println("lista vacia");
        }else{ 
            Node current = primero;
            for(int i = 0 ; i < tamaño ; i++){
                int elem = current.getValor().getEdad();
                String elem2= current.getValor().getNombre();
                System.out.println("Edad: " + elem + "\nNombre: "+elem2+"\n"); 
                current = current.getNext(); 
            }
        }
           
    }
     
    public Node buscarPorIndice(int indice){
        Node elem = primero;
        for(int i=0 ; i<indice ; i++){
            elem = elem.getNext();
        }
        return elem;
    }
     
    public void eliminarPorIndice(int indice){
        Node elem = primero;
        Node elemAnterior = primero;
        if(indice==0){
            primero=primero.getNext(); 
        }else if(indice==tamaño-1){
            for(int i=0 ; i<tamaño-1 ; i++){
                elem=elem.getNext();
            }
            ultimo=elem; 
        }else{
            for(int i=0 ; i<indice ; i++){
                elem=elem.getNext();
                if(i!=0){
                    elemAnterior=elemAnterior.getNext();
                }
            } 
            elemAnterior.setNext(elem.getNext()); 
        }
        tamaño--;
        
    }
     
    public Node obtenerPrimero(){
        return primero;
    }
         public void eliminarPrimero(){
        primero=primero.getNext();
        tamaño--;
    }
         
    public Node obtenerUltimo(){
        return ultimo;
    }
     

     
    public void eliminarUltimo(){
        Node elem=primero;
        for(int i=0 ; i<tamaño-2 ; i++){
            elem=elem.getNext();
        }
        ultimo=elem;
        ultimo.setNext(null);
        tamaño--;
    }
     
    public void vaciar(){
        primero=null;
        ultimo=null;
        tamaño=0;
    }
     
    public void EdadMayor(){
        if(tamaño==0){
            System.out.println("lista vacia");
        }else{
            Node mayor=primero;
        Node elem=primero;
        int index=0;
        for (int i=0 ; i<tamaño-1 ; i++){
            elem=elem.getNext();
            if(mayor.getValor().getEdad()<elem.getValor().getEdad()){
                mayor=elem; 
                index=i+1;
            }
        }
        System.out.println("indice: "+index);
        }
    }
    
    public void EdadMenor(){
        if(tamaño==0){
            System.out.println("lista vacia");
        }else{
            Node menor=primero;
            Node elem=primero;
            int index=0;
            for (int i=0 ; i<tamaño-1 ; i++){
                elem=elem.getNext();
                if(menor.getValor().getEdad()>elem.getValor().getEdad()){
                    menor=elem; 
                    index=i+1;
                }
            }
            System.out.println("indice: "+index);

        }
        
    }
    
    public void PromedioEdad(){
        Node current = primero;
        int promedio=0;
        for(int i = 0 ; i < tamaño ; i++){
            promedio += current.getValor().getEdad();  
            current = current.getNext(); 
        }
        promedio/=tamaño;
        System.out.println("Promedio: " + promedio);
    }

  
     
    
    
    
    
    
}