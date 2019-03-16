package dev.pychocoders.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = findViewById(R.id.button6);
        final EditText num1 = findViewById(R.id.num1);
        final EditText num2 = findViewById(R.id.num2);
        final Spinner op = findViewById(R.id.operator);
        final TextView res = findViewById(R.id.textView);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float a = (Float.parseFloat(num1.getText().toString()));
                float b = (Float.parseFloat(num2.getText().toString()));
                char oper = op.getSelectedItem().toString().charAt(0);
                float result;
                switch(oper){
                    case '+':
                        result = a + b;
                        break;
                    case '-':
                        result = a - b;
                        break;
                    case 'x':
                    case 'X':
                    case '*':
                        result = a * b;
                        break;
                    case '/':
                        result = a / b;
                        break;
                    default:
                        result = 0;
                }
                res.setText(Float.toString(result));
            }
        });

    }
}
