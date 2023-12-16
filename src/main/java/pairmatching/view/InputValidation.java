package pairmatching.view;

import java.util.List;

public class InputValidation {
    public boolean mainValidate(String given) {
        if (!given.equals("1") && !given.equals("2") && !given.equals("3") && !given.equals("Q")){
            try{
                throw new IllegalArgumentException();
            }catch (IllegalArgumentException e){
                System.out.println("[ERROR] 1, 2, 3 또는 Q를 입력해주십시오.");
                return false;
            }
        }
        return true;
    }
    public boolean classificationValidate(List<String> given) {
        return true;
    }
    public boolean rematchValidate(String given) {
        if (!given.equals("네") && !given.equals("아니오")){
            try{
                throw new IllegalArgumentException();
            }catch (IllegalArgumentException e){
                System.out.println("[ERROR] 네 혹은 아니오를 입력해주십시오.");
                return false;
            }
        }
        return true;
    }
}
