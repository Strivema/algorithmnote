package com.exampale.leetcode.easy;

/**
 * @author Marie
 * @date 2020/3/29 10:41 PM
 **/
public class DefangIPaddr {
    /**
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     * <p>
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     *
     * @param address
     * @return
     */
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(new DefangIPaddr().defangIPaddr("10.1.1.1"));
    }
}
