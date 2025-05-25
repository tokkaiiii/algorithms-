package collection.array.problem;

import java.util.Arrays;

// 하나의 원소를 다른 원소들과 비교해서 최대값인지 분석
public class ArrayProblem1 {

  public static void main(String[] args) {
//    int maxNumber1 = ArrayUtil.findMaxNumber1(new int[]{4, 2, 3, 1, 5, 10});
//    int maxNumber2 = ArrayUtil.findMaxNumber2(new int[]{4, 2, 3, 1, 5, 10});
//
//    System.out.println("Max Number 1: " + maxNumber1);
//    System.out.println("Max Number 2: " + maxNumber2);

    String text = "abacabadabacabazzzzzzzzzzzzzzzz";

    String maxOccurredAlphabet = ArrayUtil.findMaxOccurredAlphabet(text);
    System.out.println("Max Occurred Alphabet: " + maxOccurredAlphabet);
  }

}
