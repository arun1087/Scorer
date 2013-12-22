package com.scorer.view;

import com.scorer.game.ExtraRuns;
import com.scorer.game.Overs;
import com.scorer.game.Runs;
import com.scorer.game.ScoredRuns;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Arun on 12/20/13.
 */
public class Input {


    public static void getInput() {
        Scanner in = new Scanner(System.in);
        String batsman1;
        String batsman2;
        String bowlerName;
        String ballScore;
        Runs runs = new ScoredRuns();
        Runs runs1= new ExtraRuns();


        System.out.println("Enter the Openers name:");
        System.out.println("Opener 1 name:");
        batsman1 = in.nextLine();
        System.out.println("Opener 2 name:");
        batsman1 = in.nextLine();
        while(Overs.totalOvers!=3) {
            System.out.println("Enter the bowler name:");
            bowlerName = in.nextLine();
            for(int i=1;i<=6;i++) {
                System.out.println(Overs.totalOvers+"."+i+":");
                ballScore = in.nextLine();
                if(ballScore.equals("W")
            }
            Overs.totalOvers++;
        }
        System.out.println("Enter the new batsman name");

    }

}
