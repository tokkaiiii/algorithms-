package collection.array.problem;

public abstract class ArrayUtil {

  private ArrayUtil() {
  }

  public static int findMaxNumber1(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Array must not be null or empty");
    }
    int maxNumber = array[0];
    for (int target : array) {
      if (target > maxNumber) {
        maxNumber = target;
      }
    }
    return maxNumber;
  }

  public static int findMaxNumber2(int[] array) {
    if (array == null || array.length == 0) {
      throw new IllegalArgumentException("Array must not be null or empty");
    }

    boolean isMax = false;
    for (int source : array) {
      for (int target : array) {
        isMax = source >= target;
      }
      if (isMax) {
        return source; // source가 모든 target보다 크거나 같으면 최대값}
      }
    }
    throw new IllegalArgumentException("Array must not be null or empty");
  }

  public static String findMaxOccurredAlphabet(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("String must not be null or empty");
    }

    int[] count = new int[26]; // Assuming only lowercase letters a-z
    for (char c : str.toCharArray()) {
      if (c >= 'a' && c <= 'z') {
        count[c - 'a']++;
      }
    }

    int maxCount = 0;
    char maxChar = 'a';
    for (int i = 0; i < count.length; i++) {
      if (count[i] > maxCount) {
        maxCount = count[i];
        maxChar = (char) ('a' + i);
      }
    }
    return String.valueOf(maxChar);
  }
}
