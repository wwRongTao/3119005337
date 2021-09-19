package main;

import java.io.IOException;

public class mainTest {

    @org.junit.Test
    public void testMain(){
        String[] paths = {
                "E:\\text\\orig.txt",
                "E:\\text\\orig_0.8_dis_1.txt",
                "E:\\text\\ans.txt"
        };
        try {
            textPass.main(paths);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO流异常");
        }
    }
}
