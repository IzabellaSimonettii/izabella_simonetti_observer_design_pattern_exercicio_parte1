package observerPart01;

public class Assinante implements Observer {


	private String nome;
	private Produto produto;
	private Assinatura tipoAssinatura;
	
	private boolean assinaturaAtiva = true;

	@Override
	public void update(Entregavel entregavel) {
		System.out.println(nome + " recebeu " + entregavel.getProduto().getDescricao() 
				+ " " + tipoAssinatura.getDescricao());
		
		var d = Math.random();
		if (d < 0.1) {
			
		assinaturaAtiva = false;
		System.out.println( nome + " cancelou a assinatura");
		}
	}
	public Assinante (String nome, Produto produto, Assinatura tipoAssinatura) {
        this.nome = nome;
        this.produto = produto;
        this.tipoAssinatura = tipoAssinatura;
    }
	
	public boolean getAssinaturaAtiva () {
		return this.assinaturaAtiva;
	}
	    
	public Assinatura getTipoAssinatura(){
	    return this.tipoAssinatura;
	 }
	
	public Produto getProduto(){
	    return this.produto;
	 } 

}
