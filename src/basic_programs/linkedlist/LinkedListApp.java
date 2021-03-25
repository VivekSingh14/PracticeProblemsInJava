package basic_programs.linkedlist;

import java.util.ArrayList;

public class LinkedListApp {
    public static void main(String args[]){
        Employee employee1 = new Employee(7, 26, "Vivek", "Singh", "Baner");
        Employee employee2 = new Employee(2, 27, "Rajat", "Sharma", "Jaipur");
        Employee employee3 = new Employee(3, 29, "Akash", "banerjee", "Kolkata");
        Employee employee4 = new Employee(4, 30, "Suraj", "Kendhey", "Nagpur");
        Employee employeecopy = new Employee(3, 29, "Akash", "banerjee", "Kolkata");
        Employee employee5 = new Employee(5, 31, "Rajesh", "Abrahim", "Pune");
        LinkedList list = new LinkedList();
        list.insert(employee1);
        list.insert(employee2);
        list.insert(employee3);
        list.insert(employee4);
        list.insert(employee5);
        list.insert(employeecopy);


        /*method overloading + constructor overloading(testing purpose)
        /list.insert(employee5, list.getHead());*/


        System.out.println("**********************");
        list.display();
        System.out.println("**********************");
        //System.out.println("*************Middle Node***************");
        //System.out.println(list.middleNode());
        //System.out.println("******Reversed List******");
        //Node headNew = list.reverse(list.getHead());
        //list.display(headNew);
        //System.out.println("*************length of list************");
        //System.out.println("length is: " +list.lengthOfList(headNew));
        //System.out.println("**********third node from last**********");
        //System.out.println(list.thirdlastNode());

        // checking if list is circular !
        //System.out.println("is list circular: "+ list.isCircular());

        //for finding the sum of two list purpose created other list list2.
        //LinkedList list2 = new LinkedList();
        //list2.insert(employee2);
        //list2.insert(employee3);

        //System.out.println("size of list1: "+list.lengthOfList(list.getHead()));

        //System.out.println("size of list2: " + list2.lengthOfList(list2.getHead()));
        
        //System.out.println("********Sum of two lists*********");
        /*ArrayList<Integer> sum = list.sum(list.getHead(), list2.getHead()); 
        for(int i = sum.size()-1; i >=0; i--){
            System.out.print(sum.get(i)+" ");
        }
        System.out.println();*/
        list.removeDuplicate(list.getHead());
        System.out.println("after removing the duplicate.");
        list.display();


    }
}
