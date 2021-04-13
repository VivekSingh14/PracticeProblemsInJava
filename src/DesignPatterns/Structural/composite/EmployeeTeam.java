package DesignPatterns.Structural.composite;

public class EmployeeTeam extends Employee{
    
    public EmployeeTeam(String name) {
 
        this.name = name;
    }
 
    @Override
    void add(Employee employee) {
 
        this.employees.add(employee);
    }
 
    @Override
    void remove(Employee employee) {
 
        this.employees.remove(employee);
    }

    public long getCostToCompany(){
        long cost = 0;
        if(this.employees != null){
            for(Employee e : this.employees){
                if(e instanceof IndividualEmployee){
                    System.out.println("Cost to company of " +(String)e.getName());
                    System.out.println(e.getCostToCompany());
                }
                cost += e.getCostToCompany();
            }
        }
        return cost;
    }


}
