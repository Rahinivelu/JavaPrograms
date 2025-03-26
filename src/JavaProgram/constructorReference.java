package JavaProgram;
class Sample{
    Sample(){
        System.out.println(" Sample class constructor executiion: ");
    }
}
interface intra{
    public Sample get();
}
public class constructorReference {
    public static  void main(String []args)
    {
       intra i=Sample::new;
       Sample s1=i.get();
    }

}
