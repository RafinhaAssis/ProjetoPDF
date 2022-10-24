
package main;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
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

public class Main {

    public static void main(String[] args) throws DocumentException, FileNotFoundException, BadElementException, IOException {
        
       Model.Outro.Outro();
        Document doc = new Document(PageSize.A4, 72,72,72,72);
        OutputStream os = new FileOutputStream("Primeiro Pdf feito por Rafinha Assis.pdf");
        PdfWriter.getInstance(doc , os);
        doc.open();
        
        Font f = new Font(FontFamily.COURIER, 20, Font.BOLD);
        Paragraph p = new Paragraph("Funcionando essa merda!", f);
        
        Paragraph p1 = new Paragraph("Isso esta funcionando perfeitamente.");
        
       
        
            
          

       
     
        
           Image img = Image.getInstance("C:\\Users\\Alunos\\Documents\\NetBeansProjects\\GerandoPdf\\src\\main\\ceap.png");
           img.setAlignment(Element.ALIGN_CENTER);
           doc.add(img);
        
          
           
       
        
            
      
        
         
        
            
        
        p.setAlignment(Element.ALIGN_CENTER);
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
