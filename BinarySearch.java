package ArrayHomeWork;

import java.util.Scanner;

public class BinarySearch {
          static int binarySearch(int arr[],int search){
                    int low=0,high=arr.length-1,mid=0;
                    while(low<high){
                              mid=(low+high)/2;
                              if(search==arr[mid]){
                                        return mid;
                              }
                              if(search<arr[mid]){
                                        high=mid-1;
                              }
                              if(search>arr[mid]){
                                        low=mid+1;
                              }
                    }
                    return -1;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int arr[]={1,2,3,4,5};
                    int search=3;
                    System.out.println("Element Found at Index: "+binarySearch(arr,search));
                    sc.close();
          }
}
