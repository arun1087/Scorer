package com.scorer.game;

import java.util.ArrayList;

/**
 * Created by Arun on 12/20/13.
 */
public abstract class Runs {
    protected Integer individualScore;
    public Integer totalScore;
    public abstract void addScore(Integer runsScored, Integer type);
}
