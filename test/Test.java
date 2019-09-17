/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author liuyuanyuan
 */
public class Test {
     
    public void set(String flag) {
        flag = "2";
        System.out.println("s0="+flag);
    }
    
    public static void main(String[] args) {
     String flag = "1";
     Test t = new Test();
     t.set(flag);
     System.out.println("s1=" + flag);
     
    }
}
