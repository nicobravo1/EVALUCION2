/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Cetecom
 */
public class Moto extends Vehiculo{
    public String bateria;
    public boolean asistenciaEco;

    public Moto() {
    }

    public Moto(String bateria, boolean asistenciaEco, String idVehiculo, boolean Mantenimiento, double horaUsado) {
        super(idVehiculo, Mantenimiento, horaUsado);
        this.bateria = bateria;
        this.asistenciaEco = asistenciaEco;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public boolean isAsistenciaEco() {
        return asistenciaEco;
    }

    public void setAsistenciaEco(boolean asistenciaEco) {
        this.asistenciaEco = asistenciaEco;
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
        System.out.println("ID de su moto: "+getIdVehiculo()+"Bateria: "+getBateria()+"contiene asistencia: "+asistenciaEco+"requiere mantenimiento: "+Mantenimiento+"Horas usadas: "+getHoraUsado());
        
    }

    @Override
    public double VALORFINALALQUILER() {
        double costo=horaUsado*VALOR_HORA_ALQUILER;
        if(asistenciaEco==true){
            costo=costo*1.08;
        }
        return costo;
        
    }
    
}
