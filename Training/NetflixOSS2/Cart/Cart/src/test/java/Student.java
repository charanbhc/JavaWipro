public class Student //User defined datatype
{
    //Instance variables. They are associated with an instance.
    static String University; //static variable
    int  RollNo; //instance variables
    String Name; //instance variables
    float   fees; //instance variables
    public static String getUniversity() {
		return University;
	}
	public static void setUniversity(String university) {
		University = university;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	public int getCurrentSem() {
		return currentSem;
	}
	public void setCurrentSem(int currentSem) {
		this.currentSem = currentSem;
	}
	public boolean isJoined() {
		return joined;
	}
	public void setJoined(boolean joined) {
		this.joined = joined;
	}
	int  currentSem; //instance variables
    boolean joined; //instance variables
    public Student() //Constructor. It is executed when the object is created.
    {
        System.out.println("Student enrolled into the course");
    }
    //In Java, every function must have a return type. If no return type is 
    //mentioned, it should be void
    int getRollNo(){
        //All getter method names will start with the word get. Return type matches with the datatype of the variable.
        System.out.println("Retrieve RollNo....");
        return RollNo;
    }
    void setRollNo(int RollNo)
    {
        //All setter method names will start with the word set. Return type is normally void.
        RollNo=RollNo;
        System.out.println("RollNo changed...");
    }
    String  getName(){
    	System.out.println("Name retrieved...");
        return Name;
        
    }
    void setName(String Name){
        Name=Name;
        System.out.println("Name changed...");
    }
}
