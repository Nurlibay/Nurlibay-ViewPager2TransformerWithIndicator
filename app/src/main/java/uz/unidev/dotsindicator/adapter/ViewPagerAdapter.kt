package uz.unidev.dotsindicator.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import uz.unidev.dotsindicator.pages.*

class ViewPagerAdapter(fA: FragmentActivity) : FragmentStateAdapter(fA) {

    override fun getItemCount() = 5

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> PageA()
            1 -> PageB()
            2 -> PageC()
            3 -> PageD()
            4 -> PageE()
            else -> { PageA() }
        }
    }
}