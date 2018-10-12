package PyramidDemo;

import java.io.*;  

public class PyramidDemo {
	public static void main(String[] args)   
	{  
	    Dayin dayin=new Dayin();  
	    dayin.Dayin1();  
	}  

}
class Dayin  
{  
public void Dayin1()  
{  
    try  
    {  
        BufferedReader br;  
        br = new BufferedReader(new InputStreamReader(System.in));  
        System.out.println("请输入金字塔层数：");  
        String ceng1=br.readLine();  //从控制台读取
        int ceng = Integer.parseInt(ceng1);  //把string->int

        for (int i=0;i<ceng;i++ )  
        {  
            for (int k=1;k<ceng-i ;k++ )  //空格规律
            {  
                System.out.print(" ");  //打印空格
            }  
                for (int j=0; j<=i;j++ ) 
                {  
                    System.out.print("*"+" ");  //打印星和空格
                }
              //for(int j=1; j<=(i*2)+1; j++){ System.out.print("*");}
              
            System.out.print("\n");  
        }
    }  
    catch (Exception e)  
    {  
        e.printStackTrace();  
    }  
          
}
}
