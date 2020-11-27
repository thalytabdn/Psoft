public class CaixaBaixa implements Texto {
    private String texto;

    public CaixaBaixa(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String getTexto() {
        this.texto = texto.toLowerCase();
        return this.texto;
    }

    
}
