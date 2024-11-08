/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.ArrayList;

/**
 *
 * @author Cetecom
 */
public class Auxiliar {
    ArrayList<Vehiculo>vehiculos;

    public Auxiliar() {
        vehiculos = new ArrayList<>();
    }
    
    public boolean agregarVehiculo(Vehiculo vehiculos){
        for(Vehiculo i : this.vehiculos){
            if(i.idVehiculo.equals(vehiculos.idVehiculo)){
                System.out.println("El id de este vehiculo ya existe");
                return false;
                
            }
                
                
            
        }
        vehiculos.add(this.vehiculos);
        
        return true;
       
            
            
            
                
            
                
        
        
      
    }
    
    
    public void listarVehiculo(){
        for(Vehiculo i: vehiculos){
            i.mostrarDatos();
        }
            
    }
    
    
    
    public int cantidadVehiculo(){
        return vehiculos.size();
    }
    
    
    
    
    public double costoAlquierVehiculos(){
        double costo =0;
        for(Vehiculo i : vehiculos){
            costo= costo+i.VALORFINALALQUILER();
        }
        return costo;
    }
    
    
    
    
    
}
