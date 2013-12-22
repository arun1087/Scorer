package com.scorer.game;

import com.scorer.config.Configurations;

/**
 * Created by Arun on 12/20/13.
 */
public class ExtraRuns extends Runs{
    private Integer wides;
    private Integer noBalls;
    private Integer byes;
    private Integer legByes;
    private Integer penalty;

    public void addScore(Integer run, Integer type){
        super.totalScore +=run;
        switch (type){
            case Configurations.WIDE:
                this.wides+=run;
                break;
            case Configurations.NO_BALL:
                this.noBalls+=run;
                break;
            case Configurations.BYES:
                this.byes+=run;
                break;
            case Configurations.LEG_BYES:
                this.legByes+=run;
                break;
            case Configurations.PENALTY:
                this.penalty+=run;
                break;
            default:
                try {
                    throw new Exception("Incompatible extra run");
                } catch (Exception e) {
                    e.printStackTrace();
                }
        }
    }
}
