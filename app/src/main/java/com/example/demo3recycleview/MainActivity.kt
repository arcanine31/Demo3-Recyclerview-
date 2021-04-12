package com.example.demo3recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo3recycleview.adapter.OSadapter
import com.example.demo3recycleview.model.SisopModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var OSadapter: OSadapter
    val lm = LinearLayoutManager(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        val listOs: ArrayList<SisopModel> = ArrayList<SisopModel>()

        listOs.add(SisopModel("Android"))
        listOs.add(SisopModel("iPhone"))
        listOs.add(SisopModel("windowsMobile"))
        listOs.add(SisopModel("Blackberry"))
        listOs.add(SisopModel("webOS"))
        listOs.add(SisopModel("ubuntu"))
        listOs.add(SisopModel("Windows7"))
        listOs.add(SisopModel("Mac OS x"))

        rv_OS.layoutManager = lm
        OSadapter = OSadapter(this)
        rv_OS.adapter = OSadapter
        OSadapter.setList(listOs)
    }


}