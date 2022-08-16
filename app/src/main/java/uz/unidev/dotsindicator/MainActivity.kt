package uz.unidev.dotsindicator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.unidev.dotsindicator.databinding.ActivityMainBinding
import uz.unidev.dotsindicator.adapter.ViewPagerAdapter
import uz.unidev.dotsindicator.transformer.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewPager by lazy { ViewPagerAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dotsIndicator = binding.dotsIndicator
        val viewPager2 = binding.viewPager2
        viewPager2.adapter = viewPager
        dotsIndicator.attachTo(viewPager2)

        viewPager2.setPageTransformer(Pager2_ZoomOutTransformer())
    }
}