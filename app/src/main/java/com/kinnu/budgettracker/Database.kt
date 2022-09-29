package com.kinnu.budgettracker

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.core.content.contentValuesOf

class Database(
    context: Context?,

    ) : SQLiteOpenHelper(context, "base.db", null, 1) {

    var context = context
    override fun onCreate(p0: SQLiteDatabase?) {
        var que =
            "CREATE TABLE Money(id INTEGER PRIMARY KEY AUTOINCREMENT,date TEXT,Categories TEXT,Salary TEXT,Extranote TEXT)"
        p0?.execSQL(que)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

    fun Insertdata(date: String, Categories: String, Salary: String, Extranote: String) {

        var db = writableDatabase
        var values = contentValuesOf()
        values.put("date", date)
        values.put("Categories", Categories)
        values.put("Salary", Salary)
        values.put("Extranote", Extranote)
    }

    fun Retrivedata(): ArrayList<Userdata> {

        var db = readableDatabase
        var que = "SELECT * FROM Money"
        var cursor: Cursor = db.rawQuery(que, null)
        cursor.moveToFirst()


        var datalist = ArrayList<Userdata>()
        for (i in 0..cursor.count-1){
            var id = cursor.getInt(0)
            var date = cursor.getString(1)
            var Categories = cursor.getString(2)
            var Salary = cursor.getString(3)
            var Extranote = cursor.getString(3)

            var userData = Userdata(id, date, Categories, Salary,Extranote)
            datalist.add(userData)
            cursor.moveToNext()
        }
        return datalist
    }
}