package pooExercicio03;

public class LerDados extends Elevador {

	private int escolhaDoMenu;

	Elevador elevador = new Elevador();

	public int getEscolhaDoMenu() {
		return escolhaDoMenu;
	}

	public void setEscolhaDoMenu(int escolhaDoMenu) {
		this.escolhaDoMenu = escolhaDoMenu;
	}

	public void Menu() {

		while (getEscolhaDoMenu() != 5) {
		System.out.println("Escolha uma das opções do MENU" + "\n1 - Entrar" + "\n2 - Sai" + "\n3 - Sobe"
				+ "\n4 - Desce" + "\n5 - Parar");
		setEscolhaDoMenu(leitor.nextInt());
		
		System.out.println();

			switch (getEscolhaDoMenu()) {

			case 1:
				elevador.entra();
				break;
			case 2:
				elevador.sai();
				break;
			case 3:
				elevador.sobe();
				break;
			case 4:
				elevador.desce();
				break;

			}
		}
		System.out.println("Execução encerrada!");
	}

}
