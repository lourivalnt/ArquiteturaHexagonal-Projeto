package teste.unidade.dominio.modelo;

import conta.sistema.dominio.modelo.Conta;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@DisplayName("Regra de Debito de Conta")
public class TesteDebitoConta {

    // armazena o saldo para teste ficar dinamico
    BigDecimal cem = new BigDecimal(100);
    Conta contaValida;

    @BeforeEach
    void prepara() {
        contaValida = new Conta(1, cem, "Rebeca");
    }

}
