package exercicios.ex04.prototype.base;

public class Questao {
    private String id;
    private String enunciado;
    private Float valor;

    public Questao(String id, String enunciado, Float valor) {
        this.id = id;
        this.enunciado = enunciado;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format(
                "Questão [%s]\n" +
                        "  Enunciado: %s\n" +
                        "  Valor: %.2f",
                id, enunciado, valor
        );
    }

    public Questao copiar() {
        return new Questao(this.id, this.enunciado, this.valor);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
