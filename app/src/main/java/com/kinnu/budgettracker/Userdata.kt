package com.kinnu.budgettracker

import java.util.*

class Userdata {

    var id = 0
    var date :String
    lateinit var Categories: String
    lateinit var Salary:String
    lateinit var Extranote: String


     constructor(id:Int, date: String, Categories:String, Salary: String, Extranote:String){

         this.id = id
         this.date = date
         this.Categories = Categories
         this.Salary = Salary
         this.Extranote = Extranote

     }
}