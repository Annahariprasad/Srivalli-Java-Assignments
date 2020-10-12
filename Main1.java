//DAY 3 - ASSIGNMENT_1
import java.util.Scanner;
class Main1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
		int math, scien, soc, hin, eng;
		
		System.out.println("<--Enter Student Details-->");
		System.out.print("\nEnter Name : ");
		String name = s.next();
		System.out.print("Enter MATHS marks out of 100 marks: ");
		math = s.nextInt();
		System.out.print("Enter SCIENCE marks out of 100 marks : ");
		scien  = s.nextInt();
		System.out.print("Enter SOCIAL marks out of 100 marks : ");
		soc = s. nextInt();
		System.out.print("Enter HINDI marks out of 100 marks : ");
		hin = s.nextInt();
		System.out.print("Enter English marks out of 100 marks : ");
		eng = s.nextInt();
		
		int total = math + scien + soc + hin + eng;
		int per = (total*100)/500;
		
		System.out.println("\n<--Student marks details-->");
		System.out.println("\nName  : "+name);
		System.out.println("Total marks out of 500 : "+total);
		System.out.println("Percentage marks out of 100% : "+per+"%");
		
		if(per>=90) {
			System.out.println("Hey, You got 'A' grade");
		} else if(per>=75) {
			System.out.println("You got 'B' grade");
		} else if(per>=45) {
			System.out.println("You got 'C' grade");
		} else if(per>=25) {
			System.out.println("You got 'D' grade");
		} else {
			System.out.println("You failed plz Study well");
		}
    }
}