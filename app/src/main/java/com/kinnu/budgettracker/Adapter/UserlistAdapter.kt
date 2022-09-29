package com.kinnu.budgettracker.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kinnu.budgettracker.R
import com.kinnu.budgettracker.Userdata

class UserlistAdapter(list: ArrayList<Userdata>) : RecyclerView.Adapter<UserlistAdapter.UserlistHolder>() {

      var list = list


      class UserlistHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

            var date = itemView.findViewById<TextView>(R.id.date_s)
            var catagerios = itemView.findViewById<TextView>(R.id.categories_s)
            var salary = itemView.findViewById<TextView>(R.id.rupees_s)
      }


      override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserlistHolder {
            return UserlistHolder(LayoutInflater.from(parent.context).inflate(R.layout.showdata,parent,false))

      }

      override fun onBindViewHolder(holder: UserlistHolder, position: Int) {
            holder.date.text = list.get(position).date.toString()
            holder.catagerios.text = list.get(position).Categories.toString()
            holder.salary.text = list.get(position).Salary.toString()
      }

      override fun getItemCount(): Int {
               return list.size
      }
}