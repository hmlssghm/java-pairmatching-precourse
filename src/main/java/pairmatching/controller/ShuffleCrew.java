package pairmatching.controller;

import pairmatching.domain.Course;
import pairmatching.domain.Crew;
import pairmatching.domain.CrewRepository;

import java.io.FileNotFoundException;
import java.util.List;

import static camp.nextstep.edu.missionutils.Randoms.shuffle;
import static pairmatching.domain.Course.BACKEND;
import static pairmatching.domain.Course.FRONTEND;

public class ShuffleCrew {
    public List<Crew> shuffleCrew(Course course) {
        List<Crew> crews = CrewRepository.getByCourse(course);
        List<Crew> shuffled = shuffle(crews);

        return shuffled;
    }
}
