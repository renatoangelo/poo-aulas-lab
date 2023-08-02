public class Professor extends Pessoa {

    private String matricula;

    public Professor(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public String getNome() {
        return "Nome do Professor: ";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
