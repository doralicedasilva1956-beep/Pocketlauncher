package com.pocket.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Criando uma tela simples de boas-vindas
        TextView text = new TextView(this);
        text.setText("Pocket Launcher\nPronto para o Minecraft");
        text.setTextSize(24);
        text.setTextColor(Color.CYAN);
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
