package com.numeroprimo.app;
//import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		int cantidadPorLinea=0;
		int contador=0;
		//Scanner scanner=new Scanner(System.in);
		
		for (int i=1;i<30;i++)
		{
			
			System.out.print(i+" ");

            
            if(contador++==cantidadPorLinea)
            	
            {
            	cantidadPorLinea++;
                contador=0;

                System.out.println();

            }
		}
        //scanner.close();
	}

}
