package com.example.segmentedcontrolexperiment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)

        // Setup the TabLayout
        setupTabs()

        // Load the default fragment
        if (savedInstanceState == null) {
            switchFragment(FirstFragment()) // Load FirstFragment by default
        }

        // Tab selection listener
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                when (tab.position) {
                    0 -> switchFragment(FirstFragment())
                    1 -> switchFragment(SecondFragment())
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    private fun setupTabs() {
        // Create tabs for the TabLayout
        tabLayout.addTab(tabLayout.newTab().setText("First Fragment"))
        tabLayout.addTab(tabLayout.newTab().setText("Second Fragment"))
    }

    private fun switchFragment(fragment: Fragment) {
        // Replace the fragment in the FrameLayout
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }
}
