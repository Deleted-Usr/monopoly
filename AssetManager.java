package Java.MONOPOLY;

import java.awt.image.*;
import java.io.*;
import javax.imageio.*;


public class AssetManager
{
    public AssetManager() throws IOException
    {
        
    }
    
    public static BufferedImage loadImage(AssetEnum asset) throws IOException
    {
        return loadImage(asset.getPath());
    }
    
    public static BufferedImage loadImage(String path) throws IOException
    {
        BufferedImage img = ImageIO.read(new File(path));
        return img;
    }
}