package ppppp;

import org.junit.jupiter.api.*;

/**
 * @author lppppp
 * @create 2021-03-28 8:46
 */
@DisplayName("测试 class")
public class Junit5Test {

    @Disabled
    @DisplayName("测试方法1")
    @Test
    public void T(){
        System.out.println("么么哒1...");
    }
    @DisplayName("测试方法2")
    @Test
    public void T2(){
        System.out.println("么么哒2...");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("测试即将开始...");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("测试即将结束...");
    }

    @AfterAll
    static public void afterAll(){
        System.out.println("所有--- 测试即将结束...");
    }

    @BeforeAll
    static public void beforeAll(){
        System.out.println("所有--- 测试即将开始...");
    }










}
