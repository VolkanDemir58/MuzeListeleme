package com.example.hafta14;

import java.util.ArrayList;
public class DataUtil {
    private  static ArrayList<Muze> muzeArrayList =new ArrayList<>();
    public  static  ArrayList<Muze> muzeDatasiAl(){
        muzeArrayList.add(new Muze(
                "Topkapı Sarayı Müzesi",
                "Sultanahmet",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/1b/54/c7/fa/topkapi-palace-museum.jpg?w=500&h=400&s=1",
                "https://www.istairport.com/PublishingImages/istanbulun-m%C3%BCzeleri2.jpg",
                "İstanbul deyince akla gelen ilk adreslerden biri, Osmanlı İmparatorluğu’nun geride bıraktığı en önemli eserlerden biri olan Topkapı Sarayı. Görkemli mimarisiyle Topkapı Sarayı, İstanbul’da görülmesi gereken müzeler içinde ilk sırayı hak ediyor. Fatih Sultan Mehmet’in isteği üzerine 1460-1478 yılları arasında inşa edilen saray; Marmara Denizi, İstanbul Boğazı ve Haliç arasında kalan Tarihi Yarımada üzerinde bulunuyor. Müze, salı günleri hariç 09:00-18:00 saatleri arasında ziyaret edilebilir."
        ));
        muzeArrayList.add(new Muze(
                "Ural Ataman Otomobil Müzesi",
                "Tarabya",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/16/28/88/f5/turkiye-nin-ve-dunyanin.jpg?w=500&h=-1&s=1",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/0e/c2/96/a8/muzemizden-goruntu.jpg?w=500&h=-1&s=1",
                "Klasik otomobillerin, bu dönemdeki yaşam biçiminden yola çıkılarak yaratılan çağdaş bir mekânda sergilendiği bir müze ve etkinlik merkezidir."
        ));
        muzeArrayList.add(new Muze(
                "Masumiyet Müzesi",
                "Beyoğlu",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/07/4d/f3/d0/museum-of-innocence.jpg?w=500&h=400&s=1",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/05/59/06/d5/museum-of-innocence.jpg?w=500&h=400&s=1",
                "Yazar Orhan Pamuk’un aynı adlı kitabını okuduysanız, bu müzeyi de mutlaka ziyaret etmelisiniz. Kurmaca bir romanın neredeyse tüm objelerini ve pek çok önemli sahnesini yansıtan Masumiyet Müzesi, Beyoğlu’nda bulunuyor. Pazartesi günleri hariç her gün 10:00-18:00 arasında açık olmaktadır."
        ));
        muzeArrayList.add(new Muze(
                "İstanbul Oyuncak Müzesi",
                "Göztepe",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/08/d3/84/d5/istanbul-toy-museum.jpg?w=500&h=-1&s=1",
                "https://dynamic-media-cdn.tripadvisor.com/media/photo-o/19/20/8d/2b/oyuncak-muzesi-istanbul.jpg?w=500&h=400&s=1",
                "Anadolu yakası müzeler bakımından Avrupa yakası kadar zengin olmasa da kentin bu tarafına geçmek için yine de iyi nedenler var. Mesela şair Sunay Akın’ın kurduğu, Kadıköy Göztepe semtinde bulunan bu şahane müze gibi. Akın’ın 20 yıllık bir süreçte 40’ı aşkın ülkedeki antikacılardan ve açık artırmalardan satın aldığı nostaljik oyuncakları mutlaka görmelisiniz. Müze, pazartesi hariç hafta içi 10:00-18:00, hafta sonu 10.00-18.30 arasında gezilebilir."
        ));
        return muzeArrayList;
    }
}
