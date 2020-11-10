package kr.hs.emirim.s2019w39.optionmenutest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editDegree;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editDegree = findViewById(R.id.edit_degree);
        img1 = findViewById(R.id.img1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item_rotate:
                img1.setRotation(Float.parseFloat(editDegree.getText().toString()));
                return true;
            case R.id.item_solar:
                img1.setImageResource(R.drawable.solar);
                return true;
            case R.id.item_moonstar:
                img1.setImageResource(R.drawable.moonstar);
                return true;
            case R.id.item_hwasa:
                img1.setImageResource(R.drawable.hwasa);
                return true;
        }

        return false;
    }
}