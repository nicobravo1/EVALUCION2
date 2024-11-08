/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Cetecom
 */
public class Auto extends Vehiculo{
    public int Pasajeros;
    public boolean autoPilot;

    public Auto() {
    }

    public Auto(int Pasajeros, boolean autoPilot, String idVehiculo, boolean Mantenimiento, double horaUsado) {
        super(idVehiculo, Mantenimiento, horaUsado);
        this.Pasajeros = Pasajeros;
        this.autoPilot = autoPilot;
    }

    public int getPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(int Pasajeros) {
        this.Pasajeros = Pasajeros;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public boolean isMantenimiento() {
        return Mantenimiento;
    }

    public void setMantenimiento(boolean Mantenimiento) {
        this.Mantenimiento = Mantenimiento;
    }

    public double getHoraUsado() {
        return horaUsado;
    }

    public void setHoraUsado(double horaUsado) {
        this.horaUsado = horaUsado;
    }
    

  

 



  

    
    
    



    

    
    
    @Override
    public void mostrarDatos(){
        System.out.println("Auto con capacidad de pasajeros:"+getPasajeros()+"auto con manejo automatico"+autoPilot+"Horas usadas: "+getHoraUsado());
        
    }

    @Override
    public double VALORFINALALQUILER() {
        double costo=horaUsado*VALOR_HORA_ALQUILER;
        
        if(autoPilot==true){
            costo=costo*1.1;
        }
        return costo;
        
        
    }

    
}
