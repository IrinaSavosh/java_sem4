import java.util.LinkedList;

public class hw_41 {
   /*
    * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
    */
    public static void main(String[] args) {
          
      LinkedList<String> fruit = new LinkedList<String>();
      fruit.add("Apple");
      fruit.add("Orange");
      fruit.add("Mango");
      fruit.add("Pineapple");
      fruit.add("Banana");


      System.out.println(fruit);
      reverse(fruit);
      System.out.println();
      System.out.println(fruit);

    }

   public static LinkedList<String> reverse (LinkedList<String> array){
      for (int i = 0; i < array.size(); i++) {
         String element = array.getLast();
         array.removeLast();
         array.add(i, element);
      }
      return array;
   }

}
