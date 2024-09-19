package buoi2;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SumUIConsoleOutput {

    //fields
    private PrintWriter stdOut = null;
    //

    public SumUIConsoleOutput(){
        stdOut = new PrintWriter(
            new OutputStreamWriter(System.out));
    }
    public void output(ResponseData responseData) {
        stdOut.print("Ket qua la: " + responseData.strSumResult);
        stdOut.flush();
    }

}
