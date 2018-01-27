package md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Test {
    public String getMd5(String msg) throws NoSuchAlgorithmException {
        final MessageDigest md5 = MessageDigest.getInstance("MD5");
        final byte[] bytes = msg.getBytes();
        md5.update(bytes);
        final byte[] b = md5.digest();
        return getstring(b);


    }
    private  String getstring(byte[] temp){
        StringBuffer buf=new StringBuffer();
        for (int i = 0; i <temp.length ; i++) {
            int a= temp[i];
            if(a<0){
                a+=256;
            }
            if(a<16){
                buf.append("0");
            }
            buf.append(Integer.toHexString(a));
        }
        return  buf.toString();
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        MD5Test md=new MD5Test();
        String msg="123456";
        final String s = md.getMd5(msg);
        System.out.println(s);
    }

}
