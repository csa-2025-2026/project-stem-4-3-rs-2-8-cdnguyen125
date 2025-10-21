import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here

    // Problem 1
    for (int num = 1; num <=25; num++)
    {
      if (num % 2 == 1)
      {
        System.out.println(num);
      }
    }

    // Problem 2
    System.out.println("");
    int count = 0;
    for (int numbers = 17; numbers <= 73; numbers++)
    {
      if (count % 10 != 0)
      {
        System.out.print(numbers + " ");
        count++;
      }
      else
      {
        System.out.print("\n" + numbers + " ");
        count++;
      }
      
    }
    System.out.println("\n");


  }
}
