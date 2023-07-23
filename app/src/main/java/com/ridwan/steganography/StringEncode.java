package com.ridwan.steganography;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class StringEncode extends AppCompatActivity
{
    private TextView encode_txt;
    private TextView viewtext;
    private EditText encode_text;
    private Button encode_btn;
    private EditText finalencodetext;
    private Button copybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_encode);


        //initialized the UI components
        encode_text = findViewById(R.id.encode_text);
        encode_btn = findViewById(R.id.encode_btn);
        finalencodetext = findViewById(R.id.finalencodetext);
        copybutton = findViewById(R.id.encode_copy_btn);

        encode_btn.setOnClickListener(view -> {

            if(encode_text.getText() != null)
            {
                String ascii = String.valueOf(encode_text.getText());
                StringBuilder hex = new StringBuilder();
                for (int i = 0; i < ascii.length(); i++)
                {
                    char ch = ascii.charAt(i);
                    String part = Integer.toHexString(ch);
                    hex.append(part);
                }
                finalencodetext.setText(hex);
            }
            else {
                finalencodetext.setText("No message found");
            }
        });

        copybutton.setOnClickListener(view -> {

            String copy = finalencodetext.getText().toString();
            ClipboardManager clipmanager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip = ClipData.newPlainText("Label",copy);
            clipmanager.setPrimaryClip(clip);
            Toast.makeText(StringEncode.this, "Copied to Clipboard", Toast.LENGTH_SHORT).show();
        });

    }
}
