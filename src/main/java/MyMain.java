import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int b=(int) (Math.random()*6)+1;
        return b;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int q=0;
        int w=0;
        int e=0;
        int r=0;
        int t=0;
        int y=0;
        int u=0;
        int i=0;
        int o=0;
        int p=0;
        int s=0;
        for (int h=0; h<=n; h++){
            int f=(int) (Math.random()*6)+1;
            int g=(int) (Math.random()*6)+1;
            if (f+g==2){
                q++;
            }
            else if (f+g==3){
                w++;
            }
            else if (f+g==4){
                e++;
            }
            else if (f+g==5){
                r++;
            }
            else if (f+g==6){
                t++;
            }
            else if (f+g==7){
                y++;
            }
            else if (f+g==8){
                u++;
            }
            else if (f+g==9){
                i++;
            }
            else if (f+g==10){
                o++;
            }
            else if (f+g==11){
                p++;
            }
            else{
                s++;
            }
        }
        int[] smilly=new int[] {q,w,e,r,t,y,u,i,o,p,s};
        return smilly;
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many pair of dice would you like to roll?");
        int n=scan.nextInt();
        int[] smilly=sumOfTwoDice(n);
        for (int z=0; z<smilly.length; z++){
            System.out.println("% of rolls where sum == "+(z+2)+ ": "+smilly[z]/((double)n)*100);
        }
    }
}
