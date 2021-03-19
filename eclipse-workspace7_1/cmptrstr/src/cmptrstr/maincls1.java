package cmptrstr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Simple
{
public static void main(String args[]){  
  
ArrayList<Employee> al=new ArrayList<Employee>();  
al.add(new Employee(101,"Tinku",23));  
al.add(new Employee(106,"Pinky",27));  
al.add(new Employee(105,"Jesy",21));  
  

  
System.out.println("Sorting by age");  
  
Collections.sort(al,new NameComparator());  
Iterator<Employee> itr2=al.iterator();  
while(itr2.hasNext()){  
Employee st=(Employee)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
  }
}

