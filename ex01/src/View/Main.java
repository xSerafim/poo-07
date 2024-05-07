package View;

import Controller.AtividadeController;
import Controller.ProvaController;
import Model.Atividade;
import Model.Prova;

public class Main {
  public static void main(String[] args) {
    ProvaController provaController = new ProvaController();
    AtividadeController atividadeController = new AtividadeController();

    populaAvaliacao(provaController);
    populaAvaliacao(atividadeController);

    System.out.println("Numero questões prova 1: " + provaController.buscarPorIndex(0).getNumeroQuestoes());
    System.out.println("Media nota prova 1: " + provaController.buscarPorIndex(0).getMediaNota());

    System.out.println("Assunto atividade 1: " + new String(atividadeController.buscarPorIndex(0).getAssunto()));
    System.out.println("Numero paginas atividade 1: " + atividadeController.buscarPorIndex(0).getNumeroPaginas());

    provaController.limparLista();
    atividadeController.limparLista();

    try {
      System.out.println("Numero questões prova 1:" + provaController.buscarPorIndex(0).getNumeroQuestoes());
    } catch (Exception e) {
      System.out.println("lista vazia");
    }
  }

  public static void populaAvaliacao(ProvaController provaController) {
    for (int i = 0; i < 10; i++) {
      provaController.cadastrar(new Prova((int) (Math.random() * 100), (float) (Math.random() * 10.01)));
    }
  }

  public static void populaAvaliacao(AtividadeController atividadeController) {
    for (int i = 0; i < 10; i++) {
      atividadeController.cadastrar(new Atividade("abc".toCharArray(), (int) (Math.random() * 100)));
    }
  }
}
