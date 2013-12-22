package com.scorer.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Arun on 12/17/13.
 */

public class BattingStats {
    private Integer battingPosition;
    private Integer ballsFaced;
    private Integer runsScored;
    private Integer fours;
    private Integer sixes;
    private Runs runs;
    private Boolean isNotOut;
    private Boolean isRightHand;
    private Float strikeRate;

    public BattingStats(Integer battingPosition, Integer ballsFaced,
                        Integer runsScored, Integer fours, Integer sixes,
                        Boolean isNotOut, Boolean isRightHand) {
        this.battingPosition = battingPosition;
        this.ballsFaced = ballsFaced;
        this.runsScored = runsScored;
        this.fours = fours;
        this.sixes = sixes;
        this.isNotOut = isNotOut;
        this.isRightHand = isRightHand;
    }

    public Integer getBattingPosition() {
        return battingPosition;
    }

    public Integer getBallsFaced() {
        return ballsFaced;
    }

    public Integer getRunsScored() {
        return runsScored;
    }

    public Integer getFours() {
        return fours;
    }

    public Integer getSixes() {
        return sixes;
    }

    public Boolean getIsNotOut() {
        return isNotOut;
    }

    public Boolean getIsRightHand() {
        return isRightHand;
    }

    public Float getStrikeRate() {
        return strikeRate;
    }

    @Bean
    public void setBattingPosition(Integer battingPosition) {
        this.battingPosition = battingPosition;
    }

    @Bean
    public void setBallsFaced(Integer ballsFaced) {
        this.ballsFaced = ballsFaced;
    }

    @Bean
    public void setRunsScored(Integer runsScored) {
        this.runsScored = runsScored;
    }

    @Bean
    public void setFours(Integer fours) {
        this.fours = fours;
    }

    @Bean
    public void setSixes(Integer sixes) {
        this.sixes = sixes;
    }

    @Bean
    public void setIsNotOut(Boolean isNotOut) {
        this.isNotOut = isNotOut;
    }

    @Bean
    public void setIsRightHand(Boolean isRightHand) {
        this.isRightHand = isRightHand;
    }

    @Bean
    public void setStrikeRate(Float strikeRate) {
        this.strikeRate = strikeRate;
    }

//    public Runs getRuns() {
//        return runs;
//    }
//
//    @Bean
//    public void setRuns(Runs runs) {
//        this.runs = runs;
//    }
}
