package com.yeminnaing.grocerypos

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.yeminnaing.grocerypos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolBar)
        setUpDrawerLayout()
    }

    private fun setUpDrawerLayout() {
        val toggle = ActionBarDrawerToggle(
            this,
            binding.drawerLayout,
            binding.toolBar,
            R.string.drawer_open, R.string.drawer_close
        )
        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navView.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_admin -> {
                Toast.makeText(this, "Admin", Toast.LENGTH_SHORT).show()
                binding.drawerLayout.closeDrawer(GravityCompat.START)
            }

            R.id.nav_cashier -> {
                Toast.makeText(this, "Cashier", Toast.LENGTH_SHORT).show()
            }

            R.id.nav_about -> {
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show()
            }
        }

        return true
    }
}