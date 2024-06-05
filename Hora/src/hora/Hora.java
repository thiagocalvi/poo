/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hora;

/**
 *
 * @author thiago
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(){
    
    }
    
    public Hora(int h, int m, int s){
        setHorario(h, m, s);
    }
    
    public Hora(int h){
        setHorario(h, 0, 0);
    }
    
    
    public void setHorario(int h, int m, int s){
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }
    
    public void setHora(int h){
        this.hora = h;
    }
    
    public void setMinuto(int m){
        this.minuto = m;
    }
    
    public void setSegundo(int s){
        this.segundo = s;
    }
    
    public String getHorario(){
        String horaString =  this.hora+":" +this.minuto+":" +this.segundo;
        return horaString;
    }
}
