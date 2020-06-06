package observerPart01;

public class PontoInicial {

	public PontoInicial() {
		// TODO Auto-generated constructor stub
	}

	 public static void main(String[] args) {
	        Editora editora = new Editora();
	        editora.addObserver(new Assinante("Jose", Produto.ESTADAO, Assinatura.DIARIA));
	        editora.addObserver(new Assinante("Joao", Produto.ESTADAO, Assinatura.SEMANAL));
	        editora.addObserver(new Assinante("Maria", Produto.MARIECLAIRE, Assinatura.SEMANAL));
	        editora.iniciar();

	    }

}
