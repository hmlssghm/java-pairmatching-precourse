package pairmatching.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pair {
    private Level level;
    private  Crew crew1;
    private  Crew crew2;

    public Pair(Level level, Crew crew1, Crew crew2) {
        this.level = level;
        this.crew1 = crew1;
        this.crew2 = crew2;
    }

    public Level getLevel() {
        return level;
    }

    public Crew getCrew1() {
        return crew1;
    }

    public Crew getCrew2() {
        return crew2;
    }

    public List<Crew> getPair() {
        return Arrays.asList(crew1, crew2);

    }
}
