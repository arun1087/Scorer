package com.scorer.game;

import org.springframework.context.annotation.Bean;

/**
 * Created by Arun on 12/17/13.
 */
public class BowlingStats {

    private Integer bowlingPosition;
    private Integer oversBowled;
    private Integer runsConceded;
    private Integer wickets;
    private Integer maidens;
    private Integer wides;
    private Integer noBalls;
    private Boolean isRightArm;
    private String bowlingType;
    private Float economyRate;

    BowlingStats(Integer bowlingPosition,
                Integer oversBowled,
                Integer runsConceded,
                Integer wickets,
                Integer maidens,
                Integer wides,
                Integer noBalls,
                Boolean isRightArm,
                String bowlingType){
        this.bowlingPosition = bowlingPosition;
        this.oversBowled = oversBowled;
        this.runsConceded = runsConceded;
        this.wickets = wickets;
        this.maidens = maidens;
        this.wides = wides;
        this.noBalls = noBalls;
        this.isRightArm = isRightArm;
        this.bowlingType = bowlingType;
    }

    public Integer getBowlingPosition() {
        return bowlingPosition;
    }

    @Bean
    public void setBowlingPosition(Integer bowlingPosition) {
        this.bowlingPosition = bowlingPosition;
    }

    public Integer getOversBowled() {
        return oversBowled;
    }

    @Bean
    public void setOversBowled(Integer oversBowled) {
        this.oversBowled = oversBowled;
    }

    public Integer getRunsConceded() {
        return runsConceded;
    }

    @Bean
    public void setRunsConceded(Integer runsConceded) {
        this.runsConceded = runsConceded;
    }

    public Integer getWickets() {
        return wickets;
    }

    @Bean
    public void setWickets(Integer wickets) {
        this.wickets = wickets;
    }

    public Integer getMaidens() {
        return maidens;
    }

    @Bean
    public void setMaidens(Integer maidens) {
        this.maidens = maidens;
    }

    public Integer getWides() {
        return wides;
    }

    @Bean
    public void setWides(Integer wides) {
        this.wides = wides;
    }

    public Integer getNoBalls() {
        return noBalls;
    }

    @Bean
    public void setNoBalls(Integer noBalls) {
        this.noBalls = noBalls;
    }

    public Boolean getIsRightArm() {
        return isRightArm;
    }

    @Bean
    public void setIsRightArm(Boolean isRightArm) {
        this.isRightArm = isRightArm;
    }

    public String getBowlingType() {
        return bowlingType;
    }

    @Bean
    public void setBowlingType(String bowlingType) {
        this.bowlingType = bowlingType;
    }

    public Float getEconomyRate() {
        return economyRate;
    }

    @Bean
    public void setEconomyRate(Float economyRate) {
        this.economyRate = economyRate;
    }
}
