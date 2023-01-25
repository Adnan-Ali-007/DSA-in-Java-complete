package com.adnan;
public class binsearch {
    public static void main(String[] args) {
int[]arr={-4,-5,-2,0,2,4,5,7,9,36,86,98};
int target=5;
int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
// return the index
//    return -1 if does not exist in array
    static int binarysearch(int[]arr,int target)
    {
int start=0;
int end=arr.length-1;
while (start<=end) {
    // int mid=(start+end)/2;// this start+end thing can exceed integer value so to avoid this we do
    int mid = start + (end - start)/2;// no problem of number limit here
    if (target < arr[mid]) {
        end=mid - 1;
    }
    else if (target > arr[mid]) {
        start=mid + 1;
    }
    else {
        return mid;
    }
}
return -1; //if target not found had to return something
    }
}
