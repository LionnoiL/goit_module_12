package ua.gaponov;

import ua.gaponov.task1.ShowProgramExecutionTime;
import ua.gaponov.task2.NumberReplace;

public class Main {
    public static void main(String[] args) {

        ShowProgramExecutionTime executionTime = new ShowProgramExecutionTime();
        executionTime.show();

        NumberReplace numberReplace = new NumberReplace();
        numberReplace.getNumbers(15);



    }
}