/**
 * 使用递归 展示文件夹下所有文件，包括子文件下的文件
 */

import java.io.File;

public class Study50_Recursion {
    public static void main(String[] args) {
        File file = new File("D:\\Download");
        showFiles(file);
    }

    public static void showFiles(File file) {
        File[] files = file.listFiles();
        if (files == null) return;
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            } else if (f.isDirectory()) {
                showFiles(f);
            }
        }
    }
}
