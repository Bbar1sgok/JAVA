import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int physics, math, turkish, chemistry, music, history;
        float average;

        System.out.println("Please enter your physics grade:");
        physics = input.nextInt();

        System.out.println("Please enter your math grade:");
        math = input.nextInt();

        System.out.println("Please enter your Turkish grade:"); 
        turkish = input.nextInt();

        System.out.println("Please enter your chemistry grade:"); 
        chemistry = input.nextInt();

        System.out.println("Please enter your music grade:"); 
        music = input.nextInt();

        System.out.println("Please enter your history grade:"); 
        history = input.nextInt();

        average = (float)(physics + math + turkish + chemistry + music + history) / 6; // Casting for more accurate average
        System.out.println("Your average grade is: " + average); 

        input.close();
    }
}
