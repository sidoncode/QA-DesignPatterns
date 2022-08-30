package CompositePattern;

public class CompositePatternDemo {

    public static void main(String [] args){

        Employee CEO = new Employee("John","CEO",200000000);

        Employee headSales = new Employee("Rpbert","head Sales",12021);

        Employee headMarketing = new Employee("Michel","headMarketing",9020);

        Employee Clerk1 = new Employee("Thomas","Clerk",9821);
        Employee Clerk2 = new Employee("Eric","Clerk",1254);

        Employee SalesExecutive1 = new Employee("Anoop","Sales Executive",6710);
        Employee SalesExecutive2 = new Employee("Will","Sales Executive",4670);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(SalesExecutive1);
        headSales.add(SalesExecutive2);

        headMarketing.add(Clerk1);
        headMarketing.add(Clerk2);

        System.out.println(CEO);

        for(Employee headEmployee : CEO.getSubordinates()){
            System.out.println(headEmployee);
            for (Employee employee: headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }
    }
}
