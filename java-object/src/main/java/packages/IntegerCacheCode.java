package packages;

import org.junit.Test;

/**
 * @author PengFuLin
 * @version 1.0
 * @description:
 * @date 2021/8/14 10:54
 */
public class IntegerCacheCode {


    /* 包装类对象的数据缓存：
     * 使用字面量的方式对Integer赋值，则会使用Integer的valueOf方法进行对象创建，Integer内部有一个Integer缓存，
     * 存储了关于-128~127Integer对象，如果要创建的的Integer对象的值在此区间内，就直接使用已创建缓存对象，
     * 如果不在此区间内则就重新创建一个新对象。
     * 注意：Integer的最大值可以通过配置VM环境进行设置需要的最大值！
     */
    @Test
    public void test5(){
        /**
         *  0 bipush 10
         *  2 invokestatic #4 <java/lang/Integer.valueOf : (I)Ljava/lang/Integer;>
         *  5 astore_1
         *
         *  6 bipush 10
         *  8 invokestatic #4 <java/lang/Integer.valueOf : (I)Ljava/lang/Integer;>
         * 11 astore_2
         */
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);//true


        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);//false
    }

    /*
     * 使用new方式则直接是创建一个新的对象*/
    @Test
    public void test01(){
        Integer integer = new Integer(10);
        Integer integer1 = new Integer(10);
        System.out.println(integer == integer1); //false
    }
}
