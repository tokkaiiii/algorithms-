package collection.array;

public class CustomArrayListMain {

  public static void main(String[] args) {
    CustomArrayList<Integer> list = new CustomArrayList<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(1, 4);


    System.out.println("list = " + list);
  }

}
