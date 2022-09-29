package com.kinnu.budgettracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kinnu.budgettracker.Adapter.FragAdapter
import com.kinnu.budgettracker.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    var fragment = arrayOf(SpendingFragment(),TransactionFragment(),CategoriesFragment())
    var title = arrayOf("SPENDING","TRANSACTION","CATEGORIES")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

         var binding = ActivityMain2Binding.inflate(layoutInflater)
         setContentView(binding.root)

         binding.Tab.addTab(binding.Tab.newTab().setText("SPENDING"))
         binding.Tab.addTab(binding.Tab.newTab().setText("TRANSACTION"))
         binding.Tab.addTab(binding.Tab.newTab().setText("CATEGORIES"))


         var Adapter =  FragAdapter(supportFragmentManager,title,fragment)
          binding.vpFargment.adapter = Adapter
          binding.Tab.setupWithViewPager(binding.vpFargment)
    }
}