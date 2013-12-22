package com.scorer.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by Arun on 12/17/13.
 */

@Configuration
@PropertySource("classpath:prop.cfg")
public class Player {

    private BattingStats battingStats;
    private BowlingStats bowlingStats;
    private String wicketType;
    private String playerName;

    @Autowired
    Environment env;

    @Bean
    public BattingStats getBattingStats() {
        battingStats = new BattingStats(1,100,52, 4, 1, true, false);
        return battingStats;
    }

    public void setBattingStats(BattingStats battingStats) {
        this.battingStats = battingStats;
    }

    @Bean
    public BowlingStats getBowlingStats() {
        bowlingStats = new BowlingStats(3, 5, 24, 2, 1, 2, 1, true, "fast");
        return bowlingStats;
    }

    public void setBowlingStats(BowlingStats bowlingStats) {
        this.bowlingStats = bowlingStats;
    }

    public void setWicketType(String wicketType) {
        this.wicketType = wicketType;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getWicketType() {
        return wicketType;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    public String toString() {
        return "Player{" +
                "batting position=" + battingStats.getBattingPosition() +
                " runs scored=" + battingStats.getRunsScored() +
                " balls faced=" + battingStats.getBallsFaced() +
                " strike rate=" + battingStats.getStrikeRate() +
                " overs bowled=" + bowlingStats.getOversBowled() +
                " runs conceded=" + bowlingStats.getRunsConceded() +
                " maidens=" + bowlingStats.getRunsConceded() +
                " wickets taken=" + bowlingStats.getWickets() +
                '}';
    }
}
