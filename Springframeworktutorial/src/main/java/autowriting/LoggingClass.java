package autowriting;

public class LoggingClass {
	private ClassA classA;
	private ClassB classB;
	public ClassA getClassA() {
		return classA;
	}
	public void setClassA(ClassA classA) {
		this.classA = classA;
	}
	public ClassB getClassB() {
		return classB;
	}
	public void setClassB(ClassB classB) {
		this.classB = classB;
	}
	public void getmethod1(String text) {
		classA.Write(text);
		
	}
	public void getmethod2(String text) {
		// TODO Auto-generated method stub
		classB.Write(text);
	}
	
}
