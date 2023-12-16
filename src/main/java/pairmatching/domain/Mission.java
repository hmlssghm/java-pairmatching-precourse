package pairmatching.domain;

import java.util.Arrays;

import static pairmatching.domain.Level.*;

public enum Mission {
    RACING("자동차경주", LEVEL1), LOTTO("로또", LEVEL1), BASEBALL("숫자야구게임", LEVEL1),
    SHOPPER_BAG("장바구니", LEVEL2), PAYMENT("결제", LEVEL2), SUBWAY("지하철노선도", LEVEL2),
    IMPROVEMENT("성능개선", LEVEL4), DISTRIBUTION("배포", LEVEL4);

    private String name;
    private Level level;

    Mission(String name, Level level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Level getLevel() {
        return level;
    }

    public static Mission getByName(String name) {
        return Arrays.stream(values())
                .filter(course -> course.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
