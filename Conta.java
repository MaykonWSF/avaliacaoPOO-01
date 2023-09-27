import java.util.ArrayList;
import java.util.List;

public class Conta{
    private String banco;
    private String descricao;
    private List<Despesa> historicodespesas;

    public Conta(String banco, String descricao){
        this.banco = banco;
        this.descricao = descricao;
    }
}
