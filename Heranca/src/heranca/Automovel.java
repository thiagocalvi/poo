/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author thiago
 */
public class Automovel extends Terrestre {
    private String numPlaca;
    private int numPortas;
    private String veiculo;
    
    public Automovel(){
        
    }
    
    public Automovel(int numRodas, int capacidade, String numPlaca, int numPortas, String veiculo){
        super(numRodas, capacidade);
        this.numPlaca = numPlaca;
        this.numPortas = numPortas;
        this.veiculo = veiculo;
    }

    public String getVeiculo(){
        return this.veiculo;
    }
    
    public void setVeiculo(String veiculo){ 
        this.veiculo = veiculo;
    }
    
    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public void imprimeDadosAutomovel(){
        System.out.println("Veiculo: " + this.veiculo);
        System.out.println("Capacidade: " + this.capacidade);
        System.out.println("Numero de rodas: " + this.numRodas);
        System.out.println("Numero da placa: " + this.numPlaca);


    }
}
