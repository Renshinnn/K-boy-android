package com.example.kalkulatorbyk_boy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var editBilangan1:EditText
    private lateinit var editBilangan2:EditText
    private lateinit var viewHasil:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editBilangan1 = findViewById(R.id.input_1)
        editBilangan2 = findViewById(R.id.input_2)
        viewHasil = findViewById(R.id.tv_hasil)

        val buttonTambah:Button = findViewById(R.id.btn_tambah)
        val buttonKurang:Button = findViewById(R.id.btn_kurang)
        val buttonKali:Button = findViewById(R.id.btn_kali)
        val buttonBagi:Button = findViewById(R.id.btn_bagi)

        buttonTambah.setOnClickListener(this)
        buttonKurang.setOnClickListener(this)
        buttonKali.setOnClickListener(this)
        buttonBagi.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.btn_tambah ->{
                    val hasilTambah = editBilangan1.text.toString().trim().toDouble() + editBilangan2.text.toString().toDouble()
                    viewHasil.text = hasilTambah.toString()
                }
                R.id.btn_kurang ->{
                    val hasilKurang = editBilangan1.text.toString().trim().toDouble() - editBilangan2.text.toString().toDouble()
                    viewHasil.text = hasilKurang.toString()
                }
                R.id.btn_kali ->{
                    val hasilKali = editBilangan1.text.toString().trim().toDouble() * editBilangan2.text.toString().toDouble()
                    viewHasil.text = hasilKali.toString()
                }
                R.id.btn_bagi ->{
                    val hasilBagi = editBilangan1.text.toString().trim().toDouble() / editBilangan2.text.toString().toDouble()
                    viewHasil.text = hasilBagi.toString()
                }
                R.id.btn_modulus ->{
                    val hasilMod = editBilangan1.text.toString().trim().toDouble() % editBilangan2.text.toString().toDouble()
                    viewHasil.text = hasilMod.toString()
                }
                R.id.btn_clear ->{
                    val input1_clear = editBilangan1.text.clear()
                    val input2_clear = editBilangan2.text.clear()
                    viewHasil.text.toString()
                }

            }
        }
    }

}
