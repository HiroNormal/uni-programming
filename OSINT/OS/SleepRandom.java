public class SleepRandom {
   public static void main(String [] args) throws Exception {
    int n = (int) (Math.random() * 5001);
    System.out.println("The random number is " + n);
    Thread.sleep(n);
    System.out.println("The sleep is done");
  }
}
