package TestNGPackage;

import org.testng.annotations.Test;

public class keywords 
{
 
 @Test (invocationCount = 3, dependsOnMethods = "c", groups = "functional")
 public void a()
 {
	 System.out.println("I am method a");
 }
 
 @Test (groups = "non-functional")
 public void b()
 {
	 System.out.println("I am method b");
 }
 
 @Test (invocationCount = 2, priority = 1, groups = "functional")
 public void c()
 {
	 System.out.println("I am method c");
 }
 
 @Test (priority = 2, groups = "non-functional")
 public void d()
 {
	 System.out.println("I am method d");
 }
 
 @Test (priority = 3, enabled = true, groups = "functional")
 public void e()
 {
	 System.out.println("I am method e");
 }
 
 @Test (timeOut = 1000, groups = "non-functional")
 public void f() throws InterruptedException
 {
	 Thread.sleep(950);
	 System.out.println("I am method f");
 }
}
