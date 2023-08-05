import Transportadora.TransporteNautico;
import Transportadora.TransporteTerrestre;

import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       /*Aluno Aluno = new Aluno("João Henrique", 21, 231235812);
            System.out.println(Aluno.getNome());
            System.out.println(Aluno.getIdade());
            System.out.println(Aluno.getRA());
            System.out.println("--------------");*/
       /*AProfessor Professor = new Professor("Henrique", 30, 40423421);
            System.out.println(Professor.getNome());
            System.out.println(Professor.getIdade());
            System.out.println(Professor.getMatricula());
            System.out.println("--------------");*/
       /*//PessoaAula pessoaAula = new PessoaAula ("João Henrique", 21);
       Aluno aluno = new Aluno("Manuel", 29, 123456);
       Professor professor = new Professor("Henrique", 33, 123456);
            //System.out.println(pessoaAula.getNome());
            System.out.println(aluno.getNome());
            System.out.println(Professor.getNome());
            System.out.println("--------------");
       Impressora impressora = new Impressora();
       impressora.imprimeNomes(List.of(aluno, professor));
       System.out.println("--------------");*/
        TransporteNautico transporteNautico = new TransporteNautico();
        TransporteTerrestre transporteTerrestre = new TransporteTerrestre();

        System.out.println("Valor do Transporte Náutico: " + transporteNautico.CalculaFrete(8,16));
        System.out.println("Valor do Transporte Terrestre: " + transporteTerrestre.CalculaFrete(6,3));

    }

}