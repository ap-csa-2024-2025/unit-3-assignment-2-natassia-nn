import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    //Problem 1
    System.out.println("Please enter a double");
    double N = sc.nextDouble();
    if (N == 12.345)
    {
      System.out.println("YES");
    }
    
    //Problem 2
    System.out.println("Please enter an integer:");
    int num = sc.nextInt();
    if (num == 48)
    {
      System.out.println("YES");
    }

    //Problem 3
    System.out.println("Please enter two integers:");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    if (n2 == 2*n1)
    {
      System.out.println("YES");
    }

    //Problem 4
    System.out.println("Please enter an integer:");
    int div = sc.nextInt();
    if (div%2 == 0)
    {
      System.out.println("Divisible by 2!");
    }
    if (div%3 == 0)
    {
      System.out.println("Divisible by 3!");
    }

    //Problem 5
    System.out.println("Please enter an integer");
    int num1 = sc.nextInt();
    if (num1%2 == 0)
    {
      System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }

    //Problem 6
    System.out.println("Please enter a letter grade:");
    String letter = sc.nextLine();
    if (letter.equals("A"))
    {
      System.out.println("90-100");
    }
    else if (letter.equals("B"))
    {
      System.out.println("80-90");
    }
    if (letter.equals("C"))
    {
      System.out.println("70-80");
    }
    else if (letter.equals("D"))
    {
      System.out.println("60-70");
    }
    
  }
}
