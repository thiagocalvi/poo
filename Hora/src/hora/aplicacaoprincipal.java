/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hora;

/**
 *
 * @author thiago
 */
public class aplicacaoprincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hora horaDoAlmoco;
        
        horaDoAlmoco = new Hora();
        horaDoAlmoco.setHorario(13, 30, 0);
        
        Hora horaAtual = new Hora(13, 30, 0);
        System.out.println(horaAtual.getHorario());
          
    }
    
}
