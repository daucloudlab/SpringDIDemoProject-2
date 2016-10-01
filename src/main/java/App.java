import kz.kaznitu.lessons.test.classes.CsvOutputGenerator;
import kz.kaznitu.lessons.test.helpers.OutputHelper;
import kz.kaznitu.lessons.test.interfaces.IOutputGenerator;

public class App
{
    public static void main( String[] args )
    {
        OutputHelper output = new OutputHelper();
        output.generateOutput();
    }
}