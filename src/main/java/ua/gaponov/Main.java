package ua.gaponov;

import ua.gaponov.task1.ShowFiveSecond;
import ua.gaponov.task1.ShowOneSecond;
import ua.gaponov.task2.NumberReplace;

public class Main {
    public static void main(String[] args) {

        ShowFiveSecond fiveSecond = new ShowFiveSecond();
        fiveSecond.show();

        ShowOneSecond oneSecond = new ShowOneSecond();
        oneSecond.show();

        NumberReplace numberReplace = new NumberReplace();
        numberReplace.getNumbers(15);



    }
}