# Java PDF Özgeçmiş (CV) Oluşturucu

Bu proje, Kırklareli Üniversitesi Yazılım Mühendisliği dersi kapsamında Java kullanılarak geliştirilmiş bir konsol uygulamasıdır. Uygulama, önceden tanımlanmış kişisel bilgileri ve iş deneyimlerini alarak dinamik bir şekilde PDF formatında özgeçmiş oluşturmaktadır. 

## Kullanılan Teknolojiler ve Kütüphaneler
*   **Dil:** Java (JDK 11+)
*   **Bağımlılık Yönetimi:** Maven
*   **PDF Kütüphanesi:** iText 5 (`com.itextpdf:itextpdf:5.5.13.3`)

## Proje Mimarisi ve Kullanılan Sınıflar/Nesneler

Proje, Nesne Yönelimli Programlama (OOP) prensiplerine uygun olarak ve tek sorumluluk prensibi (Single Responsibility Principle) gözetilerek tasarlanmıştır.

1.  **`Main.java`**: Programın giriş noktasıdır. Uygulamanın çalışma akışını yönetir, gerekli nesneleri oluşturur (örnekler) ve birbirine bağlar.
2.  **`Candidate.java`**: Özgeçmişi oluşturulacak kişinin bilgilerini (ad, iletişim, üniversite, fotoğraf yolu) tutan veri sınıfıdır (Data Object). Gelişime açık olması adına iş deneyimlerini tutmak için `List<Experience>` yapısını kapsüller (Encapsulation).
3.  **`Experience.java`**: Bir adayın çalışmış olduğu iş yerlerini, görevlerini ve tarihlerini modelleyen nesnedir.
4.  **`ResumeGenerator.java`**: PDF üretiminden sorumlu servis sınıfıdır. İstenilen "PDF oluşturma işlemi main içinde değil, ayrı bir sınıfta yapılmalıdır" şartını sağlamak amacıyla tasarlanmıştır. Parametre olarak bir `Candidate` nesnesi alır ve içindeki verileri okuyarak `iText` kütüphanesinin nesneleri (`Document`, `PdfWriter`, `Paragraph`, `Image`) aracılığıyla bir dosya çıktısı üretir.

## Kurulum ve Çalıştırma

1. Projeyi sisteminize klonlayın:
   `git clone <repository_linkiniz>`
2. Proje dizinine profil fotoğrafınızı ekleyin ve adını `photo.jpg` olarak değiştirin.
3. Maven bağımlılıklarını yükleyin ve `Main.java` dosyasını çalıştırın.
4. Proje dizininde `Halil_Kerem_Guler_CV.pdf` dosyası otomatik olarak oluşturulacaktır.
