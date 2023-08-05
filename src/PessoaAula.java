public abstract class PessoaAula {
    private String nome;
    private int idade;

    public PessoaAula(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String getNome();
    public Integer getIdade(){
        return idade;
    }
}
