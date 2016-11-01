package fik.sample.android.samplevectordrawable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        SubMenu sub = menu.addSubMenu("");
        //getVectorDrawable(); -> untuk mengambil vector dengan warna normal
        sub.setIcon(VectorUtil.getVectorDrawable(getApplicationContext(),R.drawable.ic_more_vert));


        sub.add(0, 0, 0, "Not Tinted (White)")
                //getVectorTintDrawable(); -> untuk mengambil vector dengan warna yang lain
                .setIcon(VectorUtil.getVectorDrawable(getApplicationContext(),R.drawable.ic_settings))
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        return false;
                    }
                });

        sub.add(0, 1, 0, "Tinted")
                //getVectorTintDrawable(); -> untuk mengambil vector dengan warna yang lain
                .setIcon(VectorUtil.getTintVectorDrawable(getApplicationContext(),R.drawable.ic_settings, R.color.icon_grey))
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        return false;
                    }
                });

        sub.add(0, 2, 0, "Tinted Another color")
                .setIcon(VectorUtil.getTintVectorDrawable(getApplicationContext(),R.drawable.ic_settings,R.color.colorPrimary))
                .setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        return false;
                    }
                });

        sub.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
        return super.onCreateOptionsMenu(menu);
    }
}
