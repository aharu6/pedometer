package com.example.halloandroidfromnoproject

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private var stepCount = 0
    private lateinit var tvStepCount :TextView
    private lateinit var btnCount:Button
    private lateinit var btnReset:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //UI要素の取得
        val tvStepCount = findViewById<TextView>(R.id.tcStepCount)
        val btnCount = findViewById<Button>(R.id.btnCount)
        val btnReset = findViewById<Button>(R.id.btnReset)

        //カウントボタンのクリックリスナーの設定
        btnCount.setOnClickListener {
            //歩数をカウントするメソッド
            stepCount++
            //歩数を表示するメソッド
            val stepCountText = getString(R.string.step_count_label,stepCount)
            tvStepCount.text = stepCountText
        }
        //リセットボタンのクリックリスナーの設定{
        btnReset.setOnClickListener {
            stepCount = 0
             //歩数を表示するメソッド
            val stepCountText = getString(R.string.step_count_label,stepCount)
            tvStepCount.text = stepCountText
        }

    }

}
