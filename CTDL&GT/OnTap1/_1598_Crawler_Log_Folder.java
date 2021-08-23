package OnTap1;

public class _1598_Crawler_Log_Folder {
    public static void main(String[] args) {
        String[] s = {"d1/","d2/","../","d21/","./","a25","b52","./","../"};
        System.out.println(minOperations(s));
    }

    public static int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if(logs[i].equals("../")) {
                if(count > 0) {
                    count--;
                }
            }else if(logs[i].equals("./")){
                continue;
            }else {
                count++;
            }
        }
        return count;
    }
}
