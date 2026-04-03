package padroescriacao.factorymethod;

public class PagamentoBoleto implements IPagamento {

    public String processar() {
        return "Pagamento via boleto processado";
    }

    public String estornar() {
        return "Pagamento via boleto estornado";
    }
}
