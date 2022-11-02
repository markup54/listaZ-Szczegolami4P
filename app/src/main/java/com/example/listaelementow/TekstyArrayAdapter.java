package com.example.listaelementow;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TekstyArrayAdapter extends ArrayAdapter<Miejsca> {
    Context context;
    int layoutId;
    Miejsca dane[] = null;

    public TekstyArrayAdapter(@NonNull Context context,
                              int layoutId,
                              Miejsca[] dane) {
        super(context, layoutId, dane);
        this.context = context;
        this.layoutId = layoutId;
        this.dane = dane;
    }
    static class MiejscaHolder{
        ImageView imageView;
        TextView textView;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View widok = convertView;
        MiejscaHolder holder =null;
        if(widok == null){
            LayoutInflater inflater =
                    ((Activity)context).getLayoutInflater();
            widok = inflater.inflate(layoutId,parent,false);
            holder = new MiejscaHolder();
            holder.imageView = widok.findViewById(R.id.imageView);
            holder.textView = widok.findViewById(R.id.textView);
            widok.setTag(holder);
            widok.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intencja = new Intent((Application)context,
                                    MainActivity2.class);
                        }
                    }
            );

        }
        else{
            holder = (MiejscaHolder) widok.getTag();
        }
        holder.textView.setText(dane[position].getMiejsce());
        holder.imageView.setImageResource(dane[position].getIdObrazka());
        return widok;
    }
}




