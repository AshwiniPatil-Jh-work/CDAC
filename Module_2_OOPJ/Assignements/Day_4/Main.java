package ass3_1;

public class Main {

	public static void main(String[] args) {
        BmiTrack obj1 = new BmiTrack();
		
		obj1.acceptRecord();
		obj1.calculateBMI();
		obj1.classifyBMI();
		obj1.printRecord();
	}

}
