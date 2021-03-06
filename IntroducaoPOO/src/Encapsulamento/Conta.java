package Encapsulamento;

	public class Conta {
	
		/* 
		 modificadores java definem a visibilidade dos atributos/vari�iveis
		 private: somente a classe em que o atributo est� pode ver e modificar do atributo;
		 public: qualquer classe no sistema pode ver e modificar o atributo;
		 sem nada: Por padr�o o Java assume o modificador friendly quando n�o � especificado modificador no atributo, todas as classes do pacote pode ver e modificar o atributo;
		 */
		
		private String agencia;
		private String numeroConta;
		private Cliente cliente;
		private float saldo;
		private float valorSaque;
		
		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public String getNumeroConta() {
			return numeroConta;
		}

		public void setNumeroConta(String numeroConta) {
			this.numeroConta = numeroConta;
		}
		
		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public float getValorSaque() {
			return valorSaque;
		}

		public void setValorSaque(float valorSaque) {
			this.valorSaque = valorSaque;
		}

		public float getSaldo() {
			return saldo;
		}
		
		/*
		 metodos devem informar o modificador e o tipo de dado que ele retornar� seguindo a estrutura abaixo;
		 nome de metodo por defini��o sempre come�a com letra maiuscula;
		 parametro � uma informa��o externa que o metodo pode pode precisar para realziar a sua tarefa
		 deve ser informado o tipo do parametro
		 */
		

		public float Depositar(float valor) {
			saldo += valor; /* saldo += valor � o mesmo que saldo + valor */
			return saldo;
		};
		
		public boolean ValidarSaldo (float valorSaque) {
			if(valorSaque < saldo) {
				return true;			
			} else {
				return false;
			}
		};
		
		public float Sacar(boolean ValidarSaldo) {
			saldo -= valorSaque; /*saldo -= valorSaque � o mesmo que saldo = saldo - valorSaque*/
			return saldo;
		};
		
		// construtores
		
		public Conta() {
			this.cliente = new Cliente();
		}
		 
		@Override
		public String toString() {
			return "Conta [agencia=" + agencia + ", numeroConta=" + numeroConta + ", cliente=" + cliente + ", saldo="
					+ saldo + ", valorSaque=" + valorSaque + "]";
		}

		public Conta(String agencia, String numeroConta, String cpf) {
			this.cliente = new Cliente(cpf);
			this.agencia = agencia;
			this.numeroConta = numeroConta;
		}
	}

