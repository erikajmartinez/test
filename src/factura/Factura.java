/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura;

/**
 *
 * @author ESTUDIANTE
 */                             //añadir interfaces
public class Factura implements Constantes, Asignacion{

  private double total_factura;
    public final static double IVA=0.16;
   
    public Factura(){};
   
    public Factura (double total_factura){
        this.total_factura=total_factura;
    }
   
    public void setTotalFactura(double total_factura){
        this.total_factura=total_factura;
    }
   
    public double getTotalFactura(){
        return total_factura;
    }
   
  @Override
    public double asignar_total(double total){
        if(total>=VALOR_MINIMO && total<=VALOR_MAXIMO)
            total_factura=total;
        else
            total_factura=-1;
        return total_factura;
    }
   
    public double calcular_IVA(){
        return total_factura*IVA;
    }
   
  @Override
    public double calcular_descuento(double desc){
        double aux=total_factura;
        total_factura-=total_factura*desc/100;
        //total_factura=total_factura-total_factura*desc/100;
       
        return aux*desc/100;
    }

    
}
