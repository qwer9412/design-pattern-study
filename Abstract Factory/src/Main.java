
public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.getFactory(FactoryType.AFactory);
		AbstractPrint1 f1Print1 = factory.createPrint1();
		AbstractPrint2 f1Print2 = factory.createPrint2();
		f1Print1.print();
		f1Print2.print();
		
		AbstractFactory factory2 = AbstractFactory.getFactory(FactoryType.BFactory);
		AbstractPrint1 f2Print1 = factory2.createPrint1();
		AbstractPrint2 f2Print2 = factory2.createPrint2();
		f2Print1.print();
		f2Print2.print();
	}
}
