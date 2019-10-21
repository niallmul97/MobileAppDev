package com.example.placemark_v10.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.placemark.models.PlacemarkModel
import com.example.placemark_v10.R
import kotlinx.android.synthetic.main.placemark_activity.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class PlacemarkActivity : AppCompatActivity(), AnkoLogger {


    val placemarks = ArrayList<PlacemarkModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.placemark_activity)
        info("Placemark Activity started..")

        btnAdd.setOnClickListener() {
            var placemark = PlacemarkModel()
            placemark.title = placemarkTitle.text.toString()
            placemark.description = placemarkDescription.text.toString()
            if (placemark.title.isNotEmpty()) {
                info("add Button Pressed: $placemark")
                placemarks.add(placemark)
                info(placemarks)
            }
            else {
                toast ("Please Enter a title")
            }
        }
    }
}