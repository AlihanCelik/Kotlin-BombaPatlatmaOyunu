package com.example.bombapatlatmaoyunu

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import kotlinx.android.synthetic.main.activity_oyun.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class oyunActivity : AppCompatActivity() {
    var score:Int=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyun)
        patlamaGorselleri()
        bombaGorultuleri()




        val bomba=object: CountDownTimer(30000,1500){
            override fun onTick(p0: Long) {

                var ran=(1..20).random()
                ran(ran)

                GlobalScope.launch(context = Dispatchers.Main) {
                    if(intent.getStringExtra("zorluk")=="Zor"){
                        delay(550)
                    }else if(intent.getStringExtra("zorluk")=="Kolay"){
                        delay(1000)
                    }else if(intent.getStringExtra("zorluk")=="Orta"){
                        delay(700)
                    }



                    bombaGorultuleri()

                }
            }

            override fun onFinish() {

            }

        }
        bomba.start()


        val timer = object: CountDownTimer(30000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeText.setText("Time : ${millisUntilFinished/1000}")

            }

            override fun onFinish() {
                val uyarimesaji= AlertDialog.Builder(this@oyunActivity)
                uyarimesaji.setTitle("Süreniz Bitti...")
                uyarimesaji.setMessage("Skorunuz :${score}")
                uyarimesaji.setPositiveButton("Anasayfaya Dön", DialogInterface.OnClickListener{ dialogInterface, i ->
                    Toast.makeText(applicationContext,"Oyundan çıktınız...",Toast.LENGTH_LONG).show()
                    val intent= Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent)
                    finish()

                    })

                uyarimesaji.show()

            }
        }
        timer.start()

    }

    fun ran(ran:Int){
        if(ran==1){
            b1.visibility=View.VISIBLE
        }else if(ran==2){
            b2.visibility=View.VISIBLE
        }else if(ran==3){
            b3.visibility=View.VISIBLE
        }else if(ran==4){
            b4.visibility=View.VISIBLE
        }else if(ran==5){
            b5.visibility=View.VISIBLE

        }else if(ran==6){
            b6.visibility=View.VISIBLE

        }else if(ran==7){
            b7.visibility=View.VISIBLE

        }else if(ran==8){
            b8.visibility=View.VISIBLE

        }else if(ran==9){
            b9.visibility=View.VISIBLE

        }else if(ran==10){
            b10.visibility=View.VISIBLE

        }else if(ran==11){
            b11.visibility=View.VISIBLE

        }else if(ran==12){
            b12.visibility=View.VISIBLE

        }else if(ran==13){
            b13.visibility=View.VISIBLE

        }else if(ran==14){
            b14.visibility=View.VISIBLE

        }else if(ran==15){
            b15.visibility=View.VISIBLE

        }else if(ran==16){
            b16.visibility=View.VISIBLE

        }else if(ran==17){
            b17.visibility=View.VISIBLE

        }else if(ran==18){
            b18.visibility=View.VISIBLE

        }else if(ran==19){
            b19.visibility=View.VISIBLE

        }else if(ran==20){
            b20.visibility=View.VISIBLE

        }
    }

    fun patlamaGorselleri(){
        i1.visibility=View.INVISIBLE
        i2.visibility=View.INVISIBLE
        i3.visibility=View.INVISIBLE
        i4.visibility=View.INVISIBLE
        i5.visibility=View.INVISIBLE
        i6.visibility=View.INVISIBLE
        i7.visibility=View.INVISIBLE
        i8.visibility=View.INVISIBLE
        i9.visibility=View.INVISIBLE
        i10.visibility=View.INVISIBLE
        i11.visibility=View.INVISIBLE
        i12.visibility=View.INVISIBLE
        i13.visibility=View.INVISIBLE
        i14.visibility=View.INVISIBLE
        i15.visibility=View.INVISIBLE
        i16.visibility=View.INVISIBLE
        i17.visibility=View.INVISIBLE
        i18.visibility=View.INVISIBLE
        i19.visibility=View.INVISIBLE
        i20.visibility=View.INVISIBLE
    }
    fun bombaGorultuleri(){
        b1.visibility=View.INVISIBLE
        b2.visibility=View.INVISIBLE
        b3.visibility=View.INVISIBLE
        b4.visibility=View.INVISIBLE
        b5.visibility=View.INVISIBLE
        b6.visibility=View.INVISIBLE
        b7.visibility=View.INVISIBLE
        b8.visibility=View.INVISIBLE
        b9.visibility=View.INVISIBLE
        b10.visibility=View.INVISIBLE
        b11.visibility=View.INVISIBLE
        b12.visibility=View.INVISIBLE
        b13.visibility=View.INVISIBLE
        b14.visibility=View.INVISIBLE
        b15.visibility=View.INVISIBLE
        b16.visibility=View.INVISIBLE
        b17.visibility=View.INVISIBLE
        b18.visibility=View.INVISIBLE
        b19.visibility=View.INVISIBLE
        b20.visibility=View.INVISIBLE
}

    fun b1 (view:View){
        if (b1.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b1.visibility=View.INVISIBLE
            i1.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i1.visibility=View.INVISIBLE

            }


        }
    }
    fun b2 (view:View){
        if (b2.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b2.visibility=View.INVISIBLE
            i2.visibility=View.VISIBLE

            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i2.visibility=View.INVISIBLE

            }


        }

    }
    fun b3 (view:View){
        if (b3.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b3.visibility=View.INVISIBLE
            i3.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i3.visibility=View.INVISIBLE

            }


        }

    }
    fun b4 (view:View){
        if (b4.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b4.visibility=View.INVISIBLE
            i4.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i4.visibility=View.INVISIBLE

            }


        }
    }
    fun b5 (view:View){
        if (b5.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b5.visibility=View.INVISIBLE
            i5.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i5.visibility=View.INVISIBLE

            }


        }
    }
    fun b6 (view:View){
        if (b6.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b6.visibility=View.INVISIBLE
            i6.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i6.visibility=View.INVISIBLE

            }


        }
    }
    fun b7 (view:View){
        if (b7.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b7.visibility=View.INVISIBLE
            i7.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i7.visibility=View.INVISIBLE

            }


        }
    }
    fun b8 (view:View){
        if (b8.visibility==View.VISIBLE){

            score++
            scorText.text="Skorunuz : ${score}"
            b8.visibility=View.INVISIBLE
            i8.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i8.visibility=View.INVISIBLE

            }


        }
    }
    fun b9 (view:View){
        if (b9.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b9.visibility=View.INVISIBLE
            i9.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i9.visibility=View.INVISIBLE

            }


        }
    }
    fun b10 (view:View){
        if (b10.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b10.visibility=View.INVISIBLE
            i10.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i10.visibility=View.INVISIBLE

            }


        }
    }
    fun b11 (view:View){
        if (b11.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b11.visibility=View.INVISIBLE
            i11.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i11.visibility=View.INVISIBLE

            }


        }
    }
    fun b12 (view:View){
        if (b12.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b12.visibility=View.INVISIBLE
            i12.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i12.visibility=View.INVISIBLE

            }


        }

    }
    fun b13 (view:View){
        if (b13.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b13.visibility=View.INVISIBLE
            i13.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i13.visibility=View.INVISIBLE

            }


        }
    }
    fun b14 (view:View){
        if (b14.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b14.visibility=View.INVISIBLE
            i14.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i14.visibility=View.INVISIBLE

            }


        }
    }
    fun b15 (view:View){
        if (b15.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b15.visibility=View.INVISIBLE
            i15.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i15.visibility=View.INVISIBLE

            }


        }
    }
    fun b16 (view:View){
        if (b16.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b16.visibility=View.INVISIBLE
            i16.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i16.visibility=View.INVISIBLE

            }


        }
    }
    fun b17 (view:View){
        if (b17.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b17.visibility=View.INVISIBLE
            i17.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i17.visibility=View.INVISIBLE

            }


        }
    }
    fun b18 (view:View){
        if (b18.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b18.visibility=View.INVISIBLE
            i18.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i18.visibility=View.INVISIBLE

            }


        }
    }
    fun b19 (view:View){
        if (b19.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b19.visibility=View.INVISIBLE
            i19.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i19.visibility=View.INVISIBLE

            }


        }
    }
    fun b20 (view:View){
        if (b20.visibility==View.VISIBLE){
            score++
            scorText.text="Skorunuz : ${score}"
            b20.visibility=View.INVISIBLE
            i20.visibility=View.VISIBLE
            GlobalScope.launch(context = Dispatchers.Main) {
                delay(400)
                i20.visibility=View.INVISIBLE

            }


        }
    }




}