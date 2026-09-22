import java.util.Scanner;
public class Basicloops {
    public static void main( String[] args){
      Scanner sc= new Scanner(System.in);

//        Sum of first N natural numbers.

        System.out.println(" enter a number ");
        int a= sc.nextInt();
        int sum=0;
        for( int i=1;i<=a;i++){
            sum= sum+i;
        }
        System.out.println(sum);


//        Sum of even numbers up to N.

        System.out.println(" enter a number ");
        int b= sc.nextInt();
        int sum2=0;
        for( int i=2; i<=b;i+=2){
           sum2=sum2+i;
        }
        System.out.println(sum2);


//        Sum of odd numbers up to N.

        System.out.println(" enter a number ");
        int c= sc.nextInt();
        int sum3=0;
        for( int i=0; i<=c;i++){
            if( i%2!=0){
                sum3=sum3+i;
            }
        }System.out.println(sum3);


//        Product of numbers from 1 to N.

        System.out.println(" enter a number ");
        int d= sc.nextInt();
        int sum4 =1;
        for( int i=1; i<=d;i++){
            sum4=sum4*i;
        }
        System.out.println(sum4);




//        Factorial of a number.



        System.out.println(" enter a number ");
        int e= sc.nextInt();
        int sum5=1;
        for( int i=1; i<=e;i++){
            sum5=sum5*i;
        }
        System.out.println(sum5);



//        Sum of squares from 1 to N.

        System.out.println(" enter a number ");
        int f=sc.nextInt();
        int sum10=0;
                for(int i=1;i<=f;i++){
                    int temp=i*i;
                    sum10=sum10+temp;
                }
        System.out.println(sum10);


//        Sum of cubes from 1 to N.


        System.out.println(" enter a number ");
        int g=sc.nextInt();
        int sum6=0;
        for(int i=1;i<=g;i++){
            int temp=i*i*i;
            sum6=sum6+temp;
        }
        System.out.println(sum6);


//        Average of N numbers.


        System.out.println(" enter a number ");
        int h=sc.nextInt();
                double sum7=0;
        for( int i=1;i<=h;i++){
            sum7=sum7+i;
        } double temp = sum7/h;
        System.out.println(temp);


//        Sum of multiples of 3 up to N.


        System.out.println(" enter a number ");
        int k= sc.nextInt();
        int sum8=0;
        for( int i=1;i<=k;i++){
            if (i % 3 == 0) {
                sum8=sum8+i;
            }
        } System.out.println(sum8);



//          Product of even numbers up to N.


        System.out.println(" enter a number ");
        int j= sc.nextInt();
        int sum9=0;
        for( int i=2;i<=j;i+=2){
            sum9=sum9*i;
        }
        System.out.println(sum9);


//        multiplication table of any number

        System.out.println(" enter a number ");
        int l= sc.nextInt();
        for( int i=1;i<=10;i++){
            System.out.println(i*l);
        }

    }
}
