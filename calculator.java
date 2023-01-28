public class calculator {
    public static double findAverage(double a, double b, double c) {
		return (a+b+c)/3;
	}
	
	public static double findAverage(double a, double b, double c, double d) {
		return (a+b+c+d)/3;
	}
	
	public static double findAverage(double a, double b, double c, double d, double e) {
		return (a+b+c+d+e)/3;
	}
    public static void main(String[] args) {
		
		System.out.println(Math.round(findAverage(1.0,2.0,3.0)*100.0)/100.0);
		System.out.println(Math.round(findAverage(1.0,2.0,3.0,4.0)*100.0)/100.0);
		System.out.println(Math.round(findAverage(1.0,2.0,3.0,4.0,5.0)*100.0)/100.0);

	}
}
