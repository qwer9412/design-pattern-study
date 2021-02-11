
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
			System.out.println(num + ":" + name +"에서 오류 발생");
			return;
		}
		
		if (next == null) {
			System.out.println("모든 검사가 완료되었습니다.");
		} else {
			next.validCheck(num);
		}
	}
	
	protected abstract boolean isValid(int num);
}
