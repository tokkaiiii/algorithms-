package collection.array;

import java.util.Arrays;

/**
 * 첫 번째 index에 값을 추가하는 예제입니다.
 */
public class ArrayAddMain {

  public static void main(String[] args) {
    final int[] arr = {1, 2, 0, 0, 0};

    int newValue = 10; // 추가할 값
    addFirst(arr, newValue);

    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
  }

  private static void addFirst(int[] arr, int newValue) {
    for (int index = arr.length - 1; index > 0; index--) {
      arr[index] = arr[index - 1];
    }

    arr[0] = newValue; // 첫 번째 index에 값을 추가합니다.
  }
}
