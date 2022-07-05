import java.util.List;

public class Banco {
    private String nome;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.util.List<Cliente> getCliente() {
        return clientes;
    }

    public void setClientes(java.util.List<Cliente> clientes) {
        this.clientes = clientes;
    }

    protected void imprimirClientes(){

        System.out.println(String.format("Nossos Clientes: %s", this.clientes));

    }
}
