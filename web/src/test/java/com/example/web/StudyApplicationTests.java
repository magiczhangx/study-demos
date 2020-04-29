package com.example.web;


import java.io.IOException;
import java.util.*;


//@RunWith(SpringRunner.class)
//@SpringBootTest
public class StudyApplicationTests {
    //public class Main {


    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        s.close();

        int[] p = new int[5];

        p[0]=2;

        int j = 5;


        int i = 1;
        while(i <= n){
            if(isPlanOk(i , n)){
                System.out.println(i);
                System.exit(0);
            }
            i++;
        }

    }

    public static boolean isPlanOk(int m , int n){

        int leftNum = n;
        int fetched = 0;

        while( leftNum > 0){

            //niuniu na
            leftNum -= m;
            fetched += m;
            if(leftNum <= 0){
                continue;
            }

            leftNum -= leftNum/10;

        }

        if(fetched > (n/2)){
            return true;
        }
        return false;

    }

}
