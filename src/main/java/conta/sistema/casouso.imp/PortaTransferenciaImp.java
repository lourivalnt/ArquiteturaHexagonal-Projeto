package conta.sistema.casouso.imp;

import conta.sistema.casouso.porta.PortaTransferencia;
import conta.sistema.dominio.modelo.Conta;
import conta.sistema.dominio.servico.Transferencia;
import conta.sistema.porta.ContaRepositorio;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

import static conta.sistema.dominio.modelo.Erro.*;
import static java.util.Objects.isNull;

// Responsável por implementar a porta de operações para caso de uso de transferencia.
// Sera gerenciado pelo IoC
@Named
public class PortaTransferenciaImp implements PortaTransferencia {

    @Override
    public Conta getConta(Integer numero) {
        return null;
    }

    @Override
    public void transferir(Integer contaDebito, Integer contaCredito, BigDecimal valor) {

    }
}
