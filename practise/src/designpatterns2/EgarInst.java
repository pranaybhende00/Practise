package designpatterns2;

public class EgarInst {
private static EgarInst egarInst= new EgarInst();
	private EgarInst() {
		System.out.println("Const Acces");
	}
	public static EgarInst getObject() {
		return egarInst;
	}

}
