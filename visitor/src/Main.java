
public class Main {

	public static void main(String[] args) {
		Directory root = new Directory("root");
		Directory dir1 = new Directory("dir1");
		Directory dir2 = new Directory("dir2");
		Directory dir3 = new Directory("dir3");
		root.add(dir1);
		root.add(dir2);
		root.add(dir3);
		
		dir1.add(new File("dir1_f1", 10));
		dir1.add(new File("dir1_f2", 20));
		Directory dir1_1 = new Directory("dir1_1");
		dir1.add(dir1_1);
		dir1_1.add(new File("dir1_1_f1", 23));
		
		dir2.add(new File("dir2_f1", 22));
		
		dir3.add(new File("dir3_f1", 2));
		dir3.add(new File("dir3_f2", 2));
		
		root.accept(new PrintNameVisitor());
		SizeCalculateVisitor sizeCalculateVisitor = new SizeCalculateVisitor();
		root.accept(sizeCalculateVisitor);
		System.out.println(sizeCalculateVisitor.getSize());
	}
}
