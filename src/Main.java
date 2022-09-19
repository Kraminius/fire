import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tal, sum, test, test2;
        tal = 0;
        sum = 0;
        test = 40;
        test2 = 50;

        /*
        //print alle tal mellem 0 og 100
        while (tal <= 100) {
            System.out.println(tal);
            tal++;
        }

        //print alle hele tal mellem 0 og 100 (tal%2==0 er alle lige tal (kan deles med 2))
        for (tal=0; tal<=100; tal++) {
            if (tal%2==0) {
                System.out.println(tal);
            }
        }
        //Print alle tal mellem 0 og 100 ved at tilføre værdien til /"sum/"
        for (tal=0; tal<=100; tal++) {
            sum += tal;
        }
        System.out.println("Summen af alle tal mellem 0 og 100 er: " + sum);

        //4.1 quizzen er lavet 18/18 rigtige.

        //Opgave 4.2, Ændr programmet fra 3.3, så programmet bliver ved med at bede om et password, indtil brugeren har indtastet et korrekt et.
        Scanner input = new Scanner(System.in);
        String password, test;
        int count;
        System.out.println("Indtast password mellem 5 og 8 cifre langt: ");
        password = input.next();
        while (password.length() < 100) {
            if (password.length() > 4 && password.length() < 9) {
                System.out.println("Tak for passworded muhahahaha: ");
                System.exit(0); }
            else if (password.length() > 8) {
                System.out.println("Indtast et password på mellem 5 og 8 cifre: ");
                password = input.next();
            }
            else {
                System.out.println("Indtast et password på mellem 5 og 8 cifre: ");
                password = input.next();

            }
        }

        //4.3 Dyrelyde
         Scanner input = new Scanner(System.in);
         System.out.println("Indtast et dyr, for at få dyrelyden ");
         String dyrelyd = input.next();
         String dyrelydlille = dyrelyd.toLowerCase();

         switch (dyrelydlille) {
             case "dog":
                 System.out.println("Woof Woof:");
                 break;
             case "cat":
                 System.out.println("Meow motherfucker");
                 break;
             case "fish":
                 System.out.println("blob?? siger fisk blob??!?!?");
                 break;
             case "cow":
                 System.out.println("muuh muuh mf");
                 break;
             case "lion":
                 System.out.println("Roar roar");
                 break;
             case "sheep":
                 System.out.println("meehehhhhhhhh meeeeeehhhh");
                 break;
             case "duck":
                 System.out.println("quack quack");
                 break;
             case "fox":
                 System.out.println("Ring-ding-ding-ding-dingeringeding!" + "\n" +
                         "Gering-ding-ding-ding-dingeringeding!" + "\n" +
                         "Gering-ding-ding-ding-dingeringeding!" + "\n" + "Wa-pa-pa-pa-pa-pa-pow!" + "\n" +
                         "Wa-pa-pa-pa-pa-pa-pow!" + "\n" +
                         "Wa-pa-pa-pa-pa-pa-pow!" + "\n" + "Hatee-hatee-hatee-ho!" + "\n" +
                         "Hatee-hatee-hatee-ho!" + "\n" +
                         "Hatee-hatee-hatee-ho!" + "\n" + "Joff-tchoff-tchoffo-tchoffo-tchoff!" +
                         "Tchoff-tchoff-tchoffo-tchoffo-tchoff!" + "\n" +
                         "Joff-tchoff-tchoffo-tchoffo-tchoff!" + "\n" + "Jacha-chacha-chacha-chow!" + "\n" +
                         "Chacha-chacha-chacha-chow" + "\n" +
                         "Chacha-chacha-chacha-chow!" + "\n" + "Fraka-kaka-kaka-kaka-kow!" + "\n" +
                         "Fraka-kaka-kaka-kaka-kow!" + "\n" +
                         "Fraka-kaka-kaka-kaka-kow!" + "\n" + "A-hee-ahee ha-hee!" + "\n" +
                         "A-hee-ahee ha-hee!" + "\n" +
                         "A-hee-ahee ha-hee!" + "\n" + "A-oo-oo-oo-ooo!" + "\n" +
                         "Woo-oo-oo-ooo!");
                 break;
             default:
                 System.out.println("??????");

             }


        Scanner input = new Scanner(System.in);
        char bogstav;
        System.out.println("Indtast et tegn");
        bogstav = input.nextLine().charAt(0);

        if (Character.isUpperCase(bogstav)){
            System.out.println("Tegnet er et stort bogstav");
        }
        else if (Character.isLowerCase(bogstav)) {
            System.out.println("Tegnet er et lille bogstav"); }
        else if (Character.isDigit(bogstav)) {
            System.out.println("Tegnet er et tal: ");
        }
        else {
            System.out.println("Tegnet er et specialtegn ");
        }
        */
        Scanner input = new Scanner(System.in);
        int xin, x;
        xin = input.nextInt();

        for (x=0; x <= xin; x++) {
            for (int y = 0; y < x; y++) {
            System.out.print("tis ");

        }
        System.out.println();

        }}}