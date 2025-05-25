package collection.array.utils;

import java.util.Arrays;

/**
 * 배열에 값을 추가하는 예제입니다.
 * 배열의 크기는 고정되어 있으므로, 기존 값들을 오른쪽으로 이동시켜야 합니다.
 *
 * addFirst: 배열의 첫 번째 인덱스에 값을 추가합니다.
 * addAtIndex: 주어진 인덱스에 값을 추가합니다.
 * addLast: 배열의 마지막 인덱스에 값을 추가합니다.
 */
public class ArrayAddMain {

  public static void main(String[] args) {
    final int[] arr = {1, 2, 0, 0, 0};

    int newValue = 10; // 추가할 값
    addFirst(arr, newValue);

    // index

    int newValue2 = 20; // 추가할 값
    int index = 2; // 추가할 index
    addAtIndex(arr, index, newValue2);

    addLast(arr, newValue);
    System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
  }

  /**
   * 배열의 마지막 인덱스에 새로운 값을 추가합니다.
   * 배열의 크기는 고정되어 있으므로, 기존 값들을 오른쪽으로 이동시켜야 합니다.
   *
   * @param arr       값을 추가할 배열
   * @param newValue  추가할 값
   */
  private static void addLast(int[] arr, int newValue) {
    arr[arr.length - 1] = newValue;
  }

  /**
   * 주어진 배열의 특정 인덱스에 새로운 값을 추가합니다.
   * 배열의 크기는 고정되어 있으므로, 기존 값들을 오른쪽으로 이동시켜야 합니다.
   *
   * @param arr       값을 추가할 배열
   * @param addIndex  값을 추가할 인덱스
   * @param newValue  추가할 값
   */ 
  private static void addAtIndex(int[] arr, int addIndex, int newValue) {
    for (int index = arr.length - 1; index > addIndex; index--) {
      arr[index] = arr[index - 1];
    }

    arr[addIndex] = newValue;
  }

  /**
   * 배열의 첫 번째 인덱스에 새로운 값을 추가합니다.
   * 내부적으로 addAtIndex 메서드를 호출합니다.
   *
   * @param arr       값을 추가할 배열
   * @param newValue  추가할 값
   */
  private static void addFirst(int[] arr, int newValue) {
    addAtIndex(arr, 0, newValue);
  }
}
