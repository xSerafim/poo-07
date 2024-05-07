package Controller;

import java.util.ArrayList;

import Model.Prova;

public class ProvaController implements IAvaliacaoController<Prova> {
  ArrayList<Prova> provas;

  public ProvaController() {
    this.provas = new ArrayList<>();
  }

  @Override
  public void cadastrar(Prova obj) {
    this.provas.add(obj);
  }

  @Override
  public void remover(Prova obj) {
    this.provas.remove(obj);
  }

  @Override
  public Prova buscarPorIndex(int index) {
    return this.provas.get(index);
  }

  @Override
  public void limparLista() {
    this.provas.clear();
  }
}
