public class PessoaFisica extends Pessoa{

    protected String sobrenome;
    protected String cpf;
    
    
    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }


    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String toString(){
        return this.sobrenome+this.cpf;
    }
    
}
