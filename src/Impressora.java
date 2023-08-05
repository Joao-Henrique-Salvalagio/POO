import java.util.List;

public class Impressora {
    public void imprimeNomes(List<PessoaAula> pessoas){
        for (PessoaAula p : pessoas) {
            System.out.println(p.getNome());
        }
    }
}
