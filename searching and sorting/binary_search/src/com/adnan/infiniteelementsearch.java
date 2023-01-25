package com.adnan;
public class infiniteelementsearch {
    public static void main(String[] args) {
int[]arr={3,5,6,7,9,10,90,100,130,140,170};
int target=10;
System.out.println(ans(arr,target));
    }
    static int ans(int []arr,int target)
    {
     // first we will find the range in which to search and keep our start and end
     // first we start with a box of 2
     int start=0;
     int end=1;
while(target>arr[end])// we did not find the target in the given range
{
    int temp=end+1;
    end= end+(end-start+1)*2;// end + size of box
    start=temp;// updated start as last as we needed old start for getting some sense on end
}
        return binarysearch(arr,target,start,end);// feeding vales of start and end then searching target
        //wow
    }
    static int binarysearch(int[]arr,int target,int start,int end)
    {
        while (start<=end) {
            // int mid=(start+end)/2;// this start+end thing can exceed integer value so to avoid thsi we do
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
        return -1;
    }
}
