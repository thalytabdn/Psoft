public class Italico implements Texto {
    private String texto;

    public Italico(String texto) {
        this.texto = texto;
    }
    
    @Override
    public String getTexto() {
        this.texto = "<i>" + this.texto + "<i>";
        return this.texto;
    }

}