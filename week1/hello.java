import java.util.Scanner;

class Rectangle{

	double length,width;

	public void getInformation(){
		Scanner sc = new Scanner(System.in);
		length = sc.nextDouble();
		width = sc.nextDouble();
        sc.close();
	}

	public void display(){
		System.out.println("Area: " + (length*width));
		System.out.println("Perimeter: " + (length+width)*2);
	}
	

}
