package OOPConcepts.StringLearning.example1;

public class App {
    public static void main(String args[]){
        String str1 = "Welcome";
        String str2 = "Welcome";

        String str3 = new String("Welcome");
        String str4 = new String("Welcome");


        System.out.println("Comparing literals str1 and str2 using ==");
        System.out.println(str1 == str2);

        System.out.println("*********************************");

        System.out.println("Comparing literals str1 and str2 using equals");
        System.out.println(str1.equals(str2));

        System.out.println("*********************************");

        System.out.println("Comparing objects str3 and str4 using ==");
        System.out.println(str3 == str4);

        System.out.println("*********************************");

        System.out.println("Comparing objects str3 and str4 using equals");
        System.out.println(str3.equals(str4));

        System.out.println("*********************************");

        System.out.println("hashcode of both string literals");        
        System.out.println("str1: "+str1.hashCode()+" str2: "+ str2.hashCode());

        System.out.println("*********************************");

        System.out.println("hashcode of both string objects");
        System.out.println("str3: "+str3.hashCode() + " str4: "+ str4.hashCode());


    }   
}
