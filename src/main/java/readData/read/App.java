package readData.read;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public String getImgText(String imageLocation) {
	      ITesseract instance = new Tesseract();
	      try 
	      {
	         String imgText = instance.doOCR(new File(imageLocation));
	         return imgText;
	      } 
	      catch (TesseractException e) 
	      {
	         e.getMessage();
	         return "Error while reading image";
	      }
	   }
	
    public static void main( String[] args )
    {
    		App app = new App();
    		System.out.println(app.getImgText("/Users/jorgemartinez/Desktop/BALANCES/Quinta semana PCGA/10828442/10828442 BALANCE 2015.PDF"));
    }
}
