package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/* 
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{13, 8, 15, 5, 17, 4}; //8 13 5 15 4 17

        for (Integer i : sort(arr)) {
            System.out.println(i);
        }
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        //Finding median
        int median;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            median = (array[array.length / 2] + array[array.length / 2 - 1]) / 2;
        } else median = array[array.length / 2];
        System.out.println("median=" + median);
        //-------------
        //sorting array my variant
//        Integer[] resultArr=new Integer[array.length];
//        int i=array.length/2; //to bigger part
//        int j=array.length/2-1; //to lower part
//        int n;
//        int incr=0;
//        for (n=0; n<array.length; n++) {
//            if (array[i] - median < median - array[j]) {
//                resultArr[n] = array[i];
//                if (i==array.length-1) {incr=-1; i=j; break;}
//                i++;
//            } else if (median - array[j] < array[i] - median) {
//                resultArr[n] = array[j];
//                if (j==0) {incr=1; break;}
//                j--;
//            } else if (array[i] < array[j]) {
//                resultArr[n] = array[i];
//                if (i==array.length-1) {incr=-1; i=j; break;}
//                i++;
//            } else {
//                resultArr[n] = array[j];
//                if (j==0) {incr=1; break;}
//                j--;
//            }
//        }
//
//        for (n++;n<array.length; n++) {
//            resultArr[n]=array[i];
//            i=i+incr;
//        }
//        return resultArr;
//-------------
        //sorting array better variant
//        Arrays.sort(array, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return (Integer)(Math.abs(o1-median)-Math.abs(o2-median));
//            }
//        });
//-------------
        //sorting array the best variant
        Arrays.sort(array, (o1, o2) -> (Integer) (Math.abs(o1 - median) - Math.abs(o2 - median)));
        return array;
    }
}
