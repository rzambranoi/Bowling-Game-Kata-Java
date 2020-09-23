package com.drpicox.bowlingKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.google.common.truth.Truth.assertThat;

public class BowlingGameTest {
    private Game g;
    @BeforeEach
    public void setUp(){
        g = new Game();
    }
    private void rollMany(int rolls, int pins) {
        for (var i = 0; i < rolls; i += 1)
            g.roll(pins);
    }
    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }
    private void rollStrike() {
        g.roll(10);
    }
    @Test
    public void gutter_game(){
        rollMany(20,0);
        assertThat(g.score()).isEqualTo(0);
    }
    @Test
    public void all_ones(){
        rollMany(20,1);
        assertThat(g.score()).isEqualTo(20);
    }
    @Test
    public void one_spare(){
        rollSpare();
        g.roll(3);
        rollMany(17,0);
        assertThat(g.score()).isEqualTo(16);
        assertThat(new List<Game>).contains;
    }
    @Test
    public void one_strike(){
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertThat(g.score()).isEqualTo(24);
    }
    @Test
    public void perfect_game(){
        rollMany(12,10);
        assertThat(g.score()).isEqualTo(300);
    }
}
