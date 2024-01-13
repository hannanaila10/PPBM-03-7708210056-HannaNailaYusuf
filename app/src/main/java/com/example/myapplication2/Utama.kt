package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import com.google.android.material.bottomsheet.BottomSheetDialog

class Utama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WindowCompat.setDecorFitsSystemWindows(
            window,false
        )
        val namanama = arrayOf<String>(
            "Bayam",
            "Brokoli",
            "Asparagus",
            "Ubi",
            "Wortel",
            "Sawi"
        )
        val desc = arrayOf<String>(
            "Sayur Hijau",
            "Sayur Hijau",
            "Sayur Hijau",
            "Ubi - Ubian",
            "Sayuran",
            "Sayuran Hijau"
        )
        val fotofoto = arrayOf<Int>(
            R.drawable.bayam,
            R.drawable.brokoli,
            R.drawable.asparagus,
            R.drawable.ubi,
            R.drawable.wortel,
            R.drawable.sawi
        )
        val fotofoto1 = arrayOf<Int>(
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp,
            R.drawable.ic_notifications_white_24dp

            )
        val noTelp = arrayOf<String>(
            "+62 574621963",
            "+62 629748442",
            "+62 491400073",
            "+62 243271324",
            "+62 840334676",
            "+62 857301835",
        )
        val none1 = arrayOf<String>(
            "",
            "",
            "",
            "",
            "",
            ""
        )
        val Deskripsi = arrayOf<String>(
            "Bayam (Amaranthus) adalah tumbuhan yang biasa ditanam untuk dikonsumsi daunnya sebagai sayuran hijau. Tumbuhan ini berasal dari Amerika tropik namun sekarang tersebar ke seluruh dunia. Tumbuhan ini dikenal sebagai sayuran sumber zat besi yang penting bagi tubuh.",
            "Brokoli (Brassica oleracea L. Kelompok Italica) adalah tanaman yang sering dibudidayakan sebagai sayur. Brokoli adalah kultivar dari spesies yang sama dengan kubis dan kembang kol, yaitu Brassica oleracea. Brokoli berasal dari daerah Laut Tengah dan sudah sejak masa Yunani Kuno dibudidayakan. Sayuran ini masuk ke Indonesia belum lama (sekitar 1970-an) dan kini cukup populer sebagai bahan pangan.",
            "Asparagus atau akar parsi (Asparagus officinalis) dalam pengertian umum adalah suatu jenis sayuran dari satu spesies tumbuhan genus Asparagus. Asparagus telah digunakan sejak lama sebagai bahan makanan karena rasanya yang sedap dan sifat diuretiknya. Dengan adanya sifat diuretik tersebut, asparagus berkhasiat untuk memperlancar saluran urin sehingga mampu memperbaiki kinerja ginjal. Asparagus merupakan sumber terbaik asam folat nabati, sangat rendah kalori, tidak mengandung lemak atau kolesterol, serta mengandung sangat sedikit natrium. Tumbuhan ini juga merupakan sumber rutin, suatu senyawa yang dapat memperkuat dinding kapiler.",
            "Ubi adalah yaitu istilah untuk umbi dari tanaman berumbi yang dapat dimakan. Walaupun orang Indonesia biasanya merujuk istilah ubi kepada ubi kayu, tetapi ada beberapa jenis ubi yang terkenal, yaitu:\n" +
                    "\n" +
                    "Ubi jalar atau ubi rambat atau petatas\n" +
                    "Ubi kelapa\n" +
                    "Ubi kayu atau ketela pohon atau singkong\n" +
                    "Talas atau keladi",
            "Wortel (serapan dari bahasa Belanda: wortel) (Daucus carota subsp. sativus) adalah tumbuhan biennial (siklus hidup 12 - 24 bulan) yang menyimpan karbohidrat dalam jumlah besar untuk tumbuhan tersebut berbunga pada tahun kedua. Batang bunga tumbuh setinggi sekitar 1 m, dengan bunga berwarna putih, dan rasa yang manis langu. Bagian yang dapat dimakan dari wortel adalah bagian umbi atau akarnya.",
            "Sawi adalah sekelompok tumbuhan dari genus Brassica yang dimanfaatkan daun atau bunganya sebagai bahan pangan (sayuran), baik segar maupun diolah. Sawi mencakup beberapa spesies Brassica yang kadang-kadang mirip satu sama lain.\n" +
                    "\n" +
                    "Di Indonesia penyebutan sawi biasanya mengacu pada sawi hijau (Brassica rapa kelompok parachinensis, yang disebut juga sawi bakso, caisim, atau caisin). Selain itu, terdapat pula sawi putih (Brassica rapa kelompok pekinensis, disebut juga petsai) yang biasa dibuat sup atau diolah menjadi asinan."
        )
        val list1 = findViewById<ListView>(R.id.listview1)
        list1.adapter = listAdapter(this, noTelp, fotofoto1 , none1 )
        list1.setOnItemClickListener { adapterView, view, position, id ->
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_sheet_view, null)
            dialog.setContentView(view)
            dialog.show()
        }
        val list = findViewById<ListView>(R.id.listview)
        list.adapter = listAdapter(this, namanama, fotofoto, desc)
        list.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this, Details::class.java)
            intent.putExtra("nama", namanama[position])
            intent.putExtra("desc", desc[position])
            intent.putExtra("foto", fotofoto[position])
            intent.putExtra("notelp", noTelp[position])
            intent.putExtra("deskripsi", Deskripsi[position])
            startActivity(intent)
        }
    }
}