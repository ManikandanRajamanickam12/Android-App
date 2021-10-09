package com.example.android.scoreboard_login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.android.scoreboard_login.databinding.FragmentScoreBinding


class ScoreFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentScoreBinding>(
            inflater,
            R.layout.fragment_score,
            container,
            false
        )
        val button: List<Button> = listOf(
            binding.oneAId,
            binding.twoAId,
            binding.threeAId,
            binding.oneBId,
            binding.twoBId,
            binding.threeBId,
            binding.reset
        )
        val pointsA = binding.pointAId
        val pointsB = binding.pointBId
        val winteam = binding.wonteamId
        for (buttons in button) {
            buttons.setOnClickListener { displayscore(it as Button, pointsA, pointsB, winteam) }
        }
        return binding.root
    }

    private fun displayscore(
        Button: Button,
        pointsA: TextView,
        pointsB: TextView,
        winteam: TextView
    ) {
        var scoreteamA = Integer.parseInt(pointsA.text.toString())
        var scoreteamB = Integer.parseInt(pointsB.text.toString())
        if (scoreteamA==24){
            winteam.setText("Team-A")
        }
        if (scoreteamB==24){
            winteam.setText("Team-B")
        }
        when (Button.id) {

            R.id.oneA_id -> {
                if (scoreteamA <= 24) {
                    pointsA.text = (scoreteamA + 1).toString()
                }
            }
            R.id.twoA_id -> {
                if (scoreteamA <= 23) {
                    pointsA.text = (scoreteamA + 2).toString()
                }
            }
            R.id.threeA_id -> {
                if (scoreteamA <= 22) {
                    pointsA.text = (scoreteamA + 3).toString()
                }
            }
            R.id.oneB_id -> {
                if (scoreteamB <= 24) {
                    pointsB.text = (scoreteamB + 1).toString()
                }
            }
            R.id.twoB_id -> {
                if (scoreteamB <= 23) {
                    pointsB.text = (scoreteamB + 2).toString()
                }
            }
            R.id.threeB_id -> {
                if (scoreteamB <= 22) {
                    pointsB.text = (scoreteamB + 3).toString()
                }
           }
            R.id.reset -> {
                pointsA.setText("0")
                pointsB.setText("0")
                winteam.setText("Pending")
            }


        }
    }
}