
package gitdemo;

import java.util.Scanner;

/**
 *
 * @author Megha Patel
 */
public class StudList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Student s=new Student();
        Student[] sList=new Student[4];
        
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<sList.length;i++){
            System.out.println("Enter student id: ");
            int sid=sc.nextInt();
            
            System.out.println("Enter student name: ");
            String sname=sc.next();
            
            Student s1=new Student(sid,sname);
            sList[i]=s1;
            
        }
        
        
        for(Student s2:sList)
        {
            System.out.println(s2.getStudId()+s2.getStudName());
        }
        
        
        
    }

}
