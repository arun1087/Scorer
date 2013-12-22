package com.scorer.game;

import com.scorer.config.Configurations;

import java.util.ArrayList;

/**
 * Created by Arun on 12/20/13.
 */
public class ScoredRuns extends Runs {

    private Integer ones;
    private Integer twos;
    private Integer threes;
    private Integer fours;
    private Integer fives;
    private Integer sixes;
    private Integer sevens;
    private Integer balls;

    ArrayList<Integer> score;
    @Override
    public void addScore(Integer run, Integer type) {
        super.totalScore += run;
        super.individualScore+=run;
        this.balls++;
        switch (type) {
            case Configurations.ONE:
                ones++;
                break;
            case Configurations.TWO:
                twos++;
                break;
            case Configurations.THREE:
                threes++;
                break;
            case Configurations.FOUR:
                fours++;
                break;
            case Configurations.FIVE:
                fives++;
                break;
            case Configurations.SIX:
                sixes++;
                break;
            case Configurations.SEVEN:
                sevens++;
                break;
        }
    }
}
