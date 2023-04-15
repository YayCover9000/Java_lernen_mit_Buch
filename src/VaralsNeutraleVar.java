import java.util.ArrayList;

public class VaralsNeutraleVar {
    public static void Var() {
        //using Var as a neutral type
        var age = 10;
        var name = "John";
        var pi = 3.14159;
        var list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        var notTrue = false;
        System.out.println("age = " + age + ", name = " + name + ", pi = " + pi + ", list = " + list + ", notTrue = " + notTrue);
    }
}
