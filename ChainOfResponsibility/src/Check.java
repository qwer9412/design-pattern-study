
public abstract class Check {
	
	private String name;
	private Check next;
	
	public Check(String name) {
		this.name = name;
	}
	
	public Check setNext(Check next) {
		this.next = next;
		return next;
	}
	
	public final void validCheck(int num) {
		if (!isValid(num)) {
			System.out.println(num + ":" + name +"���� ���� �߻�");
			return;
		}
		
		if (next == null) {
			System.out.println("��� �˻簡 �Ϸ�Ǿ����ϴ�.");
		} else {
			next.validCheck(num);
		}
	}
	
	protected abstract boolean isValid(int num);
}
