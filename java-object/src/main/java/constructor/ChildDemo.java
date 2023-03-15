package constructor;

/**
 * @author PengFuLin
 * @version 1.0
 * @description: 子类Demo
 * @date 2021/9/5 4:51
 */
public class ChildDemo extends  SuperDemo{

    /*
      类编译后就会将成员变量显示赋值和代码块中的代码
      放入到构造方法代码中的最前面,执行顺序按照在类中的排序方式
      从上往下执行。
     */
    {
        int childNum4=1;
        System.out.println(childNum4);
    }
    int childNum1=1;
    int childNum2=1;
    int childNum3;
    {
        childNum2=2;
    }
    /*
      如果父类中没有无参构造器，那么就需要在子类构造器中第一行显示
      的调用父类的有参构造器：
      1.直接调用父类构造器 super（..）
      2.调用子类自己的有显示调用父类的有参构造器的构造器
     */
    public ChildDemo(String demo) {
        this(2);
        int childNum5=9;
    }
    public ChildDemo(int demo){
        super("123");
        int childNum5=9;
    }

    public static void staticDemo(){

    }


    public static void main(String[] args) {
        /*
           如果父类和子类都有相同的属性，那么直接访问子类对象的属性时，优先访问的就是父类的属性
           而方法才会优先访问子类的。
         */

        SuperDemo superDemo=new ChildDemo(1);
        int childNum1 = superDemo.childNum1;
        System.out.println(childNum1);
    }

}
