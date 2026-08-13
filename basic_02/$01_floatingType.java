package basic_02;

import java.util.Scanner;

public class $01_floatingType {
    //  It's time to write a program that will sort the elements of the array in ascending order
    public static void main(String[] args){
        int[] unSortArry = {2,5,1,4,7,3,2,8};
        for(int i=0;i< unSortArry.length;i++){
            for(int j=i+1;j<unSortArry.length;j++){
                if(unSortArry[i] > unSortArry[j]){
                    int temValue = unSortArry[i];
                     unSortArry[i] = unSortArry[j];
                     unSortArry[j] = temValue;
                }
            }
            System.out.print(unSortArry[i]+ " , ");
        }
        
    }
}


