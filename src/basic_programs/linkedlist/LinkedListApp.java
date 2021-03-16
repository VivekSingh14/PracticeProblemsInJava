package basic_programs.linkedlist;
public class LinkedListApp {
    public static void main(String args[]){
        Employee employee1 = new Employee(1, 26, "Vivek", "Singh", "Baner");
        Employee employee2 = new Employee(2, 27, "Rajat", "Sharma", "Jaipur");
        Employee employee3 = new Employee(3, 29, "Akash", "banerjee", "Kolkata");
        Employee employee4 = new Employee(4, 30, "Suraj", "Kendhey", "Nagpur");
        Employee employee5 = new Employee(5, 31, "Anish", "Abrahim", "Pune");
        LinkedList list = new LinkedList();
        list.insert(employee1);
        list.insert(employee2);
        list.insert(employee3);
        list.insert(employee4);
        list.insert(employee5);
        System.out.println("**********************");
        list.display();
        System.out.println("**********************");
        System.out.println("*************Middle Node***************");
        System.out.println(list.middleNode());
        //System.out.println("******Reversed List******");
        //Node headNew = list.reverse(list.getHead());
        //list.display(headNew);
        //System.out.println("*************length of list************");
        //System.out.println("length is: " +list.lengthOfList(headNew));
        System.out.println("*********third node from last**********");
        System.out.println(list.thirdlastNode());
    }
}
