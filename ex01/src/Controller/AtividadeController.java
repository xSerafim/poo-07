package Controller;

import java.util.ArrayList;

import Model.Atividade;

public class AtividadeController implements IAvaliacaoController<Atividade> {
  private ArrayList<Atividade> atividades;

  public AtividadeController() {
    this.atividades = new ArrayList<>();
  }

  @Override
  public void cadastrar(Atividade obj) {
    this.atividades.add(obj);
  }

  @Override
  public void remover(Atividade obj) {
    this.atividades.remove(obj);
  }

  @Override
  public Atividade buscarPorIndex(int index) {
    return this.atividades.get(index);
  }

  @Override
  public void limparLista() {
    this.atividades.clear();
  }
}
