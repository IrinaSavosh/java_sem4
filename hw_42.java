import java.util.LinkedList;
import java.util.Queue;

public class hw_42 {
   /*
    * Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
enqueue() - dequeue() - first()
    */
   public static void main(String[] args){
      Queue<String> fruit = new LinkedList<String>();
      fruit.add("Apple");
      fruit.add("Orange");
      fruit.add("Mango");
      fruit.add("Pineapple");
      fruit.add("Banana");

      System.out.println(fruit);

      // fruit.enqueue("gfh");
      // System.out.println(fruit);
   }
}
