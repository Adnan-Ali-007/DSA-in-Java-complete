
import java.util.Scanner;
import java.util.ArrayList;
public class arrayintro {
    public static void main(String[] args) {
//        System.out.println("hello");
//        int a = 65; // these are suitable for storing single values for multiple same tytpe o fvalues we need arrays or string
        Scanner in = new Scanner(System.in);
//        String name = "adnan";
// int[] rnos=new int[5];
// int[] rnos2={23,43,678,42,1};
// int []ros3;//ros is getting defined in stack declaration ros variable
//        ros3=new int[5];//object created in the heap memory initialization


        // 2d arrays
//        int arr2d[][]={
//                {1,2,3,},
//                {4,5},
//                {6,7,8,9}
//        };
//
//        int[][] arr = new int[3][2];
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = in.nextInt();
//            }
//        }
//    ArrayList <Integer> list=new ArrayList<>(10);
//        list.add(67);
//        list.add(5453);
//        list.add(37);
//        list.add(453);
//        list.add(47);
//        list.add(53);
// System.out.println(list);
// list.set(2,69);
// System.out.println(list);
        // for 2d arraylists
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();// declaration part
        //intialization part
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // adding 3 lists into 2 d arraylist
        }
        // adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}

