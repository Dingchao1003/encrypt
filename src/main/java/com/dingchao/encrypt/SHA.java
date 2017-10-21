package com.dingchao.encrypt;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: dingchao
 * \* Date: 2017/10/21
 * \* Time: 下午2:20
 * \* To change this template use File | Settings | File Templates.
 * \* Description:安全哈希算法（Secure Hash Algorithm）
 * 主要适用于数字签名标准（Digital Signature Standard DSS）里面定义的数字签名算法（Digital Signature Algorithm DSA）。
 * 对于长度小于^位的消息，SHA会产生一个位的消息摘要。该算法经过加密专家多年来的发展和改进已日益完善，并被广泛使用。
 * 该算法的思想是接收一段明文，然后以一种不可逆的方式将它转换成一段（通常更小）密文，也可以简单的理解为取一串输入码（称为预映射或信息），
 * 并把它们转化为长度较短、位数固定的输出序列即散列值（也称为信息摘要或信息认证代码）的过程。散列函数值可以说是对明文的一种“指纹”或是
 * “摘要”所以对散列值的数字签名就可以视为对此明文的数字签名。
 * \
 */
public class SHA {
}
