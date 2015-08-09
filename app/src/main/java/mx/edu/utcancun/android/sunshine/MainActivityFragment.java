package mx.edu.utcancun.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        String [] datos= {
                "Lunes     - Soleado   - 25*/18*",
                "Martes    - Nublado   - 25*/18*",
                "Miercoles - Tormenta  - 25*/18*",
                "Jueves    - Lluvioso  - 25*/18*",
                "Viernes   - Nublado   - 25*/18*",
                "Sabado    - Tormenta  - 25*/18*",
                "Domingo   - Luvioso   - 25*/18*"
        };

        List<String> lista = new ArrayList<String>(Arrays.asList(datos));
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_texview,
                lista

        );
        ListView listView = (ListView)rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);

        return rootView;
    }
}
