
public abstract class AbstractFactory {
	public static AbstractFactory getFactory(FactoryType factoryType) {
		String className = factoryType.name();
		AbstractFactory factory = null;
		try {
			factory = (AbstractFactory) Class.forName(className).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return factory;
	}
	public abstract AbstractPrint1 createPrint1();
	public abstract AbstractPrint2 createPrint2();
}
