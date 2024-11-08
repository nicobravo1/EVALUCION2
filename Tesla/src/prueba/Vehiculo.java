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
public abstract class Vehiculo implements IvalorHora {
    public String idVehiculo;
    public boolean Mantenimiento;
    public double horaUsado;

    public Vehiculo() {
    }

    public Vehiculo(String idVehiculo, boolean Mantenimiento, double horaUsado) {
        this.idVehiculo = idVehiculo;
        this.Mantenimiento = Mantenimiento;
        this.horaUsado = horaUsado;
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
    public abstract double VALORFINALALQUILER();
    public abstract void mostrarDatos();

    void add(ArrayList<Vehiculo> vehiculos) {
         
    }
    
    
    
}
