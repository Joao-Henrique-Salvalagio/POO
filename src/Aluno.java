public class Aluno extends PessoaAula {
    private Integer RA;

    public Aluno (String nome, Integer idade, int RA){
        super (nome, idade);
        this.RA = RA;
    }

    @Override
    public String getNome(){
        return "Nome do aluno" ;
    }
    public Integer getIdade(){
        return super.getIdade();
    }

    public Integer getRA(){
        return this.RA;
    }
}
