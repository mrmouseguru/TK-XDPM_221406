package buoi2;

public class SumUseCaseControl {

    //fields
    private SumEntity sumEntity = null;
    private SumUIConsoleOutput sumUIConsoleOutput = null;

    //methods
    public SumUseCaseControl(){
        sumEntity = new SumEntity();
        sumUIConsoleOutput = new SumUIConsoleOutput();
    }

    public void execute(RequestData requestData) {

        ///uese case
        String strNumber1 = requestData.strNumber1;
        String strNumber2 = requestData.strNumber2;
        //kiểm tra hợp lệ của 2 
        
        //chuyển chuỗi => số
        int num1 = Integer.parseInt(strNumber1);
        int num2 = Integer.parseInt(strNumber2);
        //message đến SumEntity Object
        //setter
        sumEntity.setNum1(num1);
        sumEntity.setNum2(num2);
        //sum
        int sumResult = sumEntity.sum();
        //nhét sumResult vào ResponseData
        ResponseData responseData = new ResponseData();
        responseData.strSumResult = "" + sumResult;

        //messate to SumUIConsoleOutput Object
        sumUIConsoleOutput.output(responseData);
        
    }

}
