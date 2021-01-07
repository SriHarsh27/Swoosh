package com.example.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swoosh.Models.Player
import com.example.swoosh.Utilities.EXTRA_PLAYER
import com.example.swoosh.R
import kotlinx.android.synthetic.main.activity_layout.*

class LayoutActivity : BaseActivity() {
    var player = Player(league="",skill="")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout)
    }
    fun leagueNextClicked(view: View){
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }
        else{
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

    fun mensOnClick(view : View){
        womensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "mens"
    }
    fun womensOnClick(view : View){
        mensLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false
        player.league = "womens"
    }
    fun coedOnClick(view : View){
        womensLeagueBtn.isChecked = false
        mensLeagueBtn.isChecked = false
        player.league = "coed"
    }
}