package springbootbasic.awsec2deploytest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Awsec2DeployTestApplicationTests {

    String str1 = "Hello";

    @Test
    void test() {
        assertEquals(str1, "Hello");
    }

}
