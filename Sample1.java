class Sample1
 {

int a=10;

static int b=20;
    
void show()

{
int c=30; 
System.out.println("a="+a);

System.out.println("b="+b);

System.out.println("c="+c);

 }
void display()
{
int c=30;
System.out.println("a="+a);

System.out.println("b="+b);

System.out.println("c="+c);

 }                                    
                                          
    
public static void main(String args[]) 
{
       
Sample1 s1=new Sample1();
 
s1.show();
s1.display();      
   
 }

}