public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextInt();
        char arr[] = str.toCharArray();
        int flag = 0;
        for (int i = 0,j=str.length()-1; i < j; i++,j--)
        {
            if (arr[i]!=arr[j]) {
                System.out.println("not a Palindrome");
                flag = 0;
                break;
            }
            else{
                flag = 1;
            }
        }
    }
}