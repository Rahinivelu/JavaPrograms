package JavaProgram;
interface Drawable{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        //System.out.println(d.)
        System.out.println(Drawable.cube(3));

//        String a="rahini";
//        String b="rahi";
//         System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
    }}
