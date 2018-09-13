/**
 * 
 */
package com.algaworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * @author helber
 * 
 */
public class Memoria {
	
	private List<Object> lista = new ArrayList<Object>();
	
	public static void main(String[] args) {

		Memoria memoria = new Memoria();
		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		try {

  
			do {
				
				System.out.println("Informe a opção :");
				opcao = teclado.nextInt();	
				if (opcao==1) {
					for (int i = 0; i < 20000000; i++) {
						memoria.lista.add(new Object());
					}
				}
				
			} while (opcao!=0);



		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Erro" + e.getMessage());
		}

	}
}
