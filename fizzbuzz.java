package algohour3.AH3;

public class fizzbuzz {

    public static void main(String[] args) {
        //fizzBuzz(15);
        fizzBuzzRecursive(1, 15);
    }

    static void fizzBuzz(int num) {
        for (int i = 1; i <= num; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }

    }

    static void fizzBuzzRecursive(int current, int num) {
        if (current > num)
        {
            return;
        }
        if (current % 3 == 0 && current % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (current % 5 == 0) {
            System.out.println("Buzz");
        } else if (current % 3 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(current);
        }

        fizzBuzzRecursive(current+1, num);
    }
}
