class Encaps
{
    private int age;
    public void get()
    {
        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
    public void set(int age)
    {
        this.age=age;
    }
    public static void main(String args[])
    {
        Encaps obj=new Encaps();
        obj.set(20);
        obj.get();
    }
}