/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qrcode;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;

/**
 *
 * @author SravanChowdary
 */
public class Test1 
{
    public static void main(String ar[])
    {
         try
        {
            BufferedImage bi=ImageIO.read(new File("gr.jpg"));
            int h=bi.getHeight();
            int w=bi.getWidth();
            
            for(int i=0;i<w;i++)
            {
                for(int j=0;j<h;j++)
                {
                    Color c = new Color(bi.getRGB(j, i));
                    int r=c.getRed();
                    int g=c.getGreen();
                    int b=c.getBlue();
                    
                    
                    System.out.print((r+g+b)/3+" ");
                }
                System.out.println();
            }
           /* int h=60;
            int w=60;
           
            BufferedImage bi1=new BufferedImage(w,h,BufferedImage.TYPE_BYTE_BINARY);
            for(int i=0;i<w;i++)
            {
                for(int j=0;j<h;j++)
                    bi1.setRGB(i, j, new Color(255,255,255).getRGB());
            }
            int blk=0;
            for(int i=0;i<w;i+=5)
            {
                  for(int j=0;j<h;j+=5)
                  {
                      Random r1=new Random();
                      if(r1.nextBoolean())
                      {
                          if(blk<320)
                      {
                      
                          for(int k=0;k<5;k++)
                          {
                              if(j+k<h)
                                bi1.setRGB(i, j+k, Color.black.getRGB());                                                            
                          }
                          blk++;
                      }
                      }
                      
                      Random r2=new Random();
                      if(r2.nextBoolean())
                      {
                          if(blk<320)
                      {
                          for(int k=0;k<16;k++)
                          {
                              if(i+k<w)
                                bi1.setRGB(i+k, j, Color.black.getRGB());                               
                          }
                          blk++;
                      }
                      }
                  }
            }
            
         
            ImageIO.write(bi1,"jpg",new File("PS2.jpg"));*/
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
