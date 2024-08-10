import java.util.*;
//public class exception {
//    public static void main(String[] args) {
        //q1

//       }
//        try
//        {
//            int[] myNumbers = {1, 2, 3};
//            System.out.println(myNumbers[10]);
//        }
//        catch (Exception e)
//        {
//            System.out.println("Something went wrong.");
//        }
//        try
//        {
//            int array[] = new int[10];
//            array[10] = 30 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            int a[] = new int[5];
//            a[5] = 30 / 0;
//        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
//            if (e instanceof ArithmeticException) {
//                System.out.println("Arithmetic Exception occurs");
//            } else if (e instanceof ArrayIndexOutOfBoundsException) {
//                System.out.println("ArrayIndexOutOfBounds Exception occurs");
//            }
//        } catch (Exception e) {
//            System.out.println("Parent Exception occurs");
//        }
//        System.out.println("rest of the code");
//    }
//        int result = divide(10, 0);
//        System.out.println("Result: " + result);


//    public static int divide(int numerator, int denominator) {
//        try {
//            int result = numerator / denominator;
//            return result; // Return the result if division is successful
//        } catch (ArithmeticException e) {
//            System.out.println("Error: Division by zero!");
//            return 0; // Return 0 in case of division by zero
//        } finally {
//            System.out.println("Finally block executed.");
//        }
//    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a name: ");
//        String name = scanner.nextLine();
//        try {
//            validateName(name);
//            System.out.println("Welcome, " + name + "!");
//        } catch (InvalidNameException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//    public static void validateName(String name) throws InvalidNameException {
//        if (!name.equals("Adnan")) {
//            throw new InvalidNameException("Invalid name entered!");
//        }
//    }
//}
//    class InvalidNameException extends Exception {
//        public InvalidNameException(String message) {
//            super(message);
//        }
//    }
//
class MyException extends Exception {
            public MyException(String s)
            {
                super("Your Exception is due to "+s);
            }
        }

       public class exception {
            public static void main(String args[])
            {
                try {
                    throw new MyException("adnan");
                }
                catch (MyException ex) {
                    System.out.println("Caught");

                    System.out.println(ex.getMessage());
                }
            }
        }







