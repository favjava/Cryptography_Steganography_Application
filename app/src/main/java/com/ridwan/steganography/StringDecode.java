package com.ridwan.steganography;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StringDecode extends AppCompatActivity
{
    private EditText decode_text;
    private Button decode_btn;
    private EditText finaldecodetext;
    private Button copybutton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_decode);



        decode_text = findViewById(R.id.decode_text);
        decode_btn = findViewById(R.id.decode_btn);
        finaldecodetext = findViewById(R.id.finaldecodetext);
        copybutton = findViewById(R.id.decode_copy_btn);

        decode_btn.setOnClickListener(view -> {

            if(decode_text.getText() != null)
            {
                String hex = String.valueOf(decode_text.getText());
                StringBuilder ascii = new StringBuilder();
                for (int i = 0; i < hex.length(); i += 2)
                {
                    String part = hex.substring(i, i + 2);
                    char ch = (char)Integer.parseInt(part, 16);
                    ascii.append(ch);
                }
                finaldecodetext.setText(String.valueOf(ascii));

            }
            else {
                finaldecodetext.setText("No message found");
            }
        });

        copybutton.setOnClickListener(view -> {

            String copy = finaldecodetext.getText().toString();
            ClipboardManager clipmanager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("Label",copy);
            clipmanager.setPrimaryClip(clip);
            Toast.makeText(StringDecode.this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
        });

    }
}
