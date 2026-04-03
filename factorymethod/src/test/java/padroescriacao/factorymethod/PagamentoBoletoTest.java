package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoBoletoTest {

    @Test
    void deveProcessarBoleto() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento via boleto processado", pagamento.processar());
    }

    @Test
    void deveEstornarBoleto() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Boleto");
        assertEquals("Pagamento via boleto estornado", pagamento.estornar());
    }
}
