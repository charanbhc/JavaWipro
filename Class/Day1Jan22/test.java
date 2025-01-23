package Class.Day1Jan22;
public class test {
    //with return static
    public static int add(int a,int b){
        return a+b;
    }
    //with return non static
    public int sub(int a,int b){
        return a-b;
    }
     //without return  static
     public static void mul(int a,int b){
        System.out.println("Mul "+(a*b));
     }
      //without return non static
      public void div(int a,int b){
       if (b!=0){
        System.out.println("Div"+(a/b));
       }else{
        System.out.println("Error: Division by zero is not allowed.");
       }
     }
     public static void main(String[] args){
        //static direct call and when we use return next system , not used return call main
        int sum =test.add(10,5);
        System.out.println("Add "+ sum);

        test.mul(10,5);

        //not use static then need object
        test tes = new test();
        int dif=tes.sub(10,5);
        System.out.println("Sub "+ dif);

        tes.div(10,5);
     }

}
