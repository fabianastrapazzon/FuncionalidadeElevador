package pooExercicio03;

import java.util.Scanner;

public class Elevador {

	protected Scanner leitor;

	private int andarAtual = 0;
	private int qntPessoas = 0;
	private int totalPessoas;
	private int saiPessoa;

	private static final int QUANTIDADE_ANDARES = 10;
	private static final int CARGA_MAXIMA = 5;

	public Elevador() {
		super();
		leitor = new Scanner(System.in);
	}

	public Scanner getLeitor() {
		return leitor;
	}

	public void setLeitor(Scanner leitor) {
		this.leitor = leitor;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getQntPessoas() {
		return qntPessoas;
	}

	public void setQntPessoas(int qntPessoas) {
		this.qntPessoas = qntPessoas;
	}

	public int getTotalPessoas() {
		return totalPessoas;
	}

	public void setTotalPessoas(int totalPessoas) {
		this.totalPessoas = totalPessoas;
	}

	public int getSaiPessoa() {
		return saiPessoa;
	}

	public void setSaiPessoa(int saiPessoa) {
		this.saiPessoa = saiPessoa;
	}

	public static int getQuantidadeAndares() {
		return QUANTIDADE_ANDARES;
	}

	public static int getCargaMaxima() {
		return CARGA_MAXIMA;
	}

	public void inicializa() {
		System.out.println("Seja Bem-Vindo(a) ao Edifício Central" + "\nQuantidade de andares: " + getQuantidadeAndares()
				+ "\nCarga máxima do elevador: " + getCargaMaxima() + " pessoas" + "\nAndar atual: " + getAndarAtual()
				+ "\nQuantidade de pessoas presentes no elevador nesse momento: " + getQntPessoas());

		System.out.println();
	}

	public void entra() {
		System.out.println("Informe quantas pessoas vão entrara no elevador: ");
		setQntPessoas(leitor.nextInt());

		if ((getTotalPessoas() + getQntPessoas()) <= CARGA_MAXIMA) {

			setTotalPessoas(getTotalPessoas() + getQntPessoas());
			System.out.println("Entrada liberada!" + "\nSeja Bem-Vindo(a)");
			System.out.println("O número atual de pessoas dentro do elevador é de " + getTotalPessoas());
		} 
		else
			System.out.println("Capacidade máxima de carga atingida. Fica para a próxima!");
		System.out.println();
		
	}

	public void sai() {
		System.out.println("Informe quantas pessoas desejam sair do elevador: ");
		setSaiPessoa(leitor.nextInt());

		if (getSaiPessoa() > getTotalPessoas()) {
			System.out.println("Numero de pessoas que solicitaram a saida é maior que o número de pessoas dentro do elevador.");
			System.out.println("O número atual de pessoas dentro do elevador é de " + getTotalPessoas());	
		} 
		else 
		{
			setTotalPessoas(getTotalPessoas() - getSaiPessoa());
			System.out.println("Até logo! ");
			System.out.println("O número atual de pessoas dentro do elevador é de " + getTotalPessoas());
		}
		
		System.out.println();
	}

	public void sobe() {
		// como usar um forEach aqui? for (iterable_type iterable_element : iterable) {}
//		System.out.println("Informe o andar que deseja subir:");
//
//		for (int i = 0; i <= getQuantidadeAndares(); i++) {
//			System.out.println(i);
//			setSobeAndar(leitor.nextInt());}

		if (getAndarAtual() >= getQuantidadeAndares())

			System.out.println("Não existe anderes acima deste!");

		else {
			setAndarAtual(getAndarAtual() + 1);
			System.out.println("....\n....\nVocê chegou no andar " + getAndarAtual());
		}
		System.out.println();
	}

	public void desce() {
		if (getAndarAtual() <= 0)
			System.out.println("Não existe andares abaixo deste.");

		else {
			setAndarAtual(getAndarAtual() - 1);
			System.out.println("....\n....\nVocê chegou no andar " + getAndarAtual());
		}
		System.out.println();

	}

}
