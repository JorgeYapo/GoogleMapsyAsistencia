package jlyv.upeu.edu.pe.googlemaps.drawnavrecyclerview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import jlyv.upeu.edu.pe.googlemaps.R;
import jlyv.upeu.edu.pe.googlemaps.dao.EventoDao;
import jlyv.upeu.edu.pe.googlemaps.to.EventoTO;
import jlyv.upeu.edu.pe.googlemaps.util.EventoAdapter;
//import pe.edu.upeu.dao.EventoDao;
//import pe.edu.upeu.to.EventoTO;
//import pe.edu.upeu.util.EventoAdapter;


public class ReporteFragment extends Fragment {
    private EventoDao dao;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter<EventoAdapter.EventoViewHolder> adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View myFragmentView= inflater.inflate(R.layout.fragment_reporte, container, false);

        this.recyclerView=(RecyclerView)myFragmentView.findViewById(R.id.recyclerView);
        this.layoutManager = new LinearLayoutManager(this.getContext());
        dao=new EventoDao(this.getContext());
        List<EventoTO> evento=dao.ListarEvento();
        Log.v("DMP", "Cantidad: "+evento.size());
        this.adapter=new EventoAdapter(evento);
        this.recyclerView.setLayoutManager(layoutManager);
        this.recyclerView.setAdapter(adapter);

        return myFragmentView;
    }


}
