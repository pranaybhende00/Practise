package designpatterns2;

public class EgarInstMain {
public static void main(String[] args)
{
EgarInst egarInst=EgarInst.getObject();
System.out.println(egarInst);
EgarInst egarInst2=EgarInst.getObject();
System.out.println(egarInst2);
}
}
