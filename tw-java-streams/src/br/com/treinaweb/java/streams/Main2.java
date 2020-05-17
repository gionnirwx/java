package br.com.treinaweb.java.streams;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Empregado> empregados = new ArrayList<Empregado>();
		empregados.add(new Empregado(10, "Ana", 2000, "TI"));
		empregados.add(new Empregado(10, "Bia", 1000, "RH"));
		empregados.add(new Empregado(10, "Papai", 2200, "TI"));
		empregados.add(new Empregado(10, "Barata", 3000, "TI"));
		
		for (Empregado emp: empregados) {
			System.out.println(emp.getNome() + " - " + emp.getDepartamento());
		}
		
		

	}

}
