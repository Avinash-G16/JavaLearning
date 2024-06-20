public class StringMerge {
    public static void main(String[] args) {
        String abc = "avinash";
        String bde = "gautam";
        String ans = "";
        int n = abc.length()>=bde.length()?abc.length():bde.length();
        int i,j;
        for(i=0,j=0;i<n && j<n-1;i++,j++)
        {
            ans += abc.charAt(i);
            ans += bde.charAt(j);
        }
        ans+=abc.substring(i+1);
        // ans+=bde.substring(j+1);
        System.out.println(ans);
    }
}
