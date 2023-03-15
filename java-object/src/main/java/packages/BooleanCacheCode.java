package packages;

import org.junit.Test;

/**
 * @author PengFuLin
 * @version 1.0
 * @description:
 * @date 2021/8/14 10:54
 */
public class BooleanCacheCode {


    /* 包装类对象的数据缓存：
     * Boolean 对象的字面量赋值使用的是valueOf方法进行对象的创建，
     * Boolean内部有两个常量，一个是false的Boolean对象，一个是ture的Boolean对象，
     * 在此方法中，会根据true和false值判断，如果要创建true对象，则直接返回创建好的true常量对象，
     * 如果要创建false对象，则直接返回创建好的false常量对象。
     */

    /**
     *  0 iconst_1
     *  1 invokestatic #8 <java/lang/Boolean.valueOf : (Z)Ljava/lang/Boolean;>
     *  4 astore_1
     *
     *  5 iconst_1
     *  6 invokestatic #8 <java/lang/Boolean.valueOf : (Z)Ljava/lang/Boolean;>
     *  9 astore_2
     */
    @Test
    public void test06(){
        Boolean b1 = true;
        Boolean b2 = true;
        System.out.println(b1 == b2); //true
    }

    /*
     * 使用new方式则直接是创建一个新的对象*/
    @Test
    public void test02(){
        Boolean aBoolean = new Boolean(true);
        Boolean aBoolean1 = new Boolean(true);
        System.out.println(aBoolean == aBoolean1);
    }


}
