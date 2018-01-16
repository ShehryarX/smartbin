import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.net.URL;

public class Generator {
  // public static void main(String[] args) throws IOException {
  //   new Generator();    
  // }
  
  public Generator() throws IOException {
    // create batch tests from random server
    
  }
  
  public void saveImage(String imageUrl) throws IOException {
    // load image
    URL url = new URL(imageUrl);
    String fileName = url.getFile();
    String destName = "./figures" + fileName.substring(fileName.lastIndexOf("/"));
    
    // Debug
    // System.out.println(destName);

    // Save as file
    InputStream is = url.openStream();
    OutputStream os = new FileOutputStream(destName);

    byte[] b = new byte[2048];
    int length;

    while ((length = is.read(b)) != -1) {
      os.write(b, 0, length);
    }

    // Close readers
    is.close();
    os.close();
  }
}
