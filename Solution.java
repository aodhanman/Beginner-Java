package examples;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double positive =0;
        double negative = 0;
        double zero = 0;
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < n; i ++){
            if(arr[i] > 0){
                positive ++;
            }else if(arr[i]<0){
                negative ++;
            }else if(arr[i] == 0){
                zero ++;
            }
            
        
        }
      System.out.println(positive/n);
      System.out.println(negative/n);
      System.out.println(zero/n);  
        
        
    }
}
