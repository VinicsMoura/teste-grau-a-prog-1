
public class Carro {
	private String marca, modelo, placa, estado;
	private int anoFabricacao;
	private double quilometragem;

	public Carro(String marca, String modelo, int anoFabricacao, String placa, double quilometragem) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.placa = placa;
		this.quilometragem = quilometragem;
		this.estado = null;
	}

	public String getEstado() {
		return estado;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public void defineEstadoCarro() {
		if (quilometragem >= 0 && quilometragem < 10000) {
			estado = "seminovo";
		} else if (quilometragem >= 10000 && quilometragem < 100000) {
			estado = "usado";
		} else if (quilometragem >= 100000) {
			estado = "bem usado";
		}
	}

	public void imprimeInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de Fabricação: " + anoFabricacao);
		System.out.println("Placa:" + placa);
		System.out.println("Quilometragem:" + quilometragem);
	}

	public void testaCondicoesCarro() {
		imprimeInfo();
		if (estado.equalsIgnoreCase("seminovo") && anoFabricacao <= 2010) {
			System.out.println("Carro seminovo, mas possui " + (2018 - anoFabricacao) + " anos.");
		} else if (estado.equalsIgnoreCase("seminovo") && anoFabricacao > 2010) {
			System.out.println("Carro seminovo");
		} else if (estado.equalsIgnoreCase("usado") && anoFabricacao <= 2010) {
			System.out.println("Carro usado e com " + (2018 - anoFabricacao) + " anos.");
		} else if (estado.equalsIgnoreCase("usado") && anoFabricacao > 2010) {
			System.out.println("Carro usado, mas fabricado recentemente.");
		} else if (estado.equalsIgnoreCase("bem usado")) {
			System.out.println("Carro muito usado. Invista em uma revisão antes de comprar.");
		}
	}
}
