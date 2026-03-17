package exercicios.ex04.prototype.base;

import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;

public class Prova {

    private String titulo;
    private String disciplina;
    private String data;
    private String versao;
    private String professor;
    private List<Questao> questoes;
    private Float valorTotal;

    public Prova(String titulo, String disciplina, String data, String versao, String professor, List<Questao> questoes) {
        this.titulo = titulo;
        this.disciplina = disciplina;
        this.data = data;
        this.versao = versao;
        this.professor = professor;
        this.questoes = questoes;
        this.valorTotal = calcularValorTotal();
    }

    public Float calcularValorTotal() {
        Float valorTotal = 0.0f;
        for (Questao questao : questoes) {
            valorTotal += questao.getValor();
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("====================================\n");
        sb.append("            PROVA\n");
        sb.append("====================================\n");
        sb.append(String.format("Título: %s\n", titulo));
        sb.append(String.format("Disciplina: %s\n", disciplina));
        sb.append(String.format("Data: %s\n", data));
        sb.append(String.format("Versão: %s\n", versao));
        sb.append(String.format("Professor: %s\n", professor));
        sb.append(String.format("Valor Total: %.2f\n", valorTotal));
        sb.append("------------------------------------\n");
        sb.append("QUESTÕES:\n\n");

        for (int i = 0; i < questoes.size(); i++) {
            sb.append(String.format("%d) %s\n\n", i + 1, questoes.get(i)));
        }

        sb.append("====================================");

        return sb.toString();
    }

    public Prova copiar() {
        List<Questao> questoesCopiadas = questoes.stream()
                .map(Questao::copiar)
                .collect(Collectors.toList());
        return new Prova(this.titulo, this.disciplina, this.data, this.versao, this.professor, questoesCopiadas);
    }

    public void substituirQuestao(String id, Questao nova){
        boolean questaoEncontrada = false;
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getId().equals(id)) {
                questoes.set(i, nova);
                this.valorTotal += nova.getValor() - questoes.get(i).getValor();
                questaoEncontrada = true;
                break;
            }
        } if (!questaoEncontrada){
            throw new RuntimeException("Questão com id " + id + " não encontrada.");
        }
    }

    public void adicionarQuestao(Questao questao) {
        questoes.add(questao);
        this.valorTotal += questao.getValor();
    }

    public void removerQuestao(String id) {
        boolean questaoEncontrada = false;
        for (int i = 0; i < questoes.size(); i++) {
            if (questoes.get(i).getId().equals(id)) {
                questoes.remove(i);
                this.valorTotal -= questoes.get(i).getValor();
                questaoEncontrada = true;
                break;
            }
        } if (!questaoEncontrada){
            throw new RuntimeException("Questão com id " + id + " não encontrada.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
}
