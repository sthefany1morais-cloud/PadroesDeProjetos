package exercicios.ex09.proxy;

public enum Plano {
    BASICO,
    PREMIUM,;

    public String getPlano() {
        if (this == BASICO) {
            return "Básico";
        } else if (this == PREMIUM) {
            return "Premium";
        }
        return "Plano desconhecido";
    }
}
