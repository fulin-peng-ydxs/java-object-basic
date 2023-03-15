package innerclass;

/**
 * @author PengFuLin
 * @version 1.0
 * @description: 测试内部类的外部成员的使用
 * @date 2021/10/19 20:45
 */
public class TestFinal {

    int num=0;
    public void finalTest(){

        class InnerDemo{
            public void finalTest(){
                num=0;
            }
        }
    }
}
