import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Login:");
    String login = sc.next();
    int senhaAdmin = 12345;
    String login1  = "admin";

    if(login.equals("admin")) (
      System.out.println("coloque sua senha");
      int senha = sc.nextint(); 
    if(senha = senhaAdmin) (
      System.out.println("Acesso permitido!");
    ) else (
      System.out.println("Aceso negado!");
    )
  ) else (
      System.out.println("Acesso negado!");
    )
  ) else (
      System.out.println("Acesso inválido!");
  )
      sc.close();

    
    }