package week1Day2;

public class Mycalculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		int resAdd = cal.add(10, 20, 30);
		int resSub = cal.sub(20, 10);
		double resMul = cal.mul(123, 2);
		float resDiv = cal.divide(30.0f, 15.0f);	
		System.out.println( "ResAdd = " + resAdd + '\n' + "ResSub = " +resSub + '\n' + "ResMul = " +resMul + '\n' + "ResDiv = " + resDiv );
		
	}

}
