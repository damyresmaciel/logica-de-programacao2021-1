package logica.programacao.ap1;

public class Questao07 {

  public static void main(String[] args) {

    int num = 14;

    boolean primo = true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        System.out.println("Nao é primo - divisível por " + i);
        primo = false;

      }
    }
    if (primo) {
      System.out.println("Primo");

    }
  }
}
