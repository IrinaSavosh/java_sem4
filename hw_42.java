import java.util.LinkedList;
import java.util.Scanner;

public class hw_42 {
   /*
    * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
enqueue() - dequeue() - first()
    */
   public static void main(String[] args){
      LinkedList<String> fruits = new LinkedList<String>();
      fruits.add("Apple");
      fruits.add("Orange");
      fruits.add("Mango");
      fruits.add("Pineapple");
      fruits.add("Banana");

      System.out.println(fruits);

      String fruit = dequeue(fruits);
      System.out.println(fruit);
      System.out.println(fruits);

      enqueue(fruits);
      System.out.println(fruits);

      fruit = first(fruits);
      System.out.println(fruit);
      System.out.println(fruits);
   }
   public static LinkedList<String> enqueue (LinkedList<String> array){
      Scanner scan = new Scanner(System.in);
      System.out.println("Введите название фрукта: ");
      String new_word = scan.nextLine();
     
      array.addLast(new_word);
      scan.close();
      return array;

   }

   public static String dequeue (LinkedList<String> array){
      String word = array.removeFirst();   
      array.removeFirst();
      return word;
   }

   public static String first (LinkedList<String> array){
      String word = array.getFirst();   
      return word;
   }
}
