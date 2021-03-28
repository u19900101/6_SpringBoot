package ppppp;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author lppppp
 * @create 2021-03-28 9:35
 */
public class AssertTest {
    int sum(int a,int b){
        return a+b;
    }

    @Test
    public void T_assert(){
        assertEquals(6, sum(2,3), "业务逻辑计算失败");
    }
}
