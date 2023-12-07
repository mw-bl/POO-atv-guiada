public class Prato {
    String nomePrato;
    String descricao;
    double preco;

    public Prato(String nomePrato, String descricao, double preco) {
        this.nomePrato = nomePrato;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Getter/Setter NOME DO PRATO
    public String getNomePrato() {
        return nomePrato;
    }
    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    // Getter/Setter DESCRICAO
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter/Setter PRECO
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
