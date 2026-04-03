package padroescriacao.factorymethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PagamentoCartaoTest {

    @Test
    void deveProcessarCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento com cartao processado", pagamento.processar());
    }

    @Test
    void deveEstornarCartao() {
        IPagamento pagamento = PagamentoFactory.obterPagamento("Cartao");
        assertEquals("Pagamento com cartao estornado", pagamento.estornar());
    }
}
