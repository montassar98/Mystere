import java.util.*;
import java.lang.System.*;
public class Mystere {


    public static void main(String[] args) {
        System.out.println("Niveau 1 : Facile -> Le mystère est un nombre entre 0 et 100\n" +
                "• Niveau 2 : Moyen -> Le mystère est un nombre entre 0 et 10000\n" +
                "• Niveau 3 : Difficile -> Le mystère est composé par un nombre entre 10 et 100\n" +
                "et un caractère.");
        int niveau;Scanner sc = new Scanner(System.in);

        do {
            System.out.println("choisir le niveau");
            niveau = sc.nextInt();


            switch(niveau) {
                case 1:
                    niveau1();
                    break;
                case 2:
                    niveau2();
                    break;
                case 3:
                    niveau3();
                    break;
                default:
                    System.out.println("donner un niveau valide");
                    break;
            }}while(niveau>3||niveau<1);
        }

    private static void niveau1() {
        System.out.println("niveau 1");
        int x= (int) (Math.random() * 100 );
        System.out.println(x);
        int count = 0;
        boolean isFound=false;

        do {
            System.out.println("ecrivez le nombre");
            Scanner n =new Scanner(System.in);
            int value = n.nextInt();
            count++;
            if(value<x){
                System.out.println("c'est moins, il vous reste "+(15-count)+" tentative");


            }
            else if(value>x){
                System.out.println("c'est plus, il vous reste "+(15-count)+" tentative");
            }
            else {
                System.out.println("Bravo! vous avez gagne au bout "+(15-count)+" tentatives");
                isFound=true;
            }

            if (count == 15){
                System.out.println("tu as perdu");
                return;
            }

        }while (count<15&&!isFound);
    }

    private static void niveau2() {
        System.out.println("niveau 2");
        int x= (int) (Math.random() * 10000);
        int count = 0;
        boolean isFound=false;

        do {

            System.out.println("ecrivez le nombre");
            Scanner n =new Scanner(System.in);
            int value = n.nextInt();
            count++;
            if(value<x){
                System.out.println("c'est moins, il vous reste "+(10-count)+" tentative");


            }
            else if(value>x){
                System.out.println("c'est plus, il vous reste "+(10-count)+" tentative");
            }
            else {
                System.out.println("Bravo! vous avez gagne au bout "+(10-count)+" tentatives");
                isFound=true;
            }

            if (count == 10){
                System.out.println("tu as perdu");
                return;
            }

        }while (count<10&&!isFound);

    }

    private static void niveau3() {
        System.out.println("niveau 3");
        int x= (int) ((Math.random() * (100 - 10)) + 10);
        Random rnd = new Random();
        char c = (char) ('a' + rnd.nextInt(26));
        int count = 0;
        System.out.println(""+c+" "+x);
        boolean isNumberFound=false;
        boolean isCharFound=false;
        do {
            Scanner n =new Scanner(System.in);
            System.out.println("ecrivez le nombre");
            int value = n.nextInt();
            System.out.println("ecrivez le caractere");
            char ch = n.next().charAt(0);
            count++;
            if(value<x){
                System.out.println("c'est moins pour le nombre");
            }
            else if(value>x){
                System.out.println("c'est plus pour le nombre");
            }
            else {
                System.out.println("le nombre est correct : "+value);
                isNumberFound=true;
            }
            if(ch<c){
                System.out.println("le caractere apres");
            }
            else if(ch>c){
                System.out.println("le caractere avant");
            }else {
                System.out.println("le caractere est correct : "+ch);
                isCharFound=true;
            }

            if (isCharFound&& isNumberFound){
                System.out.println("Bravo! vous avez gagne au bout "+(10-count)+" tentatives");
            }

            if (count == 10){
                System.out.println("tu as perdu");
                return;
            }

        }while (count<10&&(!isNumberFound||!isCharFound));


    }


}