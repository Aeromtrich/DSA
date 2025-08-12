package com.data.io;

public class FileDemo {

//    public static void main(String[] args) {
//        File dir = new File("D:\\");
//        search(dir,"QQ.exe");
//
//    }
//
//    /**
//     * 搜索文件
//     * @param dir
//     * @param name
//     */
//    public static void search(File dir,String name){
//        // 1.判断极端情况
//        if (dir == null || !dir.isFile() || !dir.exists()) {
//            return;
//        }
//        // 2.拿到文件夹一级目录
//        File[] files = dir.listFiles();
//
//        // 3.判断
//        if (files.length > 0 && files != null) {
//            // 4.遍历
//            for (File file : files) {
//                // 5.判断
//                if (file.isFile() && file.getName().contains(name)) {
//                    System.out.println(file.getAbsolutePath());
//                } else {
//                    search(file,name);
//                }
//        }
//    }
}
