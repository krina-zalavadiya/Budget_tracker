package com.kinnu.budgettracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kinnu.budgettracker.Adapter.UserlistAdapter
import com.kinnu.budgettracker.databinding.FragmentCategoriesBinding as FragmentCategoriesBinding1
import kotlin.Any as Any1

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class CategoriesFragment : Fragment() {
    // TODO: Rename


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            var param1 = it.getString(ARG_PARAM1)
            var param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var binding = FragmentCategoriesBinding1.inflate(layoutInflater)

        var db = Database(context)
        binding.save.setOnClickListener {


            var d = binding.Date.text.toString()
            var c = binding.Categories.text.toString()
            var s = binding.Salary.text.toString()
            var e = binding.Extranote.text.toString()


            db.Insertdata(d,c,s,e)


        }

        return binding.root

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false)




    }



    companion object {

        fun newInstance(param1: String, param2: String) =
            CategoriesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }


    }


}