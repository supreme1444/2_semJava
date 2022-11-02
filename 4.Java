import java.util.logging.Logger;
import java.util.Scanner;
class Calculator {
   public static void main(String[] args) 
   {
      Logger logger = Logger.getAnonymousLogger();
      double num1;
      double num2;
      double summ;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.print("Введите две цифры");
      num1 = reader.nextDouble();
      num2 = reader.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = reader.next().charAt(0);
      reader.close();
      if (op == '+') 
      {
        summ = num1 + num2;
        logger.info("Результат вычисления "+ summ);
        System.out.print(summ);
      }
      if (op == '-') 
      {
        summ = num1 - num2;
        logger.info("Результат вычисления "+ summ);
        System.out.print(summ);
      }
      if (op == '*') 
      {
        summ = num1 * num2;
        logger.info("Результат вычисления "+ summ);
        System.out.print(summ);
      }
      if (op == '/') 
      {
        summ = num1 / num2;
        logger.info("Результат вычисления "+ summ);
        System.out.print(summ);
        
      }   
      
   }
    
       
}
