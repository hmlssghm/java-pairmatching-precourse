package pairmatching.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PairRepository {
    private static final List<Pair> pairList = new ArrayList<>();

    public static List<Pair> pairList() {
        return Collections.unmodifiableList(pairList);
    }

    public static void addPair(Pair pair) {
        pairList.add(pair);
    }

    public static boolean findByLevelAndCrew (Level level, Crew crew1, Crew crew2){
        for (Pair pair : pairList()) {
            if (pair.getLevel().equals(level) && (pair.getCrew1().equals(crew1) || pair.getCrew1().equals(crew2)) && (pair.getCrew2().equals(crew1) || pair.getCrew2().equals(crew2))) {
                return true;
            }
        }
        return false;
    }

}
