package com.numeroprimo.app;
import java.util.Scanner;

public class primonumero 
{

	public static void main(String[] args)
	{
		
		//variables
		int numero=0;
		boolean isPrime=true;
		
		//objetos
		Scanner input=new Scanner(System.in);
		
		System.out.println("Dame el numero para determinar sí es primo: ");
		numero= input.nextInt();
		
		
		for (int i=2; i<numero;i++)
		{
			//System.out.println(i);
			if(numero%i==0)
			{
				isPrime=false;
			}
		}
		
		System.out.println(isPrime);
		
		input.close();

	}

}
