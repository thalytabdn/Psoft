public class CaixaAlta implements Texto {
    private String texto;
    
    public CaixaAlta(String texto) {
        this.texto = texto;
    }

	@Override
    public String getTexto() {
        this.texto = texto.toUpperCase();
        return this.texto;
    }
    
}
