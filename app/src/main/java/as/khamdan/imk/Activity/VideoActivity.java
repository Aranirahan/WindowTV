package as.khamdan.imk.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.ArrayList;
import java.util.HashMap;

import as.khamdan.imk.Adapter.ListbaseAdapter;
import as.khamdan.imk.Beanclass.BeanclassVid;
import ws.wolfsoft.test4.R;

/**
 * Created by khamdan on 07/01/2017.
 */
public class VideoActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener {
    //SliderLayout mDemoSlider;

    private ListView list;
    private ArrayList<BeanclassVid> Bean;
    private ListbaseAdapter baseAdapter;
    public ImageView night;

    private int[] IMAGE = {R.drawable.v1, R.drawable.v2, R.drawable.v3, R.drawable.v4, R.drawable.v5, R.drawable.v6,R.drawable.v1, R.drawable.v2, R.drawable.v3, R.drawable.v4, R.drawable.v5, R.drawable.v6};

    private String[] TITLE = {"World's Paradise", "Waterfall World", "For The Forest", "America's West", "Bird and Water", "Autumn River","World's Paradise", "Waterfall World", "For The Forest", "America's West", "Bird and Water", "Autumn River"};

    private String[] SUBTITLE = {"By: Nature R", "By: Healing", "By: Shooting S", "By: Macro", "By: Relax 8", "By: Relax NV","By: Nature R", "By: Healing", "By: Shooting S", "By: Macro", "By: Relax 8", "By: Relax NV"};

    private String[] SHOP = {"2 hours", "1 hour", "1 hour", "1 hour", "8 hour", "9 hour","2 hours", "1 hour", "1 hour", "1 hour", "8 hour", "9 hour"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        night = findViewById(R.id.iv_night);
        night = findViewById(R.id.iv_night);
        night.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(VideoActivity.this, "Night Mode On", Toast.LENGTH_SHORT).show();
            }
        });
        list = (ListView) findViewById(R.id.list);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent intent = new Intent(VideoActivity.this, VideoActivity.class);
                startActivity(intent);

            }
        });
//        *****listview*******

        Bean = new ArrayList<BeanclassVid>();

        for (int i = 0; i < TITLE.length; i++) {

            BeanclassVid bean = new BeanclassVid(IMAGE[i], TITLE[i], SUBTITLE[i], SHOP[i]);
            Bean.add(bean);
        }

        baseAdapter = new ListbaseAdapter(VideoActivity.this, Bean) {

        };

        list.setAdapter(baseAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Intent newActivity = new Intent(VideoActivity.this, YoutubeActivity.class);
                startActivity(newActivity);
            }
        });
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

    }

}


