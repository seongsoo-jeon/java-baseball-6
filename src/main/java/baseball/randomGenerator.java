package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class randomGenerator {

    private List<Integer> ansNumber;

    public randomGenerator() {
        ansNumber = random();
    }
    public List<Integer> random() {
        List<Integer> ans = new ArrayList<>();
        while(ansNumber.size() < 3) {
            int randomNum = Randoms.pickNumberInRange(1, 9);
            if(!ansNumber.contains(randomNum)) {
                ansNumber.add(randomNum);
            }
        }
        return ans;
    }

    public List<Integer> getAns() {
        return this.ansNumber;
    }
}
