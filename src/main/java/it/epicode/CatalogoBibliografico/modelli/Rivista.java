package it.epicode.CatalogoBibliografico.modelli;

public class Rivista extends Elemento {
    private Periodo periodo;

    public Rivista(String isbn, String titolo, int annoPubblicazione, int numeroPagine, Periodo periodo) {
        super(isbn, titolo, annoPubblicazione, numeroPagine);
        this.periodo = periodo;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Periodo: " + periodo;
}
}