public class pal{
    public static void main(String[] args) {
        int num = 14541;
        int originalnum = num;
        int reversenum = 0;
        int remainder;

        while (num>0){
            remainder = num % 10;
            reversenum = reversenum * 10 + remainder;
            num /= 10;

        }

        if(originalnum == reversenum){
            System.out.println(originalnum + " ia a palindrome number");
        }
        else{
            System.out.println(originalnum + " is not a palindrome numbner");
        }
    }
}