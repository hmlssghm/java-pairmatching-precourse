package pairmatching.domain;

import java.util.Arrays;

public enum Course {
    BACKEND("백엔드"),
    FRONTEND("프론트엔드");

    private String name;

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Course getByName(String name) {
        return Arrays.stream(values())
                .filter(course -> course.getName().equals(name))
                .findFirst()
                .orElse(null);
    }
    // 추가 기능 구현
}
