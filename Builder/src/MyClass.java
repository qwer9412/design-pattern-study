
public class MyClass {
	private int a;
	private String b;
	private float c;

	public static class Builder {
		private int a;
		private String b;
		private float c;
		
		public Builder(int a) {
			this.a = a;
		}
		
		public Builder b(String b) {
			this.b = b;
			return this;
		}
		
		public Builder c(float c) {
			this.c = c;
			return this;
		}
		
		public MyClass build() {
			return new MyClass(this);
		}
	}
	
	private MyClass(Builder builder) {
		this.a = builder.a;
		this.b = builder.b;
		this.c = builder.c;
	}
}
