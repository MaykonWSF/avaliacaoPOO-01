import java.time.LocalDate;

public class Receita {
    private double valor;
    private String descricao;
    private String categoria;
    private LocalDate data;

    public Receita(double valor, String descricao, String categoria, LocalDate data){
        this.valor = valor;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
    }
}
