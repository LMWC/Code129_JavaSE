package com.itheima.demo11_JUnit单元测试;

import org.junit.*;

public class JunitTest {

    //@Test  被修饰的方法可以直接执行,不需要main方法。
    //@Before  修饰非静态方法,在@Test修饰的方法之前执行,@Before修饰多个方法时,按照方法名降序执行。
    //@After  修饰非静态方法,在@Test修饰的方法之后执行,@ After修饰多个方法时,按照方法名升序执行。
    //@BeforeClass 修饰静态方法,在@Before修饰的方法之前执行,只会执行一次
    //@AfterClass  修饰静态方法,在@After修饰的方法之后执行,只会执行一次


    @Test
    public void method() {
        System.out.println("test1........");
    }
    @Test
    public void method2() {
        System.out.println("test2........");
    }
    @BeforeClass
    public static void staticBefore1() {
        System.out.println("staticbefore1........");
    }
    @BeforeClass
    public static void staticBefore2() {
        System.out.println("staticbefore2........");
    }


    @Before
    public void before1() {
        System.out.println("before1........");
    }
    @Before
    public void before2() {
        System.out.println("before2........");
    }




    @AfterClass
    public static void staticAfter2() {
        System.out.println("staticafter2........");
    }

    @AfterClass
    public static void staticAfter1() {
        System.out.println("staticafter1........");
    }

    @After
    public void After2() {
        System.out.println("After2........");
    }

    @After
    public void After1() {
        System.out.println("After1........");
    }

}
