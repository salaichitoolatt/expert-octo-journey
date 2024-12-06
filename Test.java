class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // y = x - y; --> output is 00 11 21 32 42
      // y = y + x; --> output is 00 11 23 36 410
      
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}
