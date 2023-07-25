package day01.Solved2;

public class MyClass {
	
	public int instanceVariable;

    public static void main(String[] args) {
        // Create an object of MyClass
        MyClass myObject = new MyClass();

        // Access the instance variable using the object reference
        myObject.instanceVariable = 5;
        System.out.println(myObject.instanceVariable);
    }	

}
