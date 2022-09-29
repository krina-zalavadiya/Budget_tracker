package com.kinnu.budgettracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kinnu.budgettracker.Adapter.UserlistAdapter
import com.kinnu.budgettracker.databinding.FragmentTransactionBinding
import com.kinnu.budgettracker.databinding.FragmentCategoriesBinding as FragmentCategoriesBinding1



private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class TransactionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)



        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        var db = Database(context)
        var binding = FragmentTransactionBinding.inflate(layoutInflater)


        var DB = Database(context)

        var list = db.Retrivedata()

        binding.transaction.layoutManager = LinearLayoutManager(context)
        binding.transaction.adapter = UserlistAdapter(list)

        return binding.root

    }

    private fun LinearLayoutManager(transactionFragment: Companion): LinearLayoutManager {
        TODO("Not yet implemented")
    }

    companion object {


        fun newInstance(param1: String, param2: String) =
            TransactionFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)


                }
            }

    }
}