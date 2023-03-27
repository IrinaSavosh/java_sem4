
import java.util.LinkedList;
import java.util.Scanner;

public class hw_43 {
   // /*
   // * В калькулятор добавьте возможность отменить последнюю операцию.
   // * Пример
   // *
   // * 1
   // * +
   // * 2
   // * ответ:
   // * 3
   // *
   // * +
   // * 4
   // * ответ:
   // * 7
   // *
   // * Отмена
   // * 3
   // *
   // * 3
   // *
   // * ответ:
   // * 9
   // *
   // * Пример 2
   // * Ввод: 1
   // * Ввод: +
   // * Ввод: 2
   // * Вывод: 3
   // * Ввод:+
   // * Ввод:4
   // * Вывод 7
   // * Ввод:*
   // * Ввод:3
   // * Вывод 21
   // * Отмена
   // * Вывод 7
   // * Отмена
   // * Вывод 3
   // * Ввод:-
   // * Ввод:1
   // * Вывод 2
   // *
   // * Дополнительно каскадная отмена - отмена нескольких операций
   // */
   public static void main(String[] args) {
      LinkedList<Double> calculator = new LinkedList<Double>();
      Scanner in = new Scanner(System.in);
      System.out.print("Введите число: ");
      Double n = in.nextDouble();
      System.out.println("На любом шаге ввода можете ввести s (остановка программы), c (отмена последней операции)");
      while (true) {
         System.out.print("Введите символ +, -, * или /: ");
         String symbol = in.next(); // toString();
         if (symbol.equals("s")) {
            break;
         }
         if (symbol.equals("c")) {
            if (calculator.size() > 0) {

               cancel(calculator);
               System.out.println("Отменена последняя операция\n Предыдущее значение: " + n + "\n");
               continue;
            } else {
               System.out.println("Невозможно вернуться к предыдущему значению - значение отсутствует в памяти");
               continue;
            }
         }

         System.out.print("Введите число: ");

         String m = in.next();
         if (m.equals("s")) {
            break;
         }
         if (m.equals("c")) {
            if (calculator.size() > 0) {

               cancel(calculator);
               System.out.println("Отменена последняя операция\n Предыдущее значение: " + n + "\n");
               continue;
            } else {
               System.out.println("Невозможно вернуться к предыдущему значению - значение отсутствует в памяти");
               continue;
            }
         }

         Double res = result(n, symbol, Double.parseDouble(m));
         System.out.println(res);
         n = res;
         calculator.addLast(n);
         System.out.println(calculator);

      }
      in.close();
   }

   public static Double result(Double one, String symbol, Double two) {
      Double res = 0.0;
      if (symbol.equals("+")) {
         res = one + two;
      } else if (symbol.equals("-")) {
         res = one - two;
      } else if (symbol.equals("*")) {
         res = one * two;
      } else if (symbol.equals("/")) {
         if (one % two == 0) {
            res = one / two;
         } else {
            // res = (double) res;
            res = one / two;
         }
      } else {
         System.out.println("Вы ввели что-то не то. Результат будет 0");
      }
      return res;
   }

   public static LinkedList<Double> cancel(LinkedList<Double> array) {
      array.removeLast();
      return array;

   }
}
