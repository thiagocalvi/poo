/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LeitorScanner;

/**
 *
 * @author thiago
 */
import java.util.Scanner;

public class LeitorScanner {
    public static void main(String[] args){
        Scanner leitura = new Scanner(System.in);
        
        boolean bool;
        System.out.println("Informe um valor do tipo boolean: ");
        bool = leitura.nextBoolean();
        System.out.println("Valor informado: " + bool + "\n");
        
        
        byte byt;
        System.out.println("Informe um valor do tipo byte: ");
        byt = leitura.nextByte();
        System.out.println("Valor informado: " + byt + "\n");
        
        short shor;
        System.out.println("Informe um valor do tipo short: \n");
        shor = leitura.nextShort();
        System.out.println("Valor informado: " + shor + "\n");
        
        int i;
        System.out.println("Informe um valor do tipo int: \n");
        i = leitura.nextInt();
        System.out.println("Valor informado: " + i + "\n");
        
        long lon;
        System.out.println("Informe um valor do tipo long: \n");
        lon = leitura.nextLong();
        System.out.println("Valor informado: " + lon + "\n");

        float floa;
        System.out.println("Informe um valor do tipo float: \n");
        floa = leitura.nextFloat();
        System.out.println("Valor informado: " + floa + "\n");

        double doub;
        System.out.println("Informe um valor do tipo double: \n");
        doub = leitura.nextDouble();
        System.out.println("Valor informado: " + doub + "\n");
        
        char ch;
        System.out.println("Informe um dado do tipo char: \n");
        ch = leitura.next().charAt(0);
        System.out.println("Valor informado: " + ch + "\n");

        String str;
        System.out.println("Informe um valor do tipo string: \n");
        str = leitura.nextLine();
        System.out.println("Valor informado: " + str + "\n");
        
        String lin;
        System.out.println("Informe um valor do tipo string: \n");
        lin = leitura.next();
        System.out.println("Valor informado: " + lin + "\n");
    }
}
