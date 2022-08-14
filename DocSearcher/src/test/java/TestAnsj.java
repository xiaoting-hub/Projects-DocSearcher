import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.util.List;

public class TestAnsj {
    public static void main(String[] args) {
        // 准备一个比较长的话, 用来分词
        String str = "小明毕业于清华大学计算机专业. 后来又去蓝翔技校和新东方深造. 擅长使用计算机控制挖掘机来炒菜";
        //String str = "I have a dream!";  //针对英文分词，会将大写转为小写

        // Term 就表示一个分词结果.
        List<Term> terms = ToAnalysis.parse(str).getTerms();
        //System.out.println(terms);  // 结果是[i/en,  , have/en,  , a/en,  , dream/en, !/w]
        for (Term term : terms) {
            System.out.println(term.getName());  //获取到分词结果中的每个词
        }
    }
}

//直接运行结果会爆红是因为ansj要加载相应的词典文件，但是我们没有加载也不影响。