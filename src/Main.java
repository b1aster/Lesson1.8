public class Main {
    public static void main(String[] args) {

        // Задача 1
        int [] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float [] weights = {21.4f, 23.f, 32.1f};
        char [] message = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

        // Задача 2
        for (int idx = 0; idx < numbers.length; idx++){

            if (idx > 0 && idx < numbers.length)
                System.out.print(", ");

            System.out.print(numbers[idx]);
        }

        System.out.println();

        for (int idx = 0; idx < weights.length; idx++){

            if (idx > 0 && idx < weights.length)
                System.out.print(", ");

            System.out.printf("%.2f", weights[idx]);
        }

        System.out.println();

        int idx = 0;
        for (char ch : message){

            if (idx > 0 && idx < message.length)
                System.out.print(", ");

            System.out.print(ch);
            idx++;
        }
    }
}