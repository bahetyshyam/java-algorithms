import java.math.BigInteger;
import java.util.*;
class p11RSAEncDec
{
public static void main(String[] args)
{

BigInteger bigB_pubkey = new BigInteger("23"); 
BigInteger bigB_prvkey = new BigInteger("1842164816712769847"); 
BigInteger bigB_n = new BigInteger("7061631802729009463"); 
BigInteger bigB_val=new BigInteger("12345");
BigInteger bigB_cipherVal=bigB_val.modPow(bigB_pubkey,bigB_n); 
System.out.println("Cipher text: " + bigB_cipherVal);
BigInteger bigB_plainVal=bigB_cipherVal.modPow(bigB_prvkey,bigB_n); 
System.out.println("Plain text: " + bigB_plainVal);
}
}



