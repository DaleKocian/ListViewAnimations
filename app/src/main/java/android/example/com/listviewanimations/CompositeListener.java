package android.example.com.listviewanimations;

import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dkocian on 9/16/2014.
 */
public class CompositeListener implements AdapterView.OnItemClickListener {
    List<AdapterView.OnItemClickListener> listeners = new ArrayList<AdapterView.OnItemClickListener>();
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        for (AdapterView.OnItemClickListener listener : listeners) {
            listener.onItemClick(parent, view, position, id);
        }
    }
    public void registerListener(AdapterView.OnItemClickListener listener) {
        listeners.add(listener);
    }
}