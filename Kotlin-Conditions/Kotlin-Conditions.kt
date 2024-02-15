fun main() {
    
    

    

    // 1


    val sayi = 10
    
    if (sayi > 0) {
        println("Sayı pozitif.")
    }
    






    



    



    



    



    



    


    // 2
    val puan = 75
    
    if (puan >= 90) {
        println("Harika bir başarı!")
    } else if (puan >= 70) {
        println("Başarılı bir performans.")
    } else if (puan >= 50) {
        println("Orta seviye performans.")
    } else {
        println("Başarısız.")
    }



    



    



    



    



    



    



    



    
    
    // 3
    val not = 60
    
    if (not >= 60) {
        println("Geçtiniz.")
    } else {
        println("Kaldınız.")
    }
    




    



    



    



    



    



    


    



    
    // 4
    val gün = "Pazartesi"
    
    when (gün) {
        "Pazartesi" -> println("Yeni bir haftaya başladık.")
        "Çarşamba" -> println("Haftanın ortası, enerjimizi koruyalım.")
        "Cuma" -> println("Hafta sonu yaklaşıyor, harika bir gün!")
        else -> println("Diğer günler...")
    }
    



    


    



    



    



    



    



    




    
    // 5
    val puan2 = 85
    
    when (puan2) {
        in 90..100 -> println("Mükemmel bir performans!")
        in 70..89 -> println("Başarılı bir performans.")
        in 50..69 -> println("Orta seviye performans.")
        else -> println("Başarısız.")
    }
    





    



    



    



    



    



    

    



    
    // 6
    val veri: Any = 10
    
    when (veri) {
        is String -> println("Bu bir String.")
        is Int -> println("Bu bir tamsayı.")
        is Double -> println("Bu bir ondalıklı sayı.")
        else -> println("Farklı bir veri tipi.")
    }
    




    



    



    



    



    



    


    



    
    // 7
    val saat = 15
    
    if (saat in 0..11) {
        println("Günaydın!")
    } else {
        when (saat) {
            12 -> println("Öğle vakti!")
            in 13..17 -> println("İyi günler!")
            else -> println("İyi akşamlar!")
        }
    }
    



    


    



    



    



    



    



    




    
    // 8
    val not2 = 75
    val durum = if (not2 >= 50) "Geçti" else "Kaldı"
    
    println("Durum: $durum")
    





    



    



    



    



    



    

    



    
    // 9
    val mevsim = "Yaz"
    val havaDurumu = when (mevsim) {
        "Kış" -> "Soğuk"
        "Yaz" -> "Sıcak"
        "İlkbahar" -> "Serin"
        "Sonbahar" -> "Yağmurlu"
        else -> "Bilinmeyen mevsim"
    }
    
    println("Hava durumu: $havaDurumu")
    



    


    



    



    



    



    



    




    
    // 10
    val ay = "Temmuz"
    val mevsim2 = when (ay) {
        "Aralık", "Ocak", "Şubat" -> "Kış"
        "Mart", "Nisan", "Mayıs" -> "İlkbahar"
        "Haziran", "Temmuz", "Ağustos" -> "Yaz"
        "Eylül", "Ekim", "Kasım" -> "Sonbahar"
        else -> "Bilinmeyen ay"
    }
    
    println("Mevsim: $mevsim2")
    



    


    



    



    



    



    



    




    
    // 11
    val ad: String? = null
    val uzunluk = ad?.length ?: -1
    
    println("Ad uzunluğu: $uzunluk")
    



    





    



    



    

    



    



    



    
    // 12
    val not3 = 85
    val katılım = 90
    val durum2 = if (not3 >= 70 && katılım >= 80) {
        "Geçti"
    } else {
        "Kaldı"
    }
    
    println("Durum: $durum2")
    



    


    



    



    




    
    // 13
    val puan3 = 80
    val durum3 = if (puan3 >= 70) "Geçti" else "Kaldı"
    
    println("Durum: $durum3")
    



    



    




    



    



    


    



    
    // 14
    val not4 = 75
    val durum4 = when {
        not4 >= 90 -> "Harika!"
        not4 >= 80 -> "Çok İyi"
        not4 >= 70 -> "İyi"
        not4 >= 60 -> "Orta"
        else -> "Başarısız"
    }
    


    println("Durum: $durum4")
    



    



    



    



    



    
    // 15
    val puan4 = 80
    val katilimOrani = 90
    val durum5 = if (puan4 >= 70 && katilimOrani >= 80) {
        "Geçti"
    } else {
        "Kaldı"
    }
    
    println("Durum: $durum5")
    



    




    



    


    
    // 16
    val yas = 25
    val ehliyetVarMi = true
    val durum6 = if (yas >= 18 && ehliyetVarMi) {
        "Araç kullanabilir"
    } else if (yas >= 18 && !ehliyetVarMi) {
        "Ehliyet almalı"
    } else {
        "Araç kullanamaz"
    }
    
    println("Durum: $durum6")
    



    



    



    



    



    
    // finish
}
