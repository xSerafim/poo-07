package Controller;

public interface IAvaliacaoController<T> {
  public void cadastrar(T obj);

  public void remover(T obj);

  public T buscarPorIndex(int index);

  public void limparLista();
}