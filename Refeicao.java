package DesafioRestaurante;

public class Refeicao {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		Comida c3 = new Comida("Bife", 0.400);
		
		Pessoa p = new Pessoa("Goku", 99.80);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		System.out.println(p.apresentar());
		p.comer(c2);
		System.out.println(p.apresentar());
		p.comer(c3);
		System.out.println(p.apresentar());
		
	}
	

}
