import java.util.*;
import java.math.BigInteger;
import java.lang.*;

class p11RSAkeygen
{
public static void main(String[] args)
{

Random rand1=new Random(System.currentTimeMillis()); 
Random rand2=new Random(System.currentTimeMillis()*10);

int pubkey=Integer.parseInt("20");

BigInteger bigB_p=BigInteger.probablePrime(32, rand1);
BigInteger bigB_q=BigInteger.probablePrime(32, rand2);

BigInteger bigB_n=bigB_p.multiply(bigB_q);

BigInteger bigB_p_1=bigB_p.subtract(new BigInteger("1"));
BigInteger bigB_q_1=bigB_q.subtract(new BigInteger("1"));

BigInteger bigB_p_1_q_1=bigB_p_1.multiply(bigB_q_1);

while(true)
{

BigInteger BigB_GCD=bigB_p_1_q_1.gcd(new BigInteger(""+pubkey)); 
if(BigB_GCD.equals(BigInteger.ONE))

{
break;
}
pubkey++;
}
BigInteger bigB_pubkey=new BigInteger(""+pubkey);
BigInteger bigB_prvkey=bigB_pubkey.modInverse(bigB_p_1_q_1);
System.out.println("public key : "+bigB_pubkey+","+bigB_n);
System.out.println("private key : "+bigB_prvkey+","+bigB_n);
}
}
