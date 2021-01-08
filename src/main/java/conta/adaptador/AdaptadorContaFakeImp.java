package conta.adaptador;

import conta.sistema.dominio.modelo.Conta;
import conta.sistema.dominio.modelo.NegocioException;
import conta.sistema.porta.ContaRepositorio;

import javax.inject.Named;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static java.util.Objects.isNull;

// Responsável por implementar a porta de saída (driven) de serviços de banco de dados falso.
// Sera gerenciado pelo IoC
@Named
public class AdaptadorContaFakeImp implements ContaRepositorio {

    @Override
    public Conta get(Integer numero) {
        return null;
    }

    @Override
    public void alterar(Conta conta) {

    }
}
