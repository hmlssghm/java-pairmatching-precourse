package pairmatching.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CrewRepository {
    private static final List<Crew> crewList = new ArrayList<>();

    public static List<Crew> crewList() {
        return Collections.unmodifiableList(crewList);
    }

    public static void addCrew(Crew crew) {
        crewList.add(crew);
    }

    public static List<Crew> getByCourse(Course course){
        return crewList().stream()
                .filter(crew -> crew.getCourse() == course)
                .collect(Collectors.toList());
    }
}
