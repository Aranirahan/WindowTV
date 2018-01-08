package as.khamdan.imk.Tab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.ArrayList;

import as.khamdan.imk.Activity.VideoActivity;
import as.khamdan.imk.Activity.YoutubeActivity;
import as.khamdan.imk.Adapter.GridviewAdapter;
import as.khamdan.imk.Beanclass.Beanclass;
import as.khamdan.imk.View.ExpandableHeightGridView;
import ws.wolfsoft.test4.R;
/**
 * Created by khamdan on 07/01/2017.
 */
public class TabFragment3 extends Fragment {


    private ExpandableHeightGridView gridview;
    private ArrayList<Beanclass> beanclassArrayList;
    private GridviewAdapter gridviewAdapter;
    private View view;

    private int[] IMAGEgrid = {R.drawable.z4, R.drawable.z5, R.drawable.z6, R.drawable.z1, R.drawable.z2, R.drawable.z3,R.drawable.z4, R.drawable.z5, R.drawable.z6, R.drawable.z1, R.drawable.z2, R.drawable.z3};
    private String[] TITLeGgrid = {  "America's West", "Bird and Water", "Autumn River","Paradise", "Waterfall World", "For The Forest","America's West", "Bird and Water", "Autumn River","Paradise", "Waterfall World", "For The Forest"};
    private String[] DIscriptiongrid = {"By: Nature R", "By: Healing", "By: Shooting S","By: Macro", "By: Relax 8", "By: Relax NV","By: Nature R", "By: Healing", "By: Shooting S","By: Macro", "By: Relax 8", "By: Relax NV"};
    private String[] Dategrid = {"1 hour", "8 hour","9 hour","2 hours","1 hour","1 hour","1 hour", "8 hour","9 hour","2 hours","1 hour","1 hour"};



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

                Intent intent = new Intent(getActivity(), YoutubeActivity.class);
                startActivity(intent);

            }
        });
        return view;

    }
}