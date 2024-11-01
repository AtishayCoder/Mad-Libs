package com.example.madlibsgenerator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.madlibsgenerator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submitButton.setOnClickListener {
            val noun = binding.noun.text.toString()
            val adjective = binding.adjective.text.toString()
            val verb = binding.verb.text.toString()
            val adverb = binding.adverb.text.toString()
            val pronoun = binding.pronoun.text.toString()
            val preposition = binding.preposition.text.toString()
            binding.resultText.text = getString(
                R.string.once_upon_a_time_lived_a_an_was_the_king_of_animal_lands_and_trees_in_the_american_praries_one_day_got_mad_and_started_ing_all_the_subjects_came_to_the_king_in_anger_he_ate_all_his_subjects_and_died_shortly_after_the_end,
                adjective,
                noun,
                pronoun,
                pronoun,
                verb,
                adverb,
                preposition,
                pronoun
            )
        }
    }
}