import java.time.LocalDate;

public class Meta {
    private LocalDate data;
    private double valor;
    private String descricao;

    public Meta(LocalDate data, double valor, String descricao){
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }
}
