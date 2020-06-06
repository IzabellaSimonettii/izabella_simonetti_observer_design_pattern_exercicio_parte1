package observerPart01;

public enum Produto {
	
	MARIECLAIRE("Marie Claire"),
	ESTADAO("Estadão");

	private String descricao;

    Produto(String descricao) {
        this.descricao = descricao;
    }
    

    public String getDescricao() {
        return descricao;
    }
}
