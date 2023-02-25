package com.example.bombapatlatmaoyunu

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var zorluk : String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        zorlukRadio.setOnCheckedChangeListener{group,checkedId->
            if (R.id.kolay==checkedId){
                Toast.makeText(this,"Kolay Seviye Oyun Oynamayı Seçtiniz",Toast.LENGTH_LONG).show()
                zorluk="Kolay"
            }else if(R.id.orta==checkedId){
                Toast.makeText(this,"Orta Seviye Oyun Oynamayı Seçtiniz",Toast.LENGTH_LONG).show()
                zorluk="Orta"
            }else if(R.id.zor==checkedId){
                Toast.makeText(this,"Zor Seviye Oyun Oynamayı Seçtiniz",Toast.LENGTH_LONG).show()
                zorluk="Zor"
            }else{

                zorluk="secilmedi"
            }
            println(zorluk)
        }



    }

    fun calistir(view: View){
        if(zorluk!=""){
            val intent=Intent(this,oyunActivity::class.java)
            intent.putExtra("zorluk",zorluk)
            startActivity(intent)
            finish()
        }else{
            val uyarimesaji= AlertDialog.Builder(this@MainActivity)
            uyarimesaji.setTitle("Zorluk Seçilmedi")
            uyarimesaji.setMessage("Lütfen Bir Zorluk Seviyesi Seçiniz")
            uyarimesaji.setPositiveButton("Tamam", DialogInterface.OnClickListener{ dialogInterface, i ->



            })
            uyarimesaji.show()
        }



    }
}