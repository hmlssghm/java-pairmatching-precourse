package pairmatching.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView extends InputValidation{


    final Scanner scanner = new Scanner(System.in);

    public String selectMainScreen() {
        String answer;
        boolean flag;
        do {
            answer = scanner.nextLine();
            flag = mainValidate(answer);//예외 처리
        } while(!flag);
        return answer;
    }

    public List<String> selectClassification() {
        String answer;
        List<String> answerList;
        boolean flag;
        do {
            answer = scanner.nextLine();
            answerList = makeList(answer);
            flag = classificationValidate(answerList);//예외 처리
        } while(!flag);
        return answerList;
    }

    public List<String> makeList(String given) {
        String[] words = given.split(",");
        List<String> list = Arrays.asList(words);
        return list;
    }

    public String selectRematch() {
        String answer;
        boolean flag;
        do {
            answer = scanner.nextLine();
            flag = rematchValidate(answer);//예외 처리
        } while(!flag);
        return answer;
    }


}
