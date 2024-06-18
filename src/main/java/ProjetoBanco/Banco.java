package ProjetoBanco;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Banco {
    private List<Cliente> clientes;
    private List<Conta> contas;


    public Banco() {
        this.clientes = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }


}

