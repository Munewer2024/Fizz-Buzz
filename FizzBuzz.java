
public class FizzBuzz
{
    public void run() {
        int a = 3;
        int b = 5;
        int c = 15;
        for (int i = 1; i <= 100; i++) {
            if (i == c) {
                a += 3;
                b += 5;
                c += 15;
                System.out.println("FizzBuzz");
            } else if (i == a) {
                a += 3;
                System.out.println("Fizz");
            } else if (i == b) {
                b += 5;
                System.out.println("Buzz");
            } else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
