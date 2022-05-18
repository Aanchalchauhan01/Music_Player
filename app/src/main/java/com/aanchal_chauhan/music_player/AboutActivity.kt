package com.aanchal_chauhan.music_player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aanchal_chauhan.music_player.databinding.ActivityAboutBinding
import com.aanchal_chauhan.music_player.databinding.ActivityFeedbackBinding

class AboutActivity : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }
    private fun aboutText(): String{
        return "Developed By: Aanchal Chauhan" +
                "\n\nIf you want to provide feedback, I will love to hear that."
    }
}