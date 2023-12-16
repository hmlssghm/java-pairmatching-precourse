package pairmatching.controller;

import pairmatching.domain.*;
import pairmatching.view.OutputView;

import java.util.List;

public class SetPair {
    ShuffleCrew shuffleCrew = new ShuffleCrew();
    OutputView outputView = new OutputView();

    public void setPair(Course course, Level level) {
        List<Crew> crewList = shuffleCrew.shuffleCrew(course);
        for(int i = 0; i < crewList.size(); i += 2){
            if(PairRepository.findByLevelAndCrew(level, crewList.get(i), crewList.get(i + 1))){// 이미 페어가 등록돼 있으면
                outputView.alreadyMatched();
                break; // 종료
            }
            else{
                for(int j = 0; j < crewList.size(); j += 2){
                    Pair pair = new Pair(level, crewList.get(i), crewList.get(i + 1)); // 아니면 페어 등록
                    PairRepository.addPair(pair);
                }
            }
        }
    }
}
