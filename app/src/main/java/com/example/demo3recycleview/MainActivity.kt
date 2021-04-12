package com.example.demo3recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo3recycleview.adapter.ListOSAdapter
import com.example.demo3recycleview.adapter.OSadapter
import com.example.demo3recycleview.model.SisopModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var OSadapter: OSadapter
    lateinit var ListOSAdapter: ListOSAdapter
    val lm = LinearLayoutManager(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {


        val listOs: ArrayList<SisopModel> = ArrayList<SisopModel>()

        listOs.add(SisopModel("Android",R.drawable.globe))
        listOs.add(SisopModel("iPhone",R.drawable.icon_black))
        listOs.add(SisopModel("windowsMobile",R.drawable.bbb))
        listOs.add(SisopModel("Blackberry",R.drawable.globe))
        listOs.add(SisopModel("webOS",R.drawable.bbb))
        listOs.add(SisopModel("ubuntu",R.drawable.icon_black))
        listOs.add(SisopModel("Windows7",R.drawable.bbb))
        listOs.add(SisopModel("Mac OS x",R.drawable.globe))

        rv_OS.layoutManager = lm
        OSadapter = OSadapter(this)
        rv_OS.adapter = OSadapter
        OSadapter.setList(listOs)
    }


}