import java.util.Objects;

public class Aluno extends Pessoa {

    private int ra;


    public Aluno(String nome, int idade, int ra) {
        super(nome, idade);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String getNome() {
        return "Nome do Aluno: ";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return idade == aluno.idade && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }
}
