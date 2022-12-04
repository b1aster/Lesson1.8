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

        int ct = 0;
        for (char ch : message){

            if (ct > 0 && ct < message.length)
                System.out.print(", ");

            System.out.print(ch);
            ct++;
        }

        // Разделитель
        System.out.println("\n");

        // Задача 3
        for (int idx = numbers.length-1; idx >= 0; idx--){

            System.out.print(numbers[idx]);

            if (idx > 0 && idx < numbers.length)
                System.out.print(", ");
        }

        System.out.println();

        for (int idx = weights.length-1; idx >= 0; idx--){

            System.out.print(weights[idx]);

            if (idx > 0 && idx < weights.length)
                System.out.print(", ");
        }

        System.out.println();

        for (int idx = message.length-1; idx >= 0; idx--){

            System.out.print(message[idx]);

            if (idx > 0 && idx < message.length)
                System.out.print(", ");
        }

        // Разделитель
        System.out.println("\n");

        // Задача 4
        for (int idx = 0; idx < numbers.length; idx++){

            if (numbers[idx] % 2 != 0)
                numbers[idx] += 1;

            if (idx > 0 && idx < numbers.length)
                System.out.print(", ");

            System.out.print(numbers[idx]);
        }

    }
}