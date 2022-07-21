package sintomas;

import java.util.Scanner;

import javax.swing.JLabel;
public class Switch {
 public static void main(String[] args) {
  try (Scanner sintomas = new Scanner(System.in)) {
	System.out.println  ("Bem Vindo ao Diagnóstico! Além dos sintomas comuns de Gripe, informe quais sintomas distintos você tem apresentado");
	  
	  System.out.println  ("Se seus sintomas envolvem : Febre, Perda de Paladar ou Olfato, dificuldade de respirar, dores no peito e falta de mobilidade");
	   System.out.println  ("Digite 1 ");
	 System.out.println  ("Se seus sintomas envolvem: Febre acima dos 38ºC, dor no Corpo, dor de cabeça, calafrios, náuseas e vômitos, diarreia");
		System.out.println  ("Digite 2 ");
	 System.out.println  ("Se seus sintomas envolvem: Nariz entupido, sensação de pressão na região do nariz, bochecha, testa e ao redor dos olhos, dores de cabeça, cansaço e febre");
	System.out.println  ("Digite 3 ");
	
	  System.out.println("Escolha um número entre 1 a 3");
	  
	int numero = sintomas.nextInt();
	System.out.println("Procure o Posto de Saúde mais próximo!!");
	   switch (numero) {
	     case 1:
	       System.out.println("Seus sintomas indicam que você pode ter COVID 19");
	       break;
	     case 2:
	       System.out.println("Seus sintomas indicam que você pode ter  H3N2");
	       break;
	     case 3:
	       System.out.println("Seus sintomas indicam que você pode ter Sinusite");
	       break;
	    
	     default:
	       System.out.println("O número escolhido é inválido! Digite um número entre 1 a 3.");
	       break;
	   }
}
 }
}