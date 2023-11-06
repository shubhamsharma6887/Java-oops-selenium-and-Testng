package testNG;


import net.bytebuddy.build.Plugin;
import org.testng.annotations.*;

public class testsuit_file {
    @BeforeTest
    public void beforetest(){
        System.out.println("Before test");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("After test");
    }


    @BeforeMethod
    public void ok(){
        System.out.println("before method");
    }

    @AfterMethod
    public void bmethod(){
        System.out.println("after method");
    }
    @Test (priority = 2)
    public void test1(){
        System.out.println("test file no 1");
    }
    @Test (priority = 3)
    public void test2(){
        System.out.println("test file no 2");
    }
    @Test (priority = 1)
    public void test3(){
        System.out.println("test file no 3");
    }
    @BeforeSuite
    public void bsuit(){
        System.out.println("before suit file of testsuit_file");
    }
    @AfterSuite
    public void asuit(){
        System.out.println("after suit file of testsuit_file");
    }
    @BeforeClass
    public void bclass(){
        System.out.println("before class file of testsuit_file");
    }
    @AfterClass
    public void aclass(){
        System.out.println("after class file of testsuit_file");
    }
}
