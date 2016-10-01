package kz.kaznitu.lessons.test.helpers;

import kz.kaznitu.lessons.test.classes.CsvOutputGenerator;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class OutputHelper
{
    IOutputGenerator outputGenerator;

    public OutputHelper(){
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

}