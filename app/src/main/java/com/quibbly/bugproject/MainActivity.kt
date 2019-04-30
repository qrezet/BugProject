package com.quibbly.bugproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragment = ParentFragment()
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(container.id, fragment)
                .setPrimaryNavigationFragment(fragment)
                .commit()
        }
    }

}
