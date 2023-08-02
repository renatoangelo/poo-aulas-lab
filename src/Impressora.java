import java.util.List;
public class Impressora {
    public void imprimeNomes(List<Pessoa> pessoas) {
        for (Pessoa p : pessoas) {
            System.out.println(p.getNome());
        }
    }
}
