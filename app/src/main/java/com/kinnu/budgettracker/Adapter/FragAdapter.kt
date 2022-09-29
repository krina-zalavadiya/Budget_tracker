package com.kinnu.budgettracker.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragAdapter(manager: FragmentManager, title: Array<String>, fragment: Array<Fragment>) :FragmentPagerAdapter(manager){
      var title: Array<String> = title
      var fragment: Array<Fragment> = fragment
    override fun getCount(): Int {
              return fragment.size
    }

    override fun getItem(position: Int): Fragment {

               return fragment.get(position)
    }


    override fun getPageTitle(position: Int): CharSequence? {

        return title.get(position)
    }

}