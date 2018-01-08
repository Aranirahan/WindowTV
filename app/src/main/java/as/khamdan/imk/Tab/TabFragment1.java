package as.khamdan.imk.Tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

import as.khamdan.imk.Activity.YoutubeActivity;
import as.khamdan.imk.Adapter.GridviewAdapter;
import as.khamdan.imk.Beanclass.Beanclass;
import as.khamdan.imk.View.ExpandableHeightGridView;
import as.khamdan.imk.Activity.VideoActivity;
import ws.wolfsoft.test4.R;

/**
 * Created by khamdan on 07/01/2017.
 */
public class TabFragment1 extends Fragment {

    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    private View view;

    private int[] IMAGEgrid = {R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4, R.drawable.e5, R.drawable.e6,R.drawable.e1, R.drawable.e2, R.drawable.e3, R.drawable.e4, R.drawable.e5, R.drawable.e6,};
    private String[] TITLeGgrid = {"Autumn", "Waterfall", "Forest",  "Forest", "Sea", "Garden","Autumn", "Waterfall", "Forest",  "Forest", "Sea", "Garden"};
    private String[] DIscriptiongrid = {"15 Videos", "20 Videos", "30 Videos","15 Videos", "15 Videos", "17 Videos","15 Videos", "20 Videos", "30 Videos","15 Videos", "15 Videos", "17 Videos"};
    private String[] Dategrid = {"2 New Videos","1 New Video","5 New Videos", "1 New Video", "No New Video","7 New Videos","2 New Videos","1 New Video","5 New Videos", "1 New Video", "No New Video","7 New Videos"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmenttab1, container, false);

        gridview = (ExpandableHeightGridView)view.findViewById(R.id.gridview);
        beanclassArrayList= new ArrayList<Beanclass>();

        for (int i= 0; i< IMAGEgrid.length; i++) {

            Beanclass beanclass = new Beanclass(IMAGEgrid[i], TITLeGgrid[i], DIscriptiongrid[i], Dategrid[i]);
            beanclassArrayList.add(beanclass);

        }
        gridviewAdapter = new GridviewAdapter(getActivity(), beanclassArrayList);
        gridview.setExpanded(true);

        gridview.setAdapter(gridviewAdapter);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // DO something

                Intent intent = new Intent(getActivity(), VideoActivity.class);
                startActivity(intent);

            }
        });
     return view;
    }


}