import java.util.*;
class Seatingarrangement{
    public static void main(String arg[]){
        int tc;
        Scanner Tc = new Scanner(System.in);
        tc = Tc.nextInt();
        while(tc-->0){
            int num = Tc.nextInt();
            if(num%3==2){
                if((num/6)%2==0){
                    if(num%2==0)
                        num+=9;
                    else
                        num+=3;
                }
                else{
                    if(num%2==0)
                        num-=3;
                    else
                        num-=9;
                }
                System.out.print(num);
                System.out.println(" MS");                
            }
            else if((num/3)%2==1){
                if((num/6)%2==0){
                    if(num%2==0)
                        num+=5;
                    else
                        num+=7;
                }
                else{
                    if(num%2==0)
                        num-=7;
                    else
                        num-=5;
                }
                System.out.print(num);
                System.out.println(" AS");
            }
            else if((num/3)%2==0){
                if((num/6)%2==0){
                    if(num%2==0)
                        num-=11;
                    else
                        num+=11;
                }
                if((num/6)%2==1){
                    if(num%2==0)
                        num+=1;
                    else
                        num-=1;
                }
                System.out.print(num);
                System.out.println(" WS");
            }
        }
        Tc.close();
    }
}