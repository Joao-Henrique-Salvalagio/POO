public class Professor extends PessoaAula{
    private int matricula;

    public Professor(String nome, int idade, int matricula){
        super (nome,idade);
        this.matricula = matricula;
    }
    @Override
    public String getNome(){
        return "Nome do professor";
    }

    public Integer getIdade(){
        return super.getIdade();
    }
    public Integer getMatricula(){
        return this.matricula;
    }


}
