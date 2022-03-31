public class Str_hyphen {
    public static void main(String args[]) {
        String str = "134-10/55z66 A-block, Manyata Tech-Park ";
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='-'&&str.charAt(i-1)>='0'&&str.charAt(i-1)<='9'&&str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')
            {
                sb.deleteCharAt(i);
            }
        }
        System.out.println("The string is "+sb);
    }
}
