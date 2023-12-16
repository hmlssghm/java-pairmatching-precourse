package pairmatching;

import pairmatching.controller.FunctionOperator;
import pairmatching.controller.SetCrew;
import pairmatching.controller.ShuffleCrew;
import pairmatching.domain.Course;
import pairmatching.domain.CrewRepository;

import java.io.FileNotFoundException;

import static pairmatching.domain.Course.BACKEND;


public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        FunctionOperator functionOperator = new FunctionOperator();
        functionOperator.operator();
    }
}
