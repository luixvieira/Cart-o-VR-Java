public class CartaoVr {

    String numero;
    String senha;
    double saldo;

    public CartaoVr(String numero, String senha, double saldo) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
    }

    public boolean validarSenha(String senha) {

        return this.senha.equals(senha)

    }
    public void debitar (double valor){
        if (valor <= saldo)
    {
        (saldo -= valor)
    } else { System.out.println("Valor indisponivel para saque");
        }
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}

