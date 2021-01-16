
public class BFactory extends AbstractFactory {

	@Override
	public AbstractPrint1 createPrint1() {
		return new BPrint1();
	}

	@Override
	public AbstractPrint2 createPrint2() {
		return new BPrint2();
	}
}
