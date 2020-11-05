import java.util.Scanner;
public class ScoreTally
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to 10-pin Bowling!");
        Scanner keyinput = new Scanner(System.in);//declaring variables
        int score=0;
        int score2=0;
        int pins=10;
        int pinsdown=0;
        int round=1;
        int strike=0;
        int finalscore=0;
        int turkeycount=0;
        int turkey=0;
        int spare =0;
        int combo=0;
        int combo2=0;
        // an overwhelming amount of variables I don't remember what they do anymore
        for(int i = 0; i < 10; i++)//score loop.work
        {
            System.out.println("round "+ round);
            System.out.println("enter your pins down with the first ball");
            score = keyinput.nextInt();//first ball input

            while (score > 10)//error message, for when the score is above 10
            {
                System.out.println("error, you can only have up to 10 pts.");
                score = keyinput.nextInt();
            }

            if (score == 10)//strike counter, along with the unfinished scoring count.
            {
                System.out.println("Strike!");
                turkeycount++;
                strike++;
                combo = combo + 20;
                score2=0;
                round++;
            }

            else if (score < 10)//for the second ball
            {
                turkeycount = 0;
                System.out.println("enter your pins down with the second ball");
                score2 = pins - score;
                pinsdown = keyinput.nextInt();//pins down would be deducted from the total left for the score.

                while (pinsdown > score2)//error message when there are more pins knocked down.
                {
                    System.out.println("error, you cannot have more pins down than the pins left.");
                    pinsdown = keyinput.nextInt();
                }

                if (score2 == pinsdown)
                {
                    System.out.println("Spare!");
                    spare++;
                }
                if (pinsdown == 0)
                {
                    score2 = 0;
                }
                // this is the part I no longer know how my code works. I cannot keep track of the calculations anymore.
                if (combo > 0)
                {
                    score = combo + score;
                    score2 = score + combo2;
                }
                else if (score2 > pinsdown)//final score calculation, don't know how it works.
                {
                   score2= score2 - pinsdown;

                }
                combo2= score2;

                round++;
            }
            if (combo > 0)//I have no idea what this does anymore.
            {
                score = combo + score;
                combo =0;
            }
            if (turkeycount == 3)//turkey counter, for the turkey
            {
                System.out.println("Turkey!");
                turkeycount = 0;
                turkey++;
            }

            //calculation for  the scoring. I gave up.

            System.out.println(score);
            System.out.println(score2);
            finalscore =finalscore + score + score2;
            System.out.println(finalscore);




        }
       //final scores being displayed.
        System.out.println("your total score is " + finalscore);
        System.out.println("your total strikes are " + strike);
        System.out.println("your total spares are " + spare);
        System.out.println("your total turkeys are " + turkey);
        //I barely understand any of my code anymore, I hate this scoring. I feel like I know too little for this.



    }
}
