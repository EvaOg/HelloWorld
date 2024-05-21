package collections.set.lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoSlip {
    //We want to play lotto! A Lotto-slip consists of 12 different fields with exactly six numbers between 1 and 49.
    private Set<Set<Integer>> lottoSlip = new HashSet<Set<Integer>>();

    public Set<Integer> getSixWinningNumbers() {
        Set<Integer> a = new HashSet<>();
        while (a.size() < 6) {
            Random rnd = new Random();
            a.add(rnd.nextInt(1, 50));
        }
        return a;
    }


    public void fillLottoSlip(int i) {
        //lottoSlip.clear();
        for (int j = 0; j < i; j++) {;
            lottoSlip.add(getSixWinningNumbers());
        }
    }


    public void printLottoSlip() {
        for (Set<Integer> a : lottoSlip ){
            System.out.println("--------------------------");
            System.out.println(a.toString());
        }
    }
}

