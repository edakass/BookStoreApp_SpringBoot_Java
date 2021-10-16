# BookStoreApp_SpringBoot_Java
Maven Kurulumu 

Ortam değişkenlerinden program filestaki yolu path’e tıklayarak kopyaladık. 

Ortam değişkenlerinde pathe linki yapıştırdık. 

![image](https://user-images.githubusercontent.com/61595808/137591834-8936087a-892c-4dc4-8483-dd88a8cfd245.png)

Artifact:jar yada war paketinin ismini belirler

Description:projenin kısa açıklamasıdır

Jar:bütün dosyalarını içinde barındıran özel bir paket yapısı

War:bir web projesi için html,javascript dosyaları gibi önyüz tarafından diğer dosyaları içinde barındırır

https://start.spring.io/

Burada

![image](https://user-images.githubusercontent.com/61595808/137591868-66f9e32d-3c97-4b2a-af9d-c569487e4152.png)

Add dependencies e tıklayarak kütüphanelerine bakabiliriz.

Indirileni intellij de açtım ,pom.xml de bu maven olduğu için pom.xmle

Spring boot uygulamasını çalıştırınca,kendisine ait bir sunucudan geliyor

Uygulamamız dışarıdan RESTApi ile istek alacak,kendi business case(iş kuralları)'leri doğrultusunda bunu datayı işleyecek daha sonrasında veri tabanına yazacak

![image](https://user-images.githubusercontent.com/61595808/137022970-ca7149ce-ec96-45bd-b088-8cf602b7ffa9.png)

Seçtiğimiz kütüphaneler,kütüphaneleri seçmek için "Add Dependencies" tıklamak yeterli olacaktır.Eğer çıkan ekranda çoklu seçim yapmak istiyorsanız Ctrl ile seçebilirsiniz.

![image](https://user-images.githubusercontent.com/61595808/137024868-0e66fa64-979d-4eb5-8008-16e344916269.png)

İndirdiğimiz belgeyi Intellij de açıyoruz. "Run" dedikten sonra karşımıza çıkan loglardan "8080" portunda çalışacağını söylüyor.


![8080](https://user-images.githubusercontent.com/61595808/137025388-51d9899e-80f4-4e60-9db0-8cb4d5154c07.png)

Ama şu anda çalışmıyor.Yani o web sitesinden bir şey göremeyeceğiz.Görebilecek hale gelmek için ise package(paket) oluşturmamız gerekiyor.

Postman'ı da kullanmamız gerekiyor.

Mikro servisler

bir sistemin, her biri bağımsız olarak çalışan ve açık protokoller (örneğin http) vasıtasıyla birbiri ile iletişim kuran küçük servislere ayrılması diyebiliriz.

JPA nedir?

JPA veya Java Persistance API verileri kalıcı olarak saklamak, almak, bulmak, silmek ve güncellemek için kullanılan Java ORM şartnamesidir

Component (Scan) :Spring’ in otomatik arama islemlerinde bu notasyon ile isaretlenen sinifi dikkate almasini ve gerekli baglama islemlerini yapmasini saglar.






