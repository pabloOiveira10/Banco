package com.example.etimrelativelayout

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vinaygaba.creditcardview.CreditCardView
import com.example.etimrelativelayout.databinding.ActivityFaturaBinding
import com.vinaygaba.creditcardview.CardType

class Fatura : AppCompatActivity() {
    private lateinit var binding : ActivityFaturaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fatura)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val cartao : CreditCardView = binding.cartao

        cartao.cardNumber = "4543 4256 7985 4068"
        cartao.cardName = "MATHEUS T QUEIROZ"
        cartao.expiryDate = "07/2029"
        cartao.type = CardType.VISA
    }
}