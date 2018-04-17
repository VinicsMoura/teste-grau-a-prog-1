
public class TestaCarro {
	public static void main(String[] args){
		
		Carro c1 = new Carro("BMW","XS", 2017, "XXX999", 3000);
		Carro c2 = new Carro("Fiat", "Pálio", 2010, "XXX1010", 19000);
		Carro c3 = new Carro("Honda", "Civic", 2018, "AAA1015", 1000);
		
		c1.defineEstadoCarro();
		c2.defineEstadoCarro();
		c3.defineEstadoCarro();
		
		c1.testaCondicoesCarro();
		c2.testaCondicoesCarro();
		c3.imprimeInfo();
		
	}
}
