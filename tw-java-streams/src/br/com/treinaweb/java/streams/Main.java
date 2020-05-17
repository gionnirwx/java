package br.com.treinaweb.java.streams;

import java.util.ArrayList;
import java.util.List;

public class Main {	

	public static void main(String[] args) {
	
		List<Empregado> empregados = new ArrayList<Empregado>();
		
		empregados.add(new Empregado(1, "Ana Beatriz", 2300, "Tecnologia de Crianças"));
		empregados.add(new Empregado(2, "Maria", 3000, "RH"));
		empregados.add(new Empregado(3, "Gionni", 1500, "Desenvolvimento"));
		empregados.add(new Empregado(4, "Josefina", 7000, "CTO"));
		
		System.out.println("Lista de empregados:");
		//foreach com FOR tradicional
		
		
		double salarioTotal = 0;
		
		
		System.out.println("Total de salários dos empregados:");
		
		//usando foreach de forma verbosa(tradicional)
		for (Empregado emp: empregados){
			salarioTotal += emp.getSalario();
		}
		
		//usando stream
		double salarioT = empregados.stream().mapToDouble(emp -> emp.getSalario()).sum();
		
		System.out.println("Codigo de cima: " + salarioTotal);
		System.out.println("Codigo de baixo: " + salarioT);
		
		if(salarioT == salarioTotal) {
			System.out.println("Códigos diferentes mas os resultados são iguais!");
		}
		
		for(Empregado emp: empregados) {
			System.out.print(String.format("Nome: %s  |  Departamento: %s\n", 
					emp.getNome(), emp.getDepartamento()));
		}
		
		//usando streamAPI Java 8+
		empregados.stream().forEach(emp -> {
			System.out.println(emp.getNome());
		});
		
		
		
		

	}

}
