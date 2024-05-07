package Model;

public class Atividade {
  private char[] assunto;
  private int numeroPaginas;

  public Atividade(char[] assunto, int numeroPaginas) {
    this.assunto = assunto;
    this.numeroPaginas = numeroPaginas;
  }

  public char[] getAssunto() {
    return assunto;
  }

  public void setAssunto(char[] assunto) {
    this.assunto = assunto;
  }

  public int getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(int numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }
}
