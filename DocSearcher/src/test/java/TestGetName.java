import java.io.File;

public class TestGetName {
    public static void main(String[] args) {
        File f = new File("D:\\doc_searcher_index\\jdk-8u231-docs-all\\docs\\api\\java\\util\\ArrayList.html");
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getName());
        //标题 是将获取到的文档名去掉.html,字符串截取subString() 左闭右开
        System.out.println(f.getName().substring(0, f.getName().length() - ".html".length()));  //ArrayList

    }
}
