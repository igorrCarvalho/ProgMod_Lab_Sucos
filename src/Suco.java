
public class Suco extends Bebida {

	public Suco(EFruta fruta) {
		super("Suco");
		adicionar(fruta);
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if (frutas.size() == 0) {
			frutas.add(fruta);
			return 1;
		}
		if ((frutas.getFirst() == EFruta.LARANJA || fruta == EFruta.LARANJA) && frutas.size() < 2) {
			frutas.add(fruta);
			return 1;
		}
		return 0;
	}

	@Override 
	public double preco() {
		if (frutas.isEmpty()) return 0.0;
		double somaPrecos = 0.0;
		for (EFruta fruta : frutas) {
			somaPrecos += fruta.valor();
		}
		return somaPrecos / frutas.size();
	}

	@Override 
	public String toString() {
		return super.toString();
	}

}
