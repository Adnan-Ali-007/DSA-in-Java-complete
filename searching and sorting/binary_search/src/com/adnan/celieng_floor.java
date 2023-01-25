package com.adnan;
public class celieng_floor {
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 6, 8, 9, 13, 18, 21};
        int target = 10;
        int ans= floor(arr,target);
        System.out.println(ans);
//        int ans = celing(arr,target);
//        System.out.println(ans);
    }
//        static int celing(int[]arr,int target)
//        {
//            if(target>arr[arr.length-1])// when target is itself the largest
//                return -1;
//        int start=0;
//        int end=arr.length-1;
//        while (start<=end) {
//            // int mid=(start+end)/2;// this start+end thing can exceed integer value so to avoid thsi we do
//            int mid = start + (end - start) / 2;// no problem of number limit here
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;
//            }
//        }
//       return start;//since target order gets updated after while loop
//    }
    // for floor of a number greatest number smaller than target
    static int floor(int[]arr,int target)
    {
        if(target<arr[0])// when target is itself the smallest
                return -1;
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            // int mid=(start+end)/2;// this start+end thing can exceed integer value so to avoid thsi we do
            int mid = start + (end - start)/2;// no problem of number limit here
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return end;
    }
}
