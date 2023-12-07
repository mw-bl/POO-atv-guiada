public class Funcionario {
    String nome;
    int idade;
    double salario;
    String cargo;

    public Funcionario(String nome, int idade, double salario, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
    }
    // Getter/Setter NOME
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter/Setter IDADE
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Getter/Setter SALARIO
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // Getter/Setter CARGO
}