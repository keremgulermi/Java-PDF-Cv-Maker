package org.example;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

public class ResumeGenerator {

    // PDF oluşturma işlemi direkt main içinde değil, bu sınıfta yapılıyor
    public void generatePdf(Candidate candidate, String outputPath) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream(outputPath));
            document.open();

            // 1. Fotoğraf Ekleme
            try {
                Image img = Image.getInstance(candidate.getPhotoPath());
                img.scaleAbsolute(100, 100);
                img.setAlignment(Element.ALIGN_RIGHT);
                document.add(img);
            } catch (Exception e) {
                System.out.println("Fotoğraf bulunamadı. Lütfen proje dizinine " + candidate.getPhotoPath() + " dosyasını ekleyin.");
            }

            // 2. Kişisel Bilgiler
            Font nameFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 22, BaseColor.BLACK);
            document.add(new Paragraph(candidate.getFullName(), nameFont));
            
            Font infoFont = FontFactory.getFont(FontFactory.HELVETICA, 12, BaseColor.DARK_GRAY);
            document.add(new Paragraph("E-posta: " + candidate.getEmail(), infoFont));
            document.add(new Paragraph("Telefon: " + candidate.getPhone(), infoFont));
            document.add(new Paragraph("Eğitim: " + candidate.getUniversity(), infoFont));
            document.add(new Paragraph("\n"));
            document.add(new Paragraph("---------------------------------------------------------"));
            document.add(new Paragraph("\n"));

            // 3. İş Deneyimleri Başlığı
            Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16, BaseColor.BLACK);
            document.add(new Paragraph("Is Deneyimleri", headerFont));
            document.add(new Paragraph("\n"));

            // 4. İş Deneyimlerini Döngü ile Yazdırma
            Font jobTitleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12, BaseColor.BLACK);
            Font jobDescFont = FontFactory.getFont(FontFactory.HELVETICA, 11, BaseColor.BLACK);

            for (Experience exp : candidate.getExperiences()) {
                document.add(new Paragraph(exp.getTitle() + " @ " + exp.getCompany() + " | " + exp.getDate(), jobTitleFont));
                document.add(new Paragraph(exp.getDescription(), jobDescFont));
                document.add(new Paragraph("\n"));
            }

            document.close();
            System.out.println("Özgeçmiş başarıyla oluşturuldu: " + outputPath);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}