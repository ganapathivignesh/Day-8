import java.io.*;
public class Pushback {
    public static void main(String[] args)throws Exception{
          String srg = "1ss2s34sss12";
          byte ary[] = srg.getBytes();
          ByteArrayInputStream array = new ByteArrayInputStream(ary);
          PushbackInputStream push = new PushbackInputStream(array);
          int i;       
              while( (i = push.read())!= -1) {
                  if(i == 's') {
                      int j;
                      if( (j = push.read()) == 's'){
                           System.out.print("**");
                      }else {
                          push.unread(j);
                          System.out.print((char)i);
                      }
                  }else {
                              System.out.print((char)i);
                  }
             }       
    }  
}