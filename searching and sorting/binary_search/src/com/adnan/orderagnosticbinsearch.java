package com.adnan;
//optimised binary search works for desecding order as well
public class orderagnosticbinsearch {
    public static void main(String[] args) {
        int[]arr={-4,-5,-2,0,2,4,5,7,9,36,86,98};
            int target=36;
            int ans=orderagnostic(arr,target);
            System.out.println(ans);

        }

// return the index
//    return -1 if does not exist in array
    //this code works for both checking the order and giving the answer accordingly
        static int orderagnostic(int[]arr,int target)
        {
            int start=0;
            int end=arr.length-1;
            boolean isasc=arr[start]<arr[end];
            while (start<=end) {
                // int mid=(start+end)/2;// this start+end thing can exceed integer value so to avoid thsi we do
                int mid = start + (end - start) / 2;
                if (target == arr[mid]) return mid;
                if (isasc) {
                    if (target < arr[mid]) {
                        end = mid - 1;
                    }
                    else
                    {
                        start = mid + 1;
                    }
                }
                else {
                    if (target >arr[mid]) {
                        end=mid - 1;
                    }
                    else {
                        start=mid + 1;
                    }
                }
            }
            return -1; //if target not found had to return something
        }
    }