package com.example.android.scoreboardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var scoreteamA : Int=0;
    var scoreteamB : Int=0;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public  fun addonepoint(v:View){
        Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()

        if(scoreteamA<=24){
            scoreteamA=scoreteamA+1
            displayscoreA(scoreteamA)
        }else{
        }


    }
    public  fun addtwopoint(v: View) {
        Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show()
        if (scoreteamA <=23 ){
            scoreteamA=scoreteamA+2
            displayscoreA(scoreteamA)
        }
        else{
        }

    }
    public  fun addthreepoint(v:View){
        Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
        if (scoreteamA<=22){
            scoreteamA = scoreteamA + 3
            displayscoreA(scoreteamA)
        }
        else {
        }
    }
    public  fun displayscoreA( scoreA:Int){
        var points=scoreA
      var score=findViewById<TextView>(R.id.pointA_id)
      score.text=points.toString()

        if (points==25) {
            var teamname = findViewById<TextView>(R.id.wonteam_id)
            teamname.setText("TEAM-A").toString()
        }



   }
    public  fun displayscoreB( scoreB:Int){
        var points=scoreB
        var score=findViewById<TextView>(R.id.pointB_id)
        score.text=points.toString()
        if (points==25) {
            var teamname = findViewById<TextView>(R.id.wonteam_id)
            teamname.setText("TEAM-B").toString()
        }

    }
    public  fun addone(v:View){
        Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
        if (scoreteamB<=24){
            scoreteamB = scoreteamB + 1
            displayscoreB(scoreteamB)
        }
        else { }

    }
    public  fun addtwo(v: View){
        Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
        if (scoreteamB<=23){
            scoreteamB = scoreteamB + 2
            displayscoreB(scoreteamB)
        }
        else { }
    }
    public  fun addthree(v:View){
        Toast.makeText(this,"clicked",Toast.LENGTH_LONG).show()
        if (scoreteamB<=23){
            scoreteamB = scoreteamB + 3
            displayscoreB(scoreteamB)
        }
        else { }
    }
    public  fun reset(v:View){
        scoreteamA=0
        scoreteamB=0
        displayscoreA(scoreteamA)
        displayscoreB(scoreteamB)
        var teamname = findViewById<TextView>(R.id.wonteam_id)
        teamname.setText("Pending").toString()

    }



}