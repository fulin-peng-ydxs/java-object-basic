package string;

import org.junit.Test;

/**
 * @author PengFuLin
 * @version 1.0
 * @description: String intern方法分析
 * @date 2021/8/1 12:14
 */
public class StringIntern {


    /**
     * intern() : 如果字符串常量池中没有这个字符串，则会将其字符串放入池中并生成对应的对象
     * 如果有，则返回这个字符串对应的对象引用。
     */
    @Test
    public void testEquals(){
        String str1 = new StringBuilder("58").append("tongcheng").toString();
        System.out.println(str1);
        System.out.println(str1.intern());
        System.out.println(str1 == str1.intern()); //true

        System.out.println("------------");

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2);
        System.out.println(str2.intern());
        System.out.println(str2 == str2.intern()); //false
    }

    public static void main(String[] args) {
        final int MAX_COUNT = 1000 * 10000;
        final String[] arr = new String[MAX_COUNT];

        Integer[] data = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX_COUNT; i++) {
            /*利用intern(),对于相同的字符串时,数组中的每个元素都会是
              指向相同的常量池所对应的字符串对象的引用,而不需要去为每一个字符串都创建一个对象,造成空间浪费
              同时有可能会因空间不足进行垃圾回收,甚至是full gc导致执行性能下降严重.
             */
            arr[i] = String.valueOf(data[i % data.length]);
//            arr[i] = new String(String.valueOf(data[i % data.length])).intern();
//            arr[i] = new String(String.valueOf(data[0]/data[0])).intern();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start));
    }
}
