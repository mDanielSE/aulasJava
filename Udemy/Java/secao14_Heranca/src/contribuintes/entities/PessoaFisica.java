package contribuintes.entities;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto(double porcentagem) {
        return (getRendaAnual() * porcentagem / 100) - (gastosSaude * 0.5);
    }
}
