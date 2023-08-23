package com.thealgorithms.maths.code;

/*
 * Algorithm explanation:
 * https://technotip.com/6774/c-program-to-find-generic-root-of-a-number/#:~:text=Generic%20Root%3A%
 * 20of%20a%20number,get%20a%20single%2Ddigit%20output.&text=For%20Example%3A%20If%20user%20input,%
 * 2B%204%20%2B%205%20%3D%2015.
 */
public class GenericRoot {



  public static int genericRoot(int n) {
    int root = 0;
    while (n > 0 || root > 9) {
      if (n == 0) {
        n = root;
        root = 0;
      }
      root += n % 10;
      n /= 10;
    }
    return root;
  }
  
}