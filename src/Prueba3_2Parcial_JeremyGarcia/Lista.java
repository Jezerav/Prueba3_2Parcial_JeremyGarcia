/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba3_2Parcial_JeremyGarcia;

/**
 *
 * @author jerem
 */
public class Lista {
    private Nodo inicio=null;
    private int size=0;
    
    public boolean isEmpty(){
        return inicio==null;
    }
    
    public void add( Nodo obj){
        if(obj==null)
            return;
        if(isEmpty()){
            inicio=obj;
        }else{
            Nodo tmp=inicio;
            while(tmp.sigte!=null){
                tmp=tmp.sigte;
            }
            tmp.sigte=obj;
        }
        size++;
    }
    
    public void print(){
        Nodo tmp=inicio;
        while (tmp != null) { 
            System.out.println(tmp);
            tmp = tmp.sigte;
        }
    }
    
    public Nodo get(int code){
        Nodo tmp = inicio;

        while (tmp != null) {
            if (tmp.codigo == code) {
                return tmp; 
            }
            tmp = tmp.sigte; 
        }

        return null; 
    }
    
    /*PRUEBA 3
    - Eliminar un nodo cuyo código coincida usando remove(int codigo). 
      Debe devolver true si lo eliminó correctamente o false si no se encontró.
    
    - Obtener la cantidad de nodos almacenados con el método size().

    - Insertar un nodo en una posición específica con el método add(int index, Nodo obj). 
      Si el índice es mayor al tamaño de la lista debe lanzar IndexOutOfBoundsException. 
      Si el índice es 0, el nodo debe colocarse al inicio.
    
    - Crear una clase Main, en donde, se debe probar las opciones publicas y crear un menú 
      que permita ingresar datos desde el teclado(consola)
    */
    
     public boolean remove(int code){
         
        if(inicio != null && inicio.codigo == code){
            inicio = inicio.sigte; 
            size--;
            return true;
        }
        Nodo tmp = inicio;
        Nodo antes = null;

        while(tmp != null){
            if(tmp.codigo == code){
                antes.sigte = tmp.sigte;
                size--;
                return true;
            }
            antes = tmp;
            tmp = tmp.sigte;
        }
        return false;
    }
     
     public int size(){
        return size;
    }
     
     public void add(int index, Nodo obj){
        if(obj==null) 
            return;
            
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException();

        if(index == 0){
            obj.sigte = inicio;
            inicio = obj;
        }else{
            Nodo tmp = inicio;
            for(int i=0; i < index-1; i++){
                tmp = tmp.sigte;
            }
            obj.sigte = tmp.sigte;
            tmp.sigte = obj;
        }
        size++;
    }
}
