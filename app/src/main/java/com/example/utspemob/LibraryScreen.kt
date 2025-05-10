package com.example.utspemob

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LibraryScreen : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var carList: ArrayList<Car>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        recyclerView = findViewById(R.id.recyclerViewMotor)

        carList = arrayListOf(
            Car(name = "Nissan Silvia S15", genres = " Favorit Gw | Role | Tokyo", R.drawable.silvia),
            Car(name = "Nissan GTR R35", genres = " WAW | Style | Kyoto", R.drawable.gtr),
            Car(name = "RX 7", genres = " Yaelah | Role | Osaka", R.drawable.rxseven),
            Car(name = "Subaru Impreza 22B STi", genres = " Daily | Role | Hirosima", R.drawable.subaru),
            Car(name = "Toyota Supra MK4", genres = " Bjirr | Role | Yokohama", R.drawable.supra),
            Car(name = "Suzuki Estilo", genres = " Kyah | Role | Kobe", R.drawable.estilo),
            Car(name = "Datsun 240Z", genres = " Aww | Role | Saitama", R.drawable.datsun)
        )

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = CarAdapter(this, carList)
    }
}
