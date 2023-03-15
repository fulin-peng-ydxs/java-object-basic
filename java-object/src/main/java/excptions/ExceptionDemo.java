package excptions;

/**
 * @author PengFuLin
 * @version 1.0
 * @description: 异常处理Demo
 * @date 2021/9/5 20:00
 */
public class ExceptionDemo {


    public void exceptionDemo() throws Exception {
        try {
            throw  new Exception("fa");
        }
        finally {
            System.out.println("fa");
        }
    }




}
