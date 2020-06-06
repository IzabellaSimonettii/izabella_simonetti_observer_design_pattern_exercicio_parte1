package observerPart01;

public enum Assinatura {

	DIARIA("Diaria"),
	SEMANAL("Semanal"),
	FIMDESEMANA("Fim de semana");

	private String descricao;

    Assinatura(String descricao) {
        this.descricao = descricao;
    }
    

    public String getDescricao() {
        return descricao;
    }
}
