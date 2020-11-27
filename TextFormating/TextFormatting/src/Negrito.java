public class Negrito implements Texto {
    private String texto;
    
    public Negrito(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto() {
        this.texto = "<b>" + this.texto + "<b>";
        return this.texto;
    }

}
