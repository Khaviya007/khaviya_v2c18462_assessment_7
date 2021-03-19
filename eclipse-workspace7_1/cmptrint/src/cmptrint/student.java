package cmptrint;

import java.util.Comparator;  

class AgeComparator implements Comparator<Object>{  
public int compare(Object o1,Object o2){  
Employee s1=(Employee)o1;  
Employee s2=(Employee)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  


