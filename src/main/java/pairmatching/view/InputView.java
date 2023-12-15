package pairmatching.view;

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

    public String selectClassification() {
        String answer;
        boolean flag;
        do {
            answer = scanner.nextLine();
            flag = classificationValidate(answer);//예외 처리
        } while(!flag);
        return answer;
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
