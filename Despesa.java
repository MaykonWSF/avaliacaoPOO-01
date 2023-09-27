import java.time.LocalDate;

public class Despesa {
    private double valor;
    private String descricao;
    private String categoria;
    private LocalDate data;

    public Despesa(double valor, String descricao, String categoria, LocalDate data){
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }
}
