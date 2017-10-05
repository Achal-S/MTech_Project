/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qrcode;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Ellipse2D;
import java.awt.RenderingHints;
/**
 *
 * @author SravanChowdary
 */
public class Test2
{
    public static void main(String ar[])
    {
        try
        {
            double SQ2 = Math.sqrt(2);
               BufferedImage bi=ImageIO.read(new File("P1.jpg"));
            int h=bi.getHeight();
            int w=bi.getWidth();
            
            Graphics2D g=bi.createGraphics();
            
            
            
           // g.setColor(Color.WHITE);
        g.fillRect(0, 0, w, h);

        /* Adjust the display. */
      /*  g.scale(w / (2.0 * bi.getWidth()),
                h / (2.0 * bi.getHeight()));
        g.translate(1.0, 1.0);

        /* Tune drawing parameters. */
        /*g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                           RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL,
                           RenderingHints.VALUE_STROKE_PURE);
        g.setRenderingHint(RenderingHints.KEY_RENDERING,
                           RenderingHints.VALUE_RENDER_QUALITY);
*/
        /* Draw image. */
        //g.setColor(Color.BLACK);

            for (int y = 0; y < bi.getHeight(); y++) 
            {
                for (int x = 0; x < bi.getWidth(); x++) 
                {
                    int c = bi.getRGB(x, y);
                    /* Use the luma model. */
                    double sum = (+ 0.30 * (c >> 16 & 0xff)
                              + 0.59 * (c >>  8 & 0xff)
                              + 0.11 * (c >>  0 & 0xff)) / 255.0;
                    sum = 1.0 - sum;
                    double size = sum * SQ2;
                    g.fill(new Ellipse2D.Double((double) x * 2 - size,
                                            (double) y * 2 - size,
                                            size * 2, size * 2));
                }
            }
            
            g.drawImage(bi, null, 0, 0);
            ImageIO.write(bi,"jpg",new File("PS2.jpg"));
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();        
        }
    }
}
