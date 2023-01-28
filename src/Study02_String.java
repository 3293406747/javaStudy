/**
 * 转义字符
 * \n转行符    \t制表符   \\防转义符  \r回车符
 */
public class Study02_String {
    public static void main(String[] args) {
        System.out.println("hello world");          // println自动换行 print不自动换行
        System.out.print("hello\nworld");          // \n转行符
        System.out.println("hello\tworld");         // \t制表符
        System.out.println("hello\\world");         // \\防转义符
        System.out.println("hello\rworld");     // \r 回车符（会清除本行前面的内容）
    }
}
