package com.example.nancy.xbike;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.nancy.xbike.model.User;


/**
 * Created by wangjingbo on 1/21/17.
 */

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_info);

        LinearLayout parent = (LinearLayout) findViewById(R.id.parent);
        parent.setHorizontalGravity(Gravity.CENTER);

        for (int i = 0; i < User.wallet.size(); i++) {
            LinearLayout card = new LinearLayout(this);
            card.setOrientation(LinearLayout.VERTICAL);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(500, 300);
            params.setMargins(30,30,30,30);
            card.setLayoutParams(params);
            card.setGravity(Gravity.CENTER);
            card.setBackgroundColor(30-144-255);

            TextView cardNum = new TextView(this);
            cardNum.setGravity(Gravity.CENTER);
            cardNum.setText(User.wallet.get(i).getCardNum());
            TextView name = new TextView(this);
            name.setGravity(Gravity.CENTER);
            name.setText("John Smith");
            card.addView(cardNum);
            card.addView(name);

            parent.addView(card);
        }


        final Intent update = new Intent(this, Payment.class);
        Button add = (Button) findViewById(R.id.addButton);
        add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                User.addCard();
                startActivity(update);
            }
        });

        Button minus = (Button) findViewById(R.id.minusButton);
        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                User.deleteCard();
                startActivity(update);
            }
        });

    }
}


