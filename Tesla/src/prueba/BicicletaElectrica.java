/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends Vehiculo {
    public String freno;
    public double bateriaBicicleta;

    public BicicletaElectrica() {
    }

    public BicicletaElectrica(String freno, double bateriaBicicleta, String idVehiculo, boolean Mantenimiento, double horaUsado) {
        super(idVehiculo, Mantenimiento, horaUsado);
        this.freno = freno;
        this.bateriaBicicleta = bateriaBicicleta;
    }

    public String getFreno() {
        return freno;
    }

    public void setFreno(String freno) {
        this.freno = freno;
    }

    public double getBateriaBicicleta() {
        return bateriaBicicleta;
    }

    public void setBateriaBicicleta(double bateriaBicicleta) {
        this.bateriaBicicleta = bateriaBicicleta;
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
        System.out.println("ID Bicileta: "+getIdVehiculo()+"Su tipo de freno: "+getFreno()+"Su bateria en KM: "+bateriaBicicleta+"Requiere mantenimiento: "+Mantenimiento+"Horas usadas"+getHoraUsado());
    }

    @Override
    public double VALORFINALALQUILER() {
        double costo=horaUsado*VALOR_HORA_ALQUILER;
        if(bateriaBicicleta<bateriaBicicleta/2){
            costo=costo*0.05;
            
        }
        return costo;
            
        
        
    }
    
}
