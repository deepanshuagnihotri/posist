package com.encryption;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
public class encryption
{
    public void user_enc() 
    {
        try 
        {
            String ownerid = "2";
            float value= "586.20"
			String ownername="Deepanshu"
			String key= "abcd0908lkjqwe09"; // custom encrypt key
			hash h[]={ownerid,value,owner_name}
			
            // make key and cypher
            Key aesKey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            
			//Encryption Occurs
			
			System.out.println("Encryption Process Loading");            
			
            cipher.init(Cipher.ENCRYPT_MODE, aesKey);
            byte[] encrypted = cipher.doFinal(text.getBytes());
            System.err.println(new String(encrypted));
            
			
			//Decryption Occurs
			
			
			System.out.println("Decryption Process Loading");            
			
			
			
			cipher.init(Cipher.DECRYPT_MODE, aesKey);
            String decrypted = new String(cipher.doFinal(encrypted));
            System.err.println(decrypted);
        }
        catch(Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) 
    {
        AES encrypt = new AES();
        encrypt.user_enc();
    }
}