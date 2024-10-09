package junior.correa.nascimento.rubens.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_next);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Obtém a intent passada na solucitação ao sistema operacional
        Intent i = getIntent();
        // Obtém valor passado pela intent através do 'Extra' de nome 'text', atribuindo à variável text_pass_by_intent
        String text_pass_by_intent = i.getStringExtra("text");
        // Obtém elemento de TextView através função findViewById presente classe AppCompatActivity e guarda na variável tvText
        TextView tvText = this.findViewById(R.id.tvText);
        // Muda texto do elemento - que é referenciado pela variável tvText - para o valor da variável text_pass_by_intent
        tvText.setText(text_pass_by_intent);
    }
}