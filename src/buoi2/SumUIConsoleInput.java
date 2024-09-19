package buoi2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SumUIConsoleInput {

    //fields - biến
    private PrintWriter stdOut = null;
    private BufferedReader stdIn = null;
    private SumUseCaseControl sumUseCaseControl = null;

    //functions - methods
    //constructor
    public SumUIConsoleInput(){
        stdOut = new PrintWriter(
            new OutputStreamWriter(System.out));
        
        stdIn = new BufferedReader(
            new InputStreamReader(System.in));

        sumUseCaseControl = new SumUseCaseControl();
    }

    public void input() throws IOException {
        stdOut.print("Hay nhap so thu nhat:");
        stdOut.flush();
        String strNumer1 = stdIn.readLine();
        stdOut.print("Hay nhap so thu hai:");
        stdOut.flush();
        String strNumer2 = stdIn.readLine();

        RequestData requestData = new RequestData(strNumer1, strNumer2);

        //messsage qua object control
        sumUseCaseControl.execute(requestData);

        
    }

}
