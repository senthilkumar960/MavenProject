package learnstring1;

public class RegularExpression {

	public static void main(String[] args) {
/*		String text = "I am working in SCB Global services(1520112) with 20 projects";
System.out.println(text.replaceAll("[\\D]", ""));
		System.out.println(text.replaceAll("[a-zA-Z0-9]", "").replaceAll("[\\s]", ""));
	*/	
		String text = "45800054$";
		String value1= text.replaceAll("\\D", "");
		System.out.println(value1.substring(0, 5));
		
	}

}
