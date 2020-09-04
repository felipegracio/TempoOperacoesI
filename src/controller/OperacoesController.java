package controller;

public class OperacoesController {
	public OperacoesController() {
		super();	
	}
	public void Concatena100Numeros(){
		int vetor100[]= new int [100] ;
		int soma =0;
		double tempoInicial = System.nanoTime();
		for (int i=0; i <100 ; i ++  ){
			vetor100[i] = 1;
			soma = soma + vetor100[i];

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS 10^-9s
		tempoTotal = tempoTotal /Math.pow(10, 9);
		System.out.println("Tempo de calculo dos Vetor100 ==>"+tempoTotal+"s" + "Somas dos 100 Vetores"+soma);
		}
	
	public void Concatena1000Numeros(){
		int vetor1000[]= new int [1000] ;
		int soma =0;
		double tempoInicial = System.nanoTime();
		for (int i=0; i <1000 ; i ++  ){
			vetor1000[i] = 1;
			soma = soma + vetor1000[i];

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS 10^-9s
		tempoTotal = tempoTotal /Math.pow(10, 9);
		System.out.println("Tempo de calculo dos Vetor1000 ==>"+tempoTotal+"s"+ "Somas dos 10000 Vetores"+soma);	
	}
	
	public void Concatena10000Numeros(){
		int vetor10000[]= new int [10000] ;
		int soma =0;
		double tempoInicial = System.nanoTime();
		for (int i=0; i <10000 ; i ++  ){
			vetor10000[i] = 1;
			soma = soma + vetor10000[i];

		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS 10^-9s
		tempoTotal = tempoTotal /Math.pow(10, 9);
		System.out.println("Tempo de calculo dos Vetor10000 ==>"+tempoTotal+"s" + "Somas dos 10000 Vetores"+soma);	
	}
			
}
