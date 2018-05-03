package readData.read;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public String getImgText(String imageLocation) {
		File imageFile = new File(imageLocation);
		Tesseract instance = new Tesseract();

		//In case you don't have your own tessdata, let it also be extracted for you
		File tessDataFolder = LoadLibs.extractTessResources("tessdata");

		//Set the tessdata path
		instance.setDatapath(tessDataFolder.getAbsolutePath());

		try {
		    String result = instance.doOCR(imageFile);
		    return result;
		} catch (TesseractException e) {
			e.getMessage();
	        return "Error while reading image";
		}
	   }
	
    public static void main( String[] args )
    {
    		App app = new App();
    		System.out.println(app.getImgText("C:\\Users\\Jorge\\Downloads\\Quinta semana PCGA\\Quinta semana PCGA\\10828442\\10828442 BALANCE 2015.PDF"));
    		System.out.println("finished!");
    }
}
