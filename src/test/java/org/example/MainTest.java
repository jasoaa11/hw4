package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testMainWithValidInput() {
        // 保存原始的System.in和System.out
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;

        try {
            // 设置虚拟的System.in
            String input = "85\n"; // 模拟用户输入85
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // 设置虚拟的System.out
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // 调用main方法
            Main.main(new String[]{});

            // 获取main方法的输出
            String output = outputStream.toString().trim();

            // 进行断言，根据实际情况修改
            assertEquals("Enter the score = The grade of 85 is B", output);
        } finally {
            // 恢复原始的System.in和System.out
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }

    @Test
    void testMainWithInvalidInput() {
        // 保存原始的System.in和System.out
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;

        try {
            // 设置虚拟的System.in
            String input = "abc\n"; // 模拟用户输入非整数
            System.setIn(new ByteArrayInputStream(input.getBytes()));

            // 设置虚拟的System.out
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // 调用main方法
            Main.main(new String[]{});

            // 获取main方法的输出
            String output = outputStream.toString().trim();

            // 进行断言，根据实际情况修改
            assertEquals("Enter the score = Not an integer!", output);
        } finally {
            // 恢复原始的System.in和System.out
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }

    @Test
    void testMainWithIOException() {
        // 保存原始的System.in和System.out
        InputStream originalSystemIn = System.in;
        PrintStream originalSystemOut = System.out;

        try {
            // 模拟一个会导致IOException的情况
            System.setIn(new InputStream() {
                @Override
                public int read() throws IOException {
                    throw new IOException("Simulated IOException");
                }
            });

            // 设置虚拟的System.out
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outputStream));

            // 调用main方法
            Main.main(new String[]{});

            // 获取main方法的输出
            String output = outputStream.toString().trim();

            // 进行断言，根据实际情况修改
            assertEquals("Enter the score =", output);
        } finally {
            // 恢复原始的System.in和System.out
            System.setIn(originalSystemIn);
            System.setOut(originalSystemOut);
        }
    }

    @Test
    public void test_99to101() {
        Assertions.assertEquals('X', Main.letterGrade(101));
        Assertions.assertEquals('A', Main.letterGrade(100));
        Assertions.assertEquals('A', Main.letterGrade(99));
    }
    @Test
    public void test_89to91() {
        Assertions.assertEquals('A', Main.letterGrade(91));
        Assertions.assertEquals('A', Main.letterGrade(90));
        Assertions.assertEquals('B', Main.letterGrade(89));
    }
    @Test
    public void test_79to81() {
        Assertions.assertEquals('B', Main.letterGrade(81));
        Assertions.assertEquals('B', Main.letterGrade(80));
        Assertions.assertEquals('C', Main.letterGrade(79));
    }
    @Test
    public void test_69to71() {
        Assertions.assertEquals('C', Main.letterGrade(71));
        Assertions.assertEquals('C', Main.letterGrade(70));
        Assertions.assertEquals('D', Main.letterGrade(69));
    }
    @Test
    public void test_59to61() {
        Assertions.assertEquals('D', Main.letterGrade(61));
        Assertions.assertEquals('D', Main.letterGrade(60));
        Assertions.assertEquals('F', Main.letterGrade(59));
    }
    @Test
    public void test_minus1to1() {
        Assertions.assertEquals('F', Main.letterGrade(1));
        Assertions.assertEquals('F', Main.letterGrade(0));
        Assertions.assertEquals('X', Main.letterGrade(-1));
    }

    // 添加更多测试用例以覆盖其他情况
}
