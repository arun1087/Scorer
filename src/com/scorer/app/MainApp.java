package com.scorer.app;

import com.scorer.game.BattingStats;
import com.scorer.game.BowlingStats;
import com.scorer.game.Player;
import com.scorer.view.Input;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 * Created by Arun on 12/17/13.
 */
public class MainApp {
    public static void main(String args[]) {

        Input.getInput();

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(Player.class);
        ctx.refresh();
        BattingStats battingStats = ctx.getBean(BattingStats.class);
        BowlingStats bowlingStats = ctx.getBean(BowlingStats.class);
        Player player = (Player)ctx.getBean(Player.class);
        System.out.println(player.toString());
    }
}
