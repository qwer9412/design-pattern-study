
public class AFactory extends AbstractFactory {

	@Override
	public AbstractPrint1 createPrint1() {
		return new APrint1();
	}

	@Override
	public AbstractPrint2 createPrint2() {
		return new APrint2();
	}
}
