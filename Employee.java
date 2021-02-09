public class Employee{
    public String fn;
    public String ln;
    public String email;
    public String phone_number;
    public String phone_extn;
    private static int statID = 20200;
    public int ID;
    public double salary;
    
    public void setName(String fn, String ln){
        this.fn = fn;
        this.ln = ln;
        setID(statID);
        statID++;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }
    public void setPhone_extn(String phone_extn){
        this.phone_extn = phone_extn;
    }
    public void setID(int id){
        this.ID = id;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    /*
    public String getname(){
        return name;
    }
    */
    public String getEmail(){
        return email;
    }
    public String getPhone_number(){
        return phone_number;
    }
    public String getPhone_extn(){
        return phone_extn;
    }
    public int getID(){
        return ID;
    }
    public double getSalary(){
        return salary;
    }
}