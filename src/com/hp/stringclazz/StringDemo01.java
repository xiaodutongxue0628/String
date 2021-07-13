package com.hp.stringclazz;

/**
 * String 类的使用
 */
public class StringDemo01 {
    public static void main(String[] args) {
        // 针对你面试的
        // 注意: == 比较的是 是否同一个对象
        String s1="abc";
        String s2="abc";
        System.out.println(s1==s2); // true
        // 原因: 以上为什么是true? 因为 s2 重用了 s1的对象
          s1= s1+"!";
        System.out.println(s1==s2); // false
        // 原因: 以上为什么是false? 因为 1) 根本不相等  2)深层的原因,是对象被修改了
        String s3="a"+"bc";
        System.out.println(s2==s3);// true
        // 原因: 字符串的链接 就等于 没链接.
        String s4 = new String("abc");
        String s5 = new String("abc");
        System.out.println(s4==s2); //false
        // 原因:  s2 是常量池中的 字符串, 而  new String 是 类. 类中有自己的 地址
        System.out.println(s4);
        System.out.println(s4==s5);  //false
        // 原因:  s4 和 s5 是 不同的 对象
        System.out.println(s4.equals(s5)); //true
        System.out.println(s4.equals(s2)); // true
        // 原因:  == 比较的是 内存地址   equals 比较是 2者是否相同
        ///  例子:  有2对长得一样的双胞胎,   == 比较的是DNA   equals 比较是的 颜值


    }
}
