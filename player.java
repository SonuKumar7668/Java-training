import java.util.Scanner;
class Cricket{
    int match,runs,wicket,catches;
    Cricket(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Data for cricket :-  ");
        System.out.println("Matches :-  ");
        match =sc.nextInt();
        System.out.println("Runs :-  ");
        runs =sc.nextInt();
        System.out.println("Wicket :-  ");
        wicket =sc.nextInt();
        System.out.println("Catches :-  ");
        catches =sc.nextInt();

    }
    void output(){
        System.out.println(" matches:- "+ match);
        System.out.println(" runs:- "+ runs);
        System.out.println(" wickets:- "+ wicket);
        System.out.println(" catches:- "+ catches);
    }
}
class Tennis{
    int matches,titles,grandslam;
    Tennis(){
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter data for Tennis ");
        System.out.println("Matches ");
        matches = sd.nextInt();
        System.out.println("Titles ");
        titles = sd.nextInt();
        System.out.println("GrandSlam ");
        grandslam = sd.nextInt();
    }
    void outp(){
        System.out.println(" matches:- "+ matches);
        System.out.println(" titles:- "+ titles);
        System.out.println(" grandslam:- "+ grandslam);
    }
}
class Football{
    int matches,goals;
    Football(){
        Scanner se = new Scanner(System.in);
        System.out.println("Enter data for Football ");
        System.out.println("Matches ");
        matches = se.nextInt();
        System.out.println("Goals");
        goals = se.nextInt();
    }
    void out(){
        System.out.println(" matches:- "+ matches);
        System.out.println(" goals:- "+ goals);
    }
}
public class player {
    public static void main(String args[]){
        Cricket cricket = new Cricket();
        Tennis tennis = new Tennis();
        Football football = new Football();
        cricket.output();
        tennis.outp();
        football.out();
    }
}