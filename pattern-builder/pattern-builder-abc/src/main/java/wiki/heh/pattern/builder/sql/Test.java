package wiki.heh.pattern.builder.sql;

import java.util.Arrays;

/**
* @author heh
 */
public class Test {
    public static void main(String[] args) {
        QueryRule queryRule = QueryRule.getInstance();
        queryRule.addAscOrder("age");
        queryRule.andEqual("addr","Changsha");
        queryRule.andLike("name","Tom");
        QueryRuleSqlBuilder builder = new QueryRuleSqlBuilder(queryRule);

        System.out.println(builder.builder("t_member"));

        System.out.println("Params: " + Arrays.toString(builder.getValues()));


    }
}
