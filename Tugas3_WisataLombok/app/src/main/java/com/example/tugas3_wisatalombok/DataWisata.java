package com.example.tugas3_wisatalombok;

import java.util.ArrayList;

public class DataWisata {
    private static String[] namaWisata = new String[]{
            "Benang Kelambu",
            "Islamic Center",
            "Kuta Mandalika",
            "Makam Loang Balok",
            "Pantai Tebing",
            "Pantai Pink Lombok",
            "Gunung Rinjani",
            "Savana Lombok",
            "Selong Belanak",
            "Pantai Semeti",
            "Sendang Gile"
    };

    private static int[] gambarWisata = new int[]{
            R.drawable.benangkelambu,
            R.drawable.islamiccenter,
            R.drawable.kutamandalika,
            R.drawable.loangbalok,
            R.drawable.pantaitebing,
            R.drawable.pinklombok,
            R.drawable.rinjani,
            R.drawable.savanalombok,
            R.drawable.selongbelanak,
            R.drawable.semeti,
            R.drawable.sendanggile
    };
    private static String[] detailWisata = new String[]{
            "Jika traveler hendak ke Lombok, cobalah menikmati eksotika alam pegunungan di daerah air terjun Benang Kelambu. Tidak hanya itu, ada dua pilihan tempat yang bisa dikunjungi di sana; air terjun Benang Kelambu dan juga air terjun Benang Stokel. Menuju lokasi air terjun, traveler akan melewati kawasan hutan yang sebagian dimanfaatkan sebagai lahan perkebunan oleh warga setempat. Posisi gerbang masuk ke lokasi ini cukup berada di lahan yang tinggi, sehingga untuk menuju ke sana traveler akan menuruni ratusan tingkat anak tangga. Dari gerbang masuk ke Benang Kelambu, traveler akan melalui jalan berkerikil",
            "Pulau Lombok tidak hanya kaya akan kekayaan alam wisata bahari saja tetapi kaya akan wisata religi, sehingga memang pantas pulau Lombok dikenal dengan sebutan pulau “Seribu Masjid” karena di pulau Lombok memang sangat banyak Masjid, dan salah satu Masjid yang menjadi incaran wisatawan baik dalam maupun luar pulau Lombok yaitu Masjid Islamic Center Mataram.Masjid Islamic Center Mataram bernama “Masjid Raya Hubbul Wathan Islamic Center” yang terletak di kelurahan Selaparang, Kota Mataram, Nusa Tenggara Barat, yang merupakan Masjid termegah dan terbesar di Propinsi Nusa Tenggara Barat.",
            "Pantai Kuta, Lombok adalah tempat wisata di Pulau Lombok, Nusa Tenggara Barat, Indonesia. Pantai dengan pasir berwarna putih ini terletak sebuah desa bernama Desa Kuta. Desa Kuta mulai menjadi tempat tujuan wisata yang menarik di Indonesia sejak didirikannya banyak hotel-hotel baru. Selain keindahan alam yang dapat dinikmati di desa ini, satu kali dalam setahun diadakan upacara Sasak di desa ini. Ini adalah upacara Bau Nyale. Dalam upacara ini para pelaut mencari cacing Nyale di laut. Menurut legenda, dahulunya ada seorang putri, bernama Putri Mandalika, yang sangat cantik, banyak pangeran dan pemuda yang ingin menikah dengannya.",
            "Makam Loang Baloq, berasal dari kata dalam bahasa Sasak Lombok yang berarti Lubang Buaya. Area ini ditumbuhi sebuah pohon beringin yang memili lubang tempat berdiam dirinya sang Buaya yang konon kabarnya berumur ratusan tahun. Makam Loang Baloq adalah kawasan pemakaman yang didalamnya terdapat puluhan jasad. Keistimewaan Makam Loang baloq ini adalah 3 makam istimewa yakni makam Ulama Maulana Syekh Gaus Aburrazak, Makam Anak Yatim dan Makan Datuk Laut.",
            "Tebing indah di pantai tersebut adalah hasil dari letusan dahsyat Gunung Rinjani Tua atau Samalas tahun 1257. Hal itu tertulis dalam sebuah Artikel hasil penelitian 15 peneliti gunung api dunia dengan ketua tim Franck Lavigne, Universitas Paris 1 Pantheon-Sorbonne, Perancis. Letusan gunung Samalas dinilai terbesar pada periode 7.000 tahun terakhir. Muntahan materialnya mencapai lebih dari 40 kilometer kubik. Sementara tebing yang ada di Pantai Tebing ini disebut-sebut sebagai salah satu jejak letusan Gunung Samalas di Lombok Utara.",
            "Pantai Tangsi atau yang lebih dikenal dengan Pantai Pink dari Pulau Lombok terletak di desa Sekaroh, kecamatan Jerowaru, kabupaten Lombok Timur adalah sebuah destinasi wisatawan yang menarik dan patut untuk dikunjungi karena keunikannya.[1][2] Pantai ini merupakan salah satu dari tujuh pantai di dunia yang memiliki pasir pantai berwarna pink, dan satu dari dua pantai di Indonesia yang memiliki pasir pantai berwarna pink. Warna pink pada pasirnya terbentuk karena butir-butir asli warna putih pasir bercampur dengan serpihan karang merah muda. Bias sinar matahari dan terpaan air laut menambah semakin jelas terlihat warna pink pantai tersebut.",
            "Gunung Rinjani adalah gunung yang berlokasi di Pulau Lombok, Nusa Tenggara Barat. Gunung yang merupakan gunung berapi kedua tertinggi di Indonesia dengan ketinggian 3.726 m dpl serta terletak pada lintang 8º25' LS dan 116º28' BT ini merupakan gunung favorit bagi pendaki Indonesia karena keindahan pemandangannya. Gunung ini merupakan bagian dari Taman Nasional Gunung Rinjani yang memiliki luas sekitar 41.330 ha dan ini akan diusulkan penambahannya sehingga menjadi 76.000 ha ke arah barat dan timur.",
            "Bukit Savana Propok adalah sebuah bukit yang terletak di wanasaba Lombok Timur, Indonesia. Dengan ketinggian 1934 meter. Bukit tersebut memiliki daya tarik tersendiri yang mampu memukau pengunjung lokal maupun mancanegara dengan keindahan dan keunikannya. Savana Propok dan Bukit Kondo Sembalun merupakan destinasi wisata terbaru di Pulau Lombok yang sedang hits karena pemandangan yang ditawarkan begitu menakjubkan. Meskipun secara geografis kawasan ini masuk dalam wilayah Desa Sembalun, tapi cara paling efektif untuk memulai perjalanan adalah melalui Desa Bebidas, Kecamatan Wanasaba, Lombok Timur.",
            "Selong Belanak adalah salah satu desa yang terletak di Kecamatan Praya Barat, Kabupaten Lombok Tengah, Provinsi Nusa Tenggara Barat, Indonesia. Desa ini sebagian besar penduduknya bersuku Sasak. Di desa ini terkenal dengan keindahan Pantai baik wisatawan domestik maupun wisatawan asing.",
            "Pantai Semeti memiliki beberapa ciri khas dan daya tarik yang sangat jarang ditemui pada pantai-pantai Lombok lainnya bahkan bisa jadi jarang ditemui pada pantai-pantai Indonesia lainnya. Pantai Semeti tidak sebagaimana pantai Lombok lainnya yang biasa dijadikan arena permainan air dan surfing oleh para wisatawan. Karena perbedaannya ini, Pantai Semeti Lombok mulai dikenal terutama melalui post-post yang beredar di media sosial.",
            "Letaknya yang di kaki Gunung Rinjani, tepatnya di Desa Senaru, Kecamatan Bayan, Kabupaten Lombok Utara, Nusa Tenggara Barat, membuat Air Terjun Sendang Gile favorit sebagai destinasi pemanasan sebelum mendaki Rinjani ataupun refreshment usai pendakian. Sumber airnya yang berasal dari Gunung Rinjani membuat airnya segar dan dingin. Aliran sungai dangkal yang terbentuk di bawah air terjun setinggi 30 meter ini aman dan nyaman untuk dipakai berendam, melepas segala kepenatan. Kalau nggak mau berendam atau basah-basahan, cukuplah duduk-duduk santai di tikar yang disediakan penjaja makanan dan minuman di sekitar air terjun, atau di batu-batu besar yang berserakan di depan air terjun."
    };
    public static ArrayList<ModelWisata> getGroup(){
        ModelWisata modelWisata = null;
        ArrayList<ModelWisata> ListWisata = new ArrayList<>();
        for(int i=0; i<namaWisata.length; i++ ){
            modelWisata = new ModelWisata();
            modelWisata.setNamaWisata(namaWisata[i]);
            modelWisata.setGambarWisata(gambarWisata[i]);
            modelWisata.setDetailWisata(detailWisata[i]);

            ListWisata.add(modelWisata);
        }

        return ListWisata;
    }
}

