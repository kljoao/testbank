public class Conta{
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    
    
   public void deposita(double valor) {
    	this.saldo += valor;
    }
    
   public boolean sacar(double valor) {
    	if(valor >= this.saldo) {
    		System.out.println("Saldo insuficiente");
    		return false;
    	}
    	else {
    		this.saldo -= valor;
    		return true;
    	}
    }
   
   public boolean transfere(double valor, Conta destino) {
	   if(valor >= this.saldo) {
		   System.out.println("Saldo insuficiente");
		   return false;
	   }
	   else {
		   this.saldo -= valor;
		   destino.deposita(valor);
		   return true;
	   }
   }
   
   public double getSaldo() {
	   return this.saldo;
   }
   
   public int getNumero() {
	   return this.numero;
   }
   
   public void setNumero(int novoNumero) {
	   this.numero = novoNumero;
   }
   
   public int getAgencia() {
	return agencia;
   }
   
   public void setAgencia(int agencia) {
	this.agencia = agencia;
}
   
   public void setTitular(Cliente titular) {
	this.titular = titular;
   }
   
   public Cliente getTitular() {
	return titular;
}
}