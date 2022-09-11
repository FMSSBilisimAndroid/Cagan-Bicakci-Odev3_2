# Cagan-Bicakci-Odev3_2

  Aşağıda görüldüğü gibi nav graph'da login ile başladıktan sonra forget password seçenekleri için kullanıdğım fragmentleri nested graph içerisine ekledim.
  
  User eğer direkt olarak giriş yaparsa home fragmenta yönlediriliyor ve home fragment'dan geriye gelemiyor. Yine user login ekranındayken forget password derse nested grapha'a yönlendiriliyor ve password reset dedikten sonra ana sayfaya giriş yapabiliyor. Buradaki geçişlerde username inputu için null kontrolü yaptıktan sonra safe arguments yardımıyla username'i fragmentlar arasında yolladım.
  
  Kullanıcı giriş yaptıktan sonra ise logout butonuna tıklandığında ise member aktiviteye new task olarak yönlendirdim bu sayede geri butonuna tıklandığında userın ana sayfaya dönmesini engelledim. Userın ana sayfaya erişebilmesi için ise login adımlarını tekrardan yapması gerekiyor.
  
  Not: Kullanıcı adı ve şifre kontrolleri eklenmedi. Sadece username için isNullOrBlank kontrolü sağlandı.
 
<img src="https://user-images.githubusercontent.com/44499663/189533166-1d6e5a49-51ca-4655-9fc0-8871bb6007c3.png" width="75%" height="75%"/>

https://user-images.githubusercontent.com/44499663/189533069-fb9d3d09-1e0b-45eb-9d4b-f0072c12be97.mp4

