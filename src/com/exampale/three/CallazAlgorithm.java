package com.exampale.three;

/**
 * @author Ray.Ma
 * @date 2019/6/20 19:25
 */
public class CallazAlgorithm {
    public static void main(String[] args) {
        System.out.println(callaz(3));
    }
    public static int callaz( int num){
        int count =0;
        while (num!=1){
            if (num%2==0){
                num /=2;
            }else {
                num = (3*num+1)/2;
            }
            count++;
        }
        return count;
    }
}
