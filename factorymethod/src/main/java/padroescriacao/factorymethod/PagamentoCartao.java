package padroescriacao.factorymethod;

public class PagamentoCartao implements IPagamento {

    public String processar() {
        return "Pagamento com cartao processado";
    }

    public String estornar() {
        return "Pagamento com cartao estornado";
    }
}
