package com.dingchao.encrypt;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: dingchao
 * \* Date: 2017/10/21
 * \* Time: 下午2:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:MD即Message-Digest Algorithm （信息-摘要算法），
 * 用于确保信息传输完整一致。是计算机广泛使用的杂凑算法之一（又译摘要算法、哈希算法），
 * 主流编程语言普遍已有MD实现。将数据（如汉字）运算为另一固定长度值，是杂凑算法的基础原理，
 * MD的前身有MD、MD和MD。广泛用于加密和解密技术，常用于文件校验。校验？不管文件多大，
 * 经过MD后都能生成唯一的MD值。好比现在的ISO校验，都是MD校验。怎么用？当然是把ISO经过MD后产生MD的值。
 * 一般下载linux-ISO的朋友都见过下载链接旁边放着MD的串。就是用来验证文件是否一致的。
 * \
 */
public class MDEncrypt {



    public static String mdencrypt(String shtring) throws  Exception{




        byte [] input=shtring.getBytes();

        BigInteger sha =null;
        MessageDigest md=MessageDigest.getInstance("sha");
        //MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);

        md.update(input);
        sha = new BigInteger(md.digest());
        System.out.println("SHA加密后:" + sha.toString());
        return  sha.toString();


    }


    public static void main(String args[])
    {
        try {
            String inputStr = "简单加密";
            mdencrypt(inputStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
