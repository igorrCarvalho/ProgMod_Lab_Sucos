public enum EFruta {

	CUPUACU(10.0),
	GRAVIOLA(10.0),
	LARANJA(8.0),
	MANGA(7.50),
	MORANGO(10.0);

	private double valor;
	
	EFruta(double preco){
		valor = preco;
	}

	public double valor(){
		return valor;
	}
}
