package com.dingchao.encrypt;



import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: dingchao
 * \* Date: 2017/10/21
 * \* Time: 下午1:20
 * \* To change this template use File | Settings | File Templates.
 * \* Description:此算法为base加密，
 * BASE的加密解密是双向的，可以求反解.
 BASEEncoder和BASEDecoder是非官方JDK实现类。虽然可以在JDK里能找到并使用，但是在API里查不到。
 JRE 中 sun 和 com.sun 开头包的类都是未被文档化的，他们属于 java, javax 类库的基础，其中的实现大多数与底层平台有关，
 一般来说是不推荐使用的。
 BASE 严格地说，属于编码格式，而非加密算法
 主要就是BASEEncoder、BASEDecoder两个类，我们只需要知道使用对应的方法即可。
 另，BASE加密后产生的字节位数是的倍数，如果不够位数以=符号填充。
 BASE
 按照RFC的定义，Base被定义为：Base内容传送编码被设计用来把任意序列的位字节描述为一种不易被人直接识别的形式。
 （The Base Content-Transfer-Encoding is designed to represent arbitrary sequences of octets in a form that need not be humanly readable.）
 常见于邮件、http加密，截取http信息，你就会发现登录操作的用户名、密码字段通过BASE加密的。
 * \
 */
public class BaseEncrypt {

    public static byte[] decryptBase(String data) throws Throwable {
        return new BASE64Decoder().decodeBuffer(data);
    }


    public static String encryptBase(byte[] data) throws Throwable {
        return new BASE64Encoder().encode(data);
    }


    public static void main(String[] args) {
        String str = "woqunima";
        String result;
        try {
            result = BaseEncrypt.encryptBase(str.getBytes());
            System.out.println("result=====加密数据==========" + result);
            byte result2[] = BaseEncrypt.decryptBase(result);
            String str3 = new String(result2);
            System.out.println("str========解密数据========" + str3);
        } catch (Throwable e) {
            e.printStackTrace();
        }


    }
}
