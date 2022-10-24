
package Model;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.Main;

public class Outro {
    public static void Outro() throws FileNotFoundException, DocumentException, BadElementException, IOException{
        
        Document doc = new Document(PageSize.A5, 72,72,72,72);
        OutputStream os = new FileOutputStream("Recibo.pdf");
        PdfWriter.getInstance(doc , os);
        doc.open();
        Font f2 = new Font(Font.FontFamily.COURIER, 11, Font.BOLD);
        Font f = new Font(Font.FontFamily.COURIER, 20, Font.BOLD);
        Paragraph p = new Paragraph("RECIBO", f);
        Paragraph r = new Paragraph("Jose Francisco de Almeida", f2);
        Paragraph p1 = new Paragraph("Eu, "+r+",portador do RG n");
        
       
        
            
          

       
     
        
          // Image img = Image.getInstance("C:\\Users\\Alunos\\Documents\\NetBeansProjects\\GerandoPdf\\src\\main\\ceap.png");
         //  img.setAlignment(Element.ALIGN_CENTER);
         //  doc.add(img);
        
          
           
       
        
            
      
        
         
        
            
        
        p.setAlignment(Element.ALIGN_TOP);
        p.setSpacingAfter(20);
        p1.setAlignment(Element.ALIGN_CENTER);
        doc.add(p);
        doc.add(p1);
        
            
        if(doc != null){
            
        
        doc.close();
        }
        if(os != null){
            try {
                os.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
}
        
        
        
    }
}
