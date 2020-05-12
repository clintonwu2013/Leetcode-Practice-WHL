/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m2912
 */
public class JavaApplication {

    public static void main(String[] args) {
        //System.out.println("Normal: " + testNormal());
        List<Integer> rs = new ArrayList<>();

        try {
            rs = testException();
            for(int i: rs){
                System.out.println("i="+i);
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("e="+e.toString());
        }
        
    }

    public static int testNormal() {
        try {
            // no exception
            return 0;
        } catch (Exception e) {
            System.out.println("[normal] Exception caught");
        } finally {
            System.out.println("[normal] Finally");
        }
        System.out.println("[normal] Rest of code");
        return -1;
    }

    public static List<Integer> testException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("[except] Exception caught");
        } finally {
            System.out.println("[except] Finally");
        }
        System.out.println("[except] Rest of code");
        
        return null;
    }

}
