import java.util.*;
import java.io.*;


public class LeakyBucketAlgo {
    public static void main(String[] args) throws InterruptedException
    {
        int n, incoming, outgoing, store=0, bucketsize;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the bucket size,outgoing,no.of inputs and incoming size");
        bucketsize = sc.nextInt();
        outgoing = sc.nextInt();
        n = sc.nextInt();
        incoming = sc.nextInt();

        while(n!=0)
        {
            System.out.println("incoming size is"+ incoming);
            if(incoming <=(bucketsize-store))
            {
                store +=incoming;
                System.out.println("bucket is"+ store +"full of "+ bucketsize);

            }
            else
            {

                System.out.println("packet loss="+ (incoming-( bucketsize-store)));
                store= bucketsize;
                System.out.println("buffr is full");
            }

            store-= outgoing;
            System.out.println("after leaking"+ store +"packets are left out of"+bucketsize+ "in the buffer");
            n--;
            Thread.sleep(3000);
        }

    }
}