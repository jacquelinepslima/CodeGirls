package desafiosBasico;

import java.util.Scanner;

public class DominóDuplo {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n = leitor.nextInt();

    System.out.println((n + 1) * (n + 2) / 2);
  }
}
