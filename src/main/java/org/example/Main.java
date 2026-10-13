package org.example;

public class Main {
    public static void main(String[] args) {
        // Aday nesnesi oluşturuluyor
        Candidate candidate = new Candidate(
                "Halil Kerem Guler", 
                "kerem.guler@email.com", 
                "+90 555 123 4567", 
                "Kirklareli University - Software Engineering",
                "photo.jpg" // DİKKAT: Proje klasörünüze 'photo.jpg' adında bir fotoğraf eklemelisiniz.
        );

        // 3 Hayali İş Deneyimi (İstenen Şart)
        candidate.addExperience(new Experience(
                "Junior Backend Developer", 
                "TechLogistics Corp.", 
                "May 2025 - Dec 2025", 
                "C ve hash tablolarini kullanarak logistik takip sistemleri icin hibrid yapilar gelistirdim."
        ));

        candidate.addExperience(new Experience(
                "Embedded Systems Intern", 
                "MicroIoT Solutions", 
                "Feb 2026 - May 2026", 
                "TinyML gömülü sistemler icin dinamik tensor yapilari ve bellek yonetimi uzerine calistim."
        ));

        candidate.addExperience(new Experience(
                "Freelance Web Developer", 
                "Upwork", 
                "Jun 2026 - Present", 
                "HTML ve CSS kullanarak interaktif gorsellestirme projeleri gelistirdim."
        ));

        // Özgeçmiş üretici nesne oluşturuluyor
        ResumeGenerator generator = new ResumeGenerator();
        
        // İşlemi ayrı sınıftan çağırıyoruz (İstenen Şart)
        generator.generatePdf(candidate, "Halil_Kerem_Guler_CV.pdf");
    }
}
