import java.util.Date;

public class Pessoa {
    String nome;
    Date Data_nascimento;
    Integer idade;

    public Pessoa (){
    };

    public Pessoa(String novoNome){
        this.nome = novoNome;
    }

    public Pessoa (Integer novaIdade){
        this.idade = novaIdade;
    }

    public Pessoa (Date novaData){
        this.Data_nascimento = novaData;
    }

    public Pessoa (String novoNome, Integer novaIdade, Date novaData){
      this.idade = novaIdade;
      this.nome = novoNome;
      this.Data_nascimento = novaData;
    }
    public String getNome(){
        return this.nome;
    }

    public Date getData_nascimento(){
        return this.Data_nascimento;
    }

    public Integer getIdade () {
        return this.idade;
    }

    public String setNome(String novoNome){
        this.nome = novoNome;
        return this.nome;

    }

    public Date setData_nascimento(Date novaData){
        this.Data_nascimento = novaData;
        return this.Data_nascimento;
    }

    public Integer setIdade(Integer novaIdade){
        this.idade = novaIdade;
        return this.idade;
    }
}

