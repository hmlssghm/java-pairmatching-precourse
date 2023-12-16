package pairmatching.controller;

import pairmatching.domain.*;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FunctionOperator {
    OutputView outputView = new OutputView();
    InputView inputView = new InputView();
    SetPair setPair = new SetPair();
    SetCrew setCrew = new SetCrew();
    public void operator() throws FileNotFoundException {
        setCrew.GetFrontEndNames();
        setCrew.GetBackEndNames();
        while (true) {
            String answer = main();
            if (answer.equals("Q")) {
                break;
            }
            if (answer.equals("1")){
                List<String> givenInfo = information();
                Course course = Course.getByName(givenInfo.get(0));
                Level level = Level.getByName(givenInfo.get(1));
                Mission mission = Mission.getByName(givenInfo.get(2));


                setPair.setPair(course, level);

                System.out.println(PairRepository.pairList());

            }
        }
    }

    public String main () {
        outputView.mainScreen();
        String answer = inputView.selectMainScreen();
        return answer;
    }

    public List<String> information () {
        outputView.courseAndMission();
        outputView.selectCourseAndMission();
        List<String> answer = inputView.selectClassification();
        return answer;
    }

}
