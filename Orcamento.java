import java.time.LocalDate;

public class Orcamento {
    private LocalDate data;
    private double valor;
    private String descricao;

    public Orcamento(LocalDate data, double valor, String descricao){
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }
}
