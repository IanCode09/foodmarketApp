package com.lexical.foodmarketapp.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.lexical.foodmarketapp.ui.home.newtaste.HomeNewTasteFragment
import com.lexical.foodmarketapp.ui.home.popular.HomePopularFragment
import com.lexical.foodmarketapp.ui.home.recommended.HomeRecommendedFragment
import com.lexical.foodmarketapp.ui.profile.account.ProfileAccountFragment
import com.lexical.foodmarketapp.ui.profile.foodmarket.ProfileFoodmarketFragment

class SectionPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "Account"
            1 -> "Food Market"
            else -> ""
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment

        return when(position) {
            0 -> {
                fragment = ProfileAccountFragment()
                return fragment
            }
            1 -> {
                fragment = ProfileFoodmarketFragment()
                return fragment
            }
            else -> {
                fragment = ProfileFragment()
                return fragment
            }
        }
    }
}