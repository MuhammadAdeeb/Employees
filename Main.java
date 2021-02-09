
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int size = 0;
        boolean create_num_emp_check = false;
        do{
            Scanner i = new Scanner(System.in);
            System.out.print("How many Employees will you like to create? ");
            if(i.hasNextInt() == true){
                size = i.nextInt();
                create_num_emp_check = false;
            }else{
                System.out.println("Please enter a valid input!");
                create_num_emp_check = true;
            }
        }while(create_num_emp_check == true);
        
        Employee[] employee_arr = new Employee[size];
        
        for(Employee i: employee_arr){
            System.out.println(i);
        }
        
        for(int x = 0; x < employee_arr.length; x++){
            
            Employee emp = new Employee();
            employee_arr[x] = emp;
            
            System.out.print("What's the first name of this employee: ");
            String fname = input.next();
            System.out.print("What's " + fname + "'s last name: ");
            emp.setName(fname, input.next());
            System.out.print("What's " + fname + "'s email? ");
            emp.setEmail(input.next());
            System.out.print("What's " + fname + "'s phone number? "); 
            emp.setPhone_number(input.next());
            System.out.print("What's " + fname + "'s salary? ");
            emp.setSalary(input.nextDouble());
            
            System.out.println();
        }
        
        System.out.println("\n***" + size + " employees added***\n");
        
        boolean check = true;
        do{
            
            
            System.out.println("\nPlease choose:");
            System.out.println("1. Look up more employees. ");
            System.out.println("2. Add more employees. ");
            System.out.println("3. Delete an employee. ");
            System.out.println("4. Exit");
            //Delete employees
            int choice = input.nextInt();
            
            if(choice == 1){
                System.out.print("\nEnter the last name of the employee you want to look up: ");
                String lookup = input.next();
                
                lookup = lookup.toLowerCase();
                employee_arr = find_employee(employee_arr, lookup, 1);;
            }else if(choice == 2){
                employee_arr = extend_emp_arr(employee_arr);
                continue;
            }else if(choice == 3){
                System.out.print("Enter the last name of the employee you will like to delete: ");
                String lnd = input.next();
                //System.out.print("Enter the first name of the employee you will like to delete: ");
                //String fnd = input.next();
                employee_arr = find_employee(employee_arr, lnd, 3);
                
                //first see if emp exists
                //then delete the emp
                // i) Remove him from array and leave array the same 
                // ii) Remove him and move everyone down one 
                
                
                
            }else{
                check = false;
                System.out.println("Thank you for using this program! Bye:)");
            }
            
        }while(check == true);
    }
    
    public static Employee[] extend_emp_arr(Employee[] arr){
        Scanner input = new Scanner(System.in);
        boolean no_emp_add_check = true;
        int no_emp_add = 0;
        
        do{
            Scanner i = new Scanner(System.in);
            System.out.println("How many new employees will you like to add? ");
            if(i.hasNextInt() == true){
                no_emp_add = i.nextInt();
                no_emp_add_check = false;
            }else{
                System.out.println("Please enter an interger! ");
                //no_emp_add_check = true;
            }
            
        }while(no_emp_add_check == true);
        
        Employee[] new_arr = new Employee[arr.length+no_emp_add];
        for(int i = 0; i<arr.length; i++){
            new_arr[i] = arr[i];
        }
        
        for(int x = arr.length; x< new_arr.length; x++){
            Employee emp = new Employee();
            new_arr[x] = emp;
            
            System.out.print("What's the first name of this employee: ");
            String fname = input.next();
            System.out.print("What's " + fname + "'s last name: ");
            emp.setName(fname, input.next());
            System.out.print("What's " + fname + "'s email? ");
            emp.setEmail(input.next());
            System.out.print("What's " + fname + "'s phone number? "); 
            emp.setPhone_number(input.next());
            System.out.print("What's " + fname + "'s salary? ");
            emp.setSalary(input.nextDouble());
            
            System.out.println();
        }
        
        return new_arr;
    }
    
    //public static void fill_emp_arr(int num_emp)
    
    public static Employee[] find_employee(Employee[] arr, String n, int ch){
        
        int i = 0;
        int ind = 0;
        
        for(Employee item: arr){
            if(item != null){
                if(item.ln.toLowerCase().equals(n)){
                    printEmp(item);
                    i = 1;
                    if (ch == 3){
                        System.out.println("Above Employee has been deleted!");
                        arr[ind] = null;
                    }
                }
            }
            ind++; 
        }
        
        if(i == 0){
            System.out.println("That employee does not exist. ");
        }
        return arr;
    }
    
    public static void printEmp(Employee e){
        System.out.println(e.ln + ", " + e.fn + ":" +
            "\nID: " + e.ID + 
            "\nEmail: " + e.email + 
            "\nPhone Number: " + e.phone_number + 
            "\nSalary: " + e.salary);
        System.out.println();
    }
    
    /* PRINTS ALL EMPLOYEES & THEIR INFO 
        for(int k = 0; k < 2; k++){
            
            System.out.println(employee_arr[k].name + ":\n" + 
            "ID: " + employee_arr[k].ID + 
            "\nEmail: " + employee_arr[k].email + 
            "\nPhone Number: " + employee_arr[k].phone_number + 
            "\nSalary: " + employee_arr[k].salary);
            System.out.println();
        }
        */
}

