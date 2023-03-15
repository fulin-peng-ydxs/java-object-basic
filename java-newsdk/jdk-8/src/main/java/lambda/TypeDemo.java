package lambda;

/**
 * @author PengFuLin
 * @version 1.0
 * @description: 类型推断演示
 * @date 2021/10/4 10:55
 */
public class TypeDemo {

    public static void main(String[] args) {
        Person person= (var)-> "fs";
    }
}


@FunctionalInterface
interface Person{
     String eat(String var);

}