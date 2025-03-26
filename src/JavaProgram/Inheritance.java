package JavaProgram;

public class Inheritance {
    String name="Rahini";
}
class SubInheritance extends Inheritance{
    float Salary=800000;

public static void main(String []args){
    SubInheritance sb=new SubInheritance();
   System.out.println(sb.name +" name");
    System.out.println(sb.Salary+ " Salary");
    String a="Rahi";
    String b="rahi";
    System.out.println(a.hashCode());
    Integer bh=890;
    //Integer bh=bh.
    System.out.println(b.hashCode());
}
}