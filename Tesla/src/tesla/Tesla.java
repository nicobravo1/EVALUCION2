/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tesla;

import java.util.Scanner;
import prueba.Auto;
import prueba.Auxiliar;
import prueba.BicicletaElectrica;
import prueba.Moto;


/**
 *
 * @author Cetecom
 */
public class Tesla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auxiliar registro = new Auxiliar();
        Scanner entrada = new Scanner(System.in);
        
        
        
        
        
        
        
        
        
        
        registro.agregarVehiculo(new Auto(5, true,"123", true, 20));
        registro.agregarVehiculo(new Auto(6, false,"12", true, 10));
        registro.agregarVehiculo(new Auto(3, true,"124", true, 5));
        registro.agregarVehiculo(new Moto("70%", true, "122", true, 5));
        registro.agregarVehiculo(new Moto("60%", false, "14444", true, 7));
        registro.agregarVehiculo(new BicicletaElectrica("MANUAL", 0, "5555", true, 4));
        registro.agregarVehiculo(new BicicletaElectrica("automatico", 0, "555551", true, 5));
        
        
        
        int opc=0;
        
        
        while(opc!=4){
            System.out.println("******Tesla*********");
            
            System.out.println("1-Listar vehiculos:");
            System.out.println("2-Mostrar cantidad de vehiculos: ");
            System.out.println("3-Valor alquiler");
            System.out.println("4-salir");
            System.out.println("Ingrese una opcion: ");
            
            
            opc = entrada.nextInt();
            
            
            switch(opc){
                case 1:
                    registro.listarVehiculo();
                    break;
                    
                case 2:
                    registro.cantidadVehiculo();
                    break;
                    
                case 3:
                    registro.costoAlquierVehiculos();
                    break;
                    
                    
                
                    
                
                    
                    
                
                    
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
   
}
