import java.util.Random;

public class RandomPrograme {
    public static void main(String[] args) {

        Random random = new Random();


        int randNum = random.nextInt(100001)+11;

        String randomStr = Integer.toString(randNum);

        int sumNumber = 0;

        for (int i = 0; i < randomStr.length(); i++) {

            int test = Character.getNumericValue(randomStr.charAt(i));

            sumNumber += test;

        }

        System.out.println("Random number = " + randNum);

        System.out.println("ad = " + sumNumber);

    }

}
