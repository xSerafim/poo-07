package Model;

public class Prova {
  private int numeroQuestoes;
  private float mediaNota;

  public Prova(int numeroQuestoes, float mediaNota) {
    this.numeroQuestoes = numeroQuestoes;
    this.mediaNota = mediaNota;
  }

  public int getNumeroQuestoes() {
    return numeroQuestoes;
  }

  public void setNumeroQuestoes(int numeroQuestoes) {
    this.numeroQuestoes = numeroQuestoes;
  }

  public float getMediaNota() {
    return mediaNota;
  }

  public void setMediaNota(float mediaNota) {
    this.mediaNota = mediaNota;
  }
}
