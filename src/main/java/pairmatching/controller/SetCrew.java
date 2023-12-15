package pairmatching.controller;

import pairmatching.domain.Course;
import pairmatching.domain.Crew;
import pairmatching.domain.CrewRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GetName {
    public void GetBackEndNames() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/gracek/woowacourse/java-pairmatching-precourse/src/main/resources/backend-crew.md"));

        while(scanner.hasNext()){
            String str = scanner.next();
            Crew newCrew = new Crew(Course.BACKEND, str);
            CrewRepository.addCrew(newCrew);
        }
    }

    public void GetFrontEndNames() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/home/gracek/woowacourse/java-pairmatching-precourse/src/main/resources/frontend-crew.md"));

        while(scanner.hasNext()){
            String str = scanner.next();
            Crew newCrew = new Crew(Course.FRONTEND, str);
            CrewRepository.addCrew(newCrew);
        }
    }
}
