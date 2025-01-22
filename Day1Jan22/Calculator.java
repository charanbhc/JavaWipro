package Day1Jan22;
public class Calculator {

    // 1. With return type and static
    public static int add(int a, int b) {
        return a + b;
    }

    // 2. With return type and non-static
    public int subtract(int a, int b) {
        return a - b;
    }

    // 3. Without return type and static.
    public static void multiply(int a, int b) {
        System.out.println("Multiplication Without return type and static: " + (a * b));
    }

    // 4. Without return type and non-static.
    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division Without return type and non-static: " + (a / b));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Main method to test the Calculator class
    public static void main(String[] args) {
        // Static methods can be called directly without an object
        int sum = Calculator.add(10, 5);
        System.out.println("Addition With return type and static: " + sum);

        Calculator.multiply(10, 5);

        // Non-static methods require an object of the class
        Calculator calc = new Calculator();
        int difference = calc.subtract(10, 5);
        System.out.println("Subtraction With return type and non-static: " + difference);

        calc.divide(10, 5);
        
    }
}


// with return -> 1st return, 2nd main lo system no object
// without return -> 1st system,2nd  main lo main.method

// public class test {
//     //with return static
//     public static int add(int a,int b){
//         return a+b;
//     }
//     //with return non static
//     public int sub(int a,int b){
//         return a-b;
//     }
//      //without return  static
//      public static void mul(int a,int b){
//         System.out.println("Mul "+(a*b));
//      }
//       //without return non static
//       public void div(int a,int b){
//        if (b!=0){
//         System.out.println("Div"+(a/b));
//        }else{
//         System.out.println("Error: Division by zero is not allowed.");
//        }
//      }
//      public static void main(String[] args){
//         //static direct call and when we use return next system , not used return call main
//         int sum =test.add(10,5);
//         System.out.println("Add "+ sum);

//         test.mul(10,5);

//         //not use static then need object
//         test tes = new test();
//         int dif=tes.sub(10,5);
//         System.out.println("Sub "+ dif);

//         tes.div(10,5);
//      }

// }
