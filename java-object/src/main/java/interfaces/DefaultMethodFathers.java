package interfaces;

/**
 * @author PengFuLin
 * @version 1.0
 * @description: 接口默认方法Demo
 * @date 2021/10/9 22:46
 */
public interface DefaultMethodFathers {

    default void defaultMethods(){
        System.out.println("fa");
    }

    void abstractMethods();

}
