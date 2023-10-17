package models;

public class ContaBancaria {
	private int id;
	private String nome;
	private double saldo;
	private String numeroConta;
	private String banco;
	private String descricaoConta;
	

	public ContaBancaria() {
		
	}
	// construtor
	public ContaBancaria(int id, String nome, double saldo, String numeroConta, String banco, String descricaoConta) {
		super();
		this.id = id;
		this.nome = nome;
		this.saldo = saldo;
		this.numeroConta = numeroConta;
		this.setBanco(banco);
		this.descricaoConta = descricaoConta;
	}

	// Método para depositar dinheiro na conta
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Deposito de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("O valor do deposito deve ser maior que zero.");
		}
	}

	// Método para sacar dinheiro na conta
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado com sucesso.");
		} else {
			System.out.println("Valor de saque invalido ou saldo insuficiente.");
		}
	}

	// Método para transferir dinheiro para outra conta
	public void transferir(ContaBancaria destino, double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
			System.out.println("Transferencia de R$" + valor + " para " + destino.getNome() + " realizada com sucesso.");
		} else {
			System.out.println("Valor de transferencia inválido ou saldo insuficiente.");
		}
	}


	@Override
	public String toString() {
		return "ContaBancaria [id=" + id + ", nome=" + nome + ", saldo=" + saldo + ", numeroConta=" + numeroConta
				+ ", banco=" + banco + ", descricaoConta=" + descricaoConta + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getDescricaoConta() {
		return descricaoConta;
	}

	public void setDescricaoConta(String descricaoConta) {
		this.descricaoConta = descricaoConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

}
