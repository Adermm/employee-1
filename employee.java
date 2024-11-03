
package em;


public class employee {
   
    
    private String firstname;
    private String lastname;
    private double Msalary;
    
    
    public employee(String firstname,String lastname,double Msalary){
    
    this.firstname=firstname;
    
    this.lastname=lastname;
    this.Msalary=Msalary;
    }
    
    public void setFM(String fn){
firstname=fn;}
    
    public String getFN(){
    
    return firstname;
    }
    public void setLN(String ln){
    lastname=ln;
    }
    public String getLN(){
    return lastname;
    }
    
    public void setMS(double mn){
        if(mn>0){
    Msalary=mn;
        
        }
    }
    public double getMS(){
    return Msalary;
    }
     public void dysplay(){
        
         //if (i==1){
        
         System.out.println(firstname+" "+lastname+"\t\t"+Msalary);
          System.out.println(" 10 Percent Salary Raised!! /n");
     
       double x= this.Msalary+(this.Msalary*(100/10));
        System.out.println(firstname+" "+lastname+"\t\t"+(x));
      
      
      
      
      
     }
    
}
