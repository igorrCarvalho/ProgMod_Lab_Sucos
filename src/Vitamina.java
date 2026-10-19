
public class Vitamina extends Bebida {

	private static final double ACRESCIMO = 2.5;


	public Vitamina(EFruta fruta) {
		super("Vitamina");
		adicionar(fruta);
	}

	@Override 
	public int adicionar(EFruta fruta) {
		if (frutas.size() == 3) return 0;
		frutas.add(fruta);
		return 1;		
	}

	private ETamanho tamanho() {
		return ETamanho.values()[frutas.size() - 1];
	}

	@Override 
	public double preco() {
		if (frutas.isEmpty()) return 0.0;
		

		double preco = 0.0;
		for (EFruta fruta : frutas) {
			preco += fruta.valor();
		}

		double acrescimoTamanho = tamanho().taxa();

		preco = preco / frutas.size();
		preco += ACRESCIMO;
		return preco * acrescimoTamanho;
	}

	@Override 
	public String toString() {
		return super.toString();
	}

}
