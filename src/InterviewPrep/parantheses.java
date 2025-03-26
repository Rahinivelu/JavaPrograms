package InterviewPrep;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class parantheses {

    String name;
    int id;

    public parantheses(String rahini, int i) {
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        parantheses that = (parantheses) o;
        return id == that.id && Objects.equals(name, that.name);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public static void main(String[] args){

       parantheses pra=new parantheses("rahini",1);
       parantheses pra1=new parantheses("rahini",1)      ;

        Set num=new HashSet<>();
        num.add(pra);
        num.add(pra1);

        System.out.println(num);
    }
}
