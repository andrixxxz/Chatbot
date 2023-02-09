import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sveicināti, programmēšanas skolā!");
        System.out.println("Es varu jums palīdzēt ar šādiem jautājumiem:");
        System.out.println("1.Kādi kursi tiek piedāvāti");
        System.out.println("2.Kad pieejami nākamie kursi");
        System.out.println("3.Kādas ir kursu cenas");
        System.out.println("Izvēlies jautājumu norādot 1, 2 vai 3");
        System.out.println("Ja vēlies čatu aizvērt, izvēlies 0");

        while (true){

            int usr_izvēle = scanner.nextInt();

            if (usr_izvēle == 1) {
                System.out.println("Piedāvājam Java, Javascript un SQL kursus");
            } else if (usr_izvēle == 2){
                System.out.println("Nākamie kursi pieejami sākot ar 14. Februāri vai 28. Februāri");
            } else if (usr_izvēle == 3){
                System.out.println("Kursi notiek par brīvu");
            }else if(usr_izvēle > 3){
                System.out.println("Neatpazīta izvēle, izvēlies jautājumus norādot 1, 2 vai 3");
            } if (usr_izvēle == 0)
                break;

        }
        System.out.println("Veiksmīgu dienu!");

    }
}



