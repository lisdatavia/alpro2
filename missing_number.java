/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studikasus;

/**
 *
 * @author MyBook Hype AMD
 */
public class missing_number {
public static void main (String[] args) {
    int[] arr ={1,3,4,6};
    int miss = missing_number(arr);
    if(miss == -1){
        System.out.println("Tidak ada angka yang hilang");
    }else{
        System.out.println("Angka yang hilang adalah "+miss);
    }
}   

public static int missing_number (int[] arr){
    int n=arr.length;
    int[]b=new int [arr[n-1]+1];
    for (int i=0;i<n;i++){
        b[arr[i]]=1;
    }
    for(int i=arr[0]; i<=arr[n-1];i++){
        if (b[i] == 0) {
           return i; 
        }
    }
    return -1;
}
}
