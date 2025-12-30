package Day1;

public class EncpasulationDemoMain {

	public static void main(String[] args) {
		EncapsulationDemo ed = new EncapsulationDemo();
		
		ed.setano(1001);
		ed.setaname("Sunil");
		ed.setacity("Vizag");
		
		System.out.println(ed.getacity());
		System.out.println(ed.getaname());
		System.out.println(ed.getano());
	}

}
