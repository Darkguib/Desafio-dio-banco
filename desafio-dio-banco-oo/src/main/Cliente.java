package main;
//Classe do cliente
public class Cliente {
    private String nome; //Nome do cliente
    private String sexo; //Sexo do cliente
    private String estadoCivil; //O estado cívil do cliente
    private String emprego; //O emprego do cliente
    private int idade;
    private long cpf;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getEmprego(){
        return emprego;
    }
    public void setEmprego(String emprego){
        this.emprego = emprego;
    }
    public String getEstadoCívil(){
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }
    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public long getCpf(){
        return cpf;
    }
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    public void dadosCliente(){
        System.out.println("-----DADOS DO CLIENTE-----");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
        System.out.println("Cpf: "+cpf);
        System.out.println("Estado cívil: "+estadoCivil);
        System.out.println("Emprego: "+emprego);
        System.out.println("---------------------------");

    }
}
