package com.atager.echo_app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnCopy;
    private EditText etInput;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnCopy = findViewById(R.id.button_copy);
        etInput = findViewById(R.id.edit_text_input);
        tvResult = findViewById(R.id.text_view_result);

        setupButtonEventListener();
    }

    private void setupButtonEventListener() {
        btnCopy.setOnClickListener((listener) ->
                tvResult.setText(etInput.getText())
        );
    }
}